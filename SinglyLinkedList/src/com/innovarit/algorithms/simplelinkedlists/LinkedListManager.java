package com.innovarit.algorithms.simplelinkedlists;

/**
 * Class where the basic Linked List Operations are Implemented
 * @author luisruiz
 *
 */
public class LinkedListManager {
	
	/**
	 * Method Used to get the lenght of a List
	 * @param headNode The head node of the List
	 * @return
	 */
	int listLength(ListNode headNode){
		int length = 0;
		ListNode currentNode = headNode;
		while (currentNode != null){
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	
	/**
	 * Method used to insert a Node in the middle of the list
	 * @param headNode
	 * @param nodeToInsert
	 * @param position
	 * @return
	 */
	ListNode insertInLinkedList (ListNode headNode, ListNode nodeToInsert, int position ){
		if(headNode == null){ //the list is null and it's inserting at the beginning 
			return nodeToInsert;
		}
		
		int size = listLength(headNode);
		if(position > size +1 || position < 1){ //Invalid position to insert
			System.out.println("Position of node to insert is invalid. The valid Inputs are 1 to "+(size +1));
			return headNode;
		}
		if (position == 1){ // inserting the node in the beginning
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		}else{
			//Inserting Node in the middle or end
			ListNode previousNode = headNode;
			int count = 1;
			while(count> position -1 ){ // Positioning cursor where the node is going to be inserted
				previousNode = previousNode.getNext();
				count++;
			}
			
			//Making the link to the corresponding Node
			ListNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}		
		return headNode;
	}
	
	/**
	 * Method used to delete an specific Node in the list
	 * @param headNode
	 * @param position
	 * @return
	 */
	ListNode deleteNodeFromLinkedList(ListNode headNode, int position){
		int size = listLength(headNode);
		
		//Validating position exist in the node
		if(position > size || position < 1){
			System.out.println("Position of the node to delete is invalid. The valid inputs are 1 to "+size);
			return headNode;
		}
		
		if(position == 1){ //deleting the node in the beginning of the list
			ListNode currentNode = headNode.getNext();
			headNode = null;
			return currentNode;
		}else{
			ListNode previousNode = headNode;
			int count = 1;
			while (count < position){ //Positioning cursor in the node to delete
				previousNode = previousNode.getNext();
				count++;
			}
			//Changing the value of the cursors to delete the specified node
			ListNode currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode = null;
		}
		
		return headNode;
	}
	
	void printLinkedList (ListNode head){
		
		int count = 1;
		while (head != null){
			System.out.print(head.getData());
			System.out.print(",");
			count++;
			head = head.getNext();
		}
	}
	
}
