package com.innovarit.algorithms.simplelinkedlists;

public class LinkedListProblems {
	
	
	ListNode reverseList (ListNode headNode){
		if(headNode == null || headNode.getNext()==null){
			return headNode;
		}
		
		while(headNode.getNext()!=null){
			headNode = headNode.getNext();
		}
		
		return null;
	}
}
