package com.innovarit.algorithms.doublelinkedlists;

public class DoubleLinkedListManager {

	DLLNode DLLInsert(DLLNode headNode, DLLNode nodeToInsert, int position){
		
		if(headNode==null){//List is empty, inserting at the beginning
			return nodeToInsert; // The node to insert is the new headNode
		}
		int size=getDLLLength(headNode);
		return headNode;
	}

	private int getDLLLength(DLLNode headNode) {
		int count=0;
		
		DLLNode tmp=headNode;
		if(headNode==null){
			return 0;
		}
		while (tmp.getNext()!=null){
			count++;
			tmp=tmp.getNext();
		}
		return count;
	}
	
	
}
