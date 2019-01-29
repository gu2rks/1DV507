package aa224iu_assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import aa224iu_assign2.Exercise_1.LinkedQueue;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import Java2.JunitTest.MyMath;

class LinkedQueueTest {
	LinkedQueue link = new LinkedQueue();

	public static int beforeEach = 1;
	public static int afterEach = 1;
	
	@BeforeEach //to be executed before each test
	public void setup() {
		System.out.println("@BeforeEach: " + beforeEach++);
	}
	
	@AfterEach //to be executed after each test
	public void tearDown() {
		System.out.println("@AfterEach: " + afterEach++);
	}
	
	@Test
	public void sizeTest() {
		// test if the size method keeps track of the number of elements in the queue
		assertEquals(0, link.size());
		// assertTrue(link.isEmpty());
		link.enqueue(1);
		link.enqueue(2);
		assertEquals(2, link.size());
	}

	@Test
	public void isEmptyTest() {
		// test if the isEmpty method keeps track of number of elements in the queue
		assertTrue(link.isEmpty());
		link.enqueue(3);
		link.enqueue(4);
		link.dequeue();
		assertFalse(link.isEmpty());
	}

	@Test
	public void enqueueTest() {
		// test the enqueue method by checking its size
		link.enqueue(2);
		link.enqueue(3);
		link.enqueue(6);
		link.enqueue(8);
		assertEquals(4, link.size());
		assertFalse(link.isEmpty());

		// test for large numbers
		link.enqueue(45000);
		link.enqueue(54000);
		assertEquals(54000, link.last());
	}

	@Test
	public void dequeueTest() {
		// test the dequeue method by checking its size and if it isEmpty
		// link.dequeue();
		link.enqueue(2);
		link.enqueue(3);
		link.enqueue(4);
		link.enqueue(5);
		link.dequeue();
		link.dequeue();
		assertEquals(2, link.size());
		assertEquals(4, link.first());

		link.dequeue();
		link.dequeue(); // now the queue is empty
		assertTrue(link.isEmpty());
	}

	@Test
	public void firstTest() {
		// test the first method if it gives us the correct element
		link.enqueue(1);
		link.enqueue(3);
		link.enqueue(5);
		assertEquals(1, link.first());

		// test for exception
		link.dequeue();
		link.dequeue();
		link.dequeue(); // now my queue is empty so it should throw an exception
		assertThrows(IllegalArgumentException.class, () -> link.first());

	}

	@Test
	public void lastTest() {
		// test standard cases
		link.enqueue(2);
		link.enqueue(4);
		link.enqueue(6);
		assertEquals(6, link.last());

		// test for exception
		link.dequeue();
		link.dequeue();
		link.dequeue(); // now my queue is empty so it should throw an exception
		assertThrows(IllegalArgumentException.class, () -> link.last());
	}

	@Test
	public void IteratorTest() {
		link.enqueue(5);
		link.enqueue(10);
		link.enqueue(15);
		Iterator<Object> obj = link.iterator();
		assertTrue(obj.hasNext());
	}

	@Test
	public void toStringTest() {
		link.enqueue(10);
		link.enqueue(20);
		link.enqueue(30);
		assertEquals("[10 20 30 ]", link.toString());
	}

}
