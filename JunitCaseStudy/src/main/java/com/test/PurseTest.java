package com.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.junit.Purse;

class PurseTest {

	@Test
	void testGetCapacity() {
		Purse purse = new Purse();
		Assert.assertEquals("This should be equal to 100",100,purse.getCapacity());
	}
	
	@Test
	void testSize() {
		Assert.assertArrayEquals("the array needs to be 1,1,1", new int[] {1,1,1}, new int[] {1,1,1});
	}
	
	@Test
	void testCount() {
		Assert.assertTrue(true);
	}
	
	@Test
	void test1() {
		Assert.assertEquals("this word", "this word");
	}
	
	@Test
	void test2() {
		Assert.assertEquals(12.25f, 12.25f);
	}
	
	@Test
	void test3() {
		Assert.assertNotEquals("this", "word");
	}
	
	@Test
	void test4() {
		Assert.assertNull(null);
	}
	
	@Test
	void test5() {
		Object obj1=null, obj2=null;
		Assert.assertSame(obj1, obj2);
	}
	
}
