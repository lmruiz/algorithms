package com.innovarit.algorithms.simplelinkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListManagerTest {

	@Test
	public void lenghtZero() {
		LinkedListManager linkedListManager = new LinkedListManager();
		assertEquals(0,linkedListManager.listLength(null));
	}
	
	@Test
	public void lengthIncrease(){
		LinkedListManager linkedListManager = new LinkedListManager();
		assertEquals(0,linkedListManager.listLength(null));
		
		ListNode headNode = null;
		ListNode nodeToInsert = new ListNode(1);
		headNode=linkedListManager.insertInLinkedList(headNode, nodeToInsert, 1);
		assertEquals(1,linkedListManager.listLength(headNode));
		
		
		ListNode nodeToInsert2 = new ListNode(2);
		headNode=linkedListManager.insertInLinkedList(headNode, nodeToInsert2, 1);
		assertEquals(2,linkedListManager.listLength(headNode));
		
		ListNode nodeToInsert3 = new ListNode(3);
		headNode=linkedListManager.insertInLinkedList(headNode, nodeToInsert3, 1);
		assertEquals(3,linkedListManager.listLength(headNode));
	}
}
