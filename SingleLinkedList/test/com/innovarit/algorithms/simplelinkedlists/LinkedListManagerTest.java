package com.innovarit.algorithms.simplelinkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListManagerTest {

	@Test
	public void lenghtZero() {
		LinkedListManager linkedListManager = new LinkedListManager();
		assertEquals(0,linkedListManager.listLength(null));
	}

}
