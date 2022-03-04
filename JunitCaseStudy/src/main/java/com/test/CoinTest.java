package com.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.junit.Coin;

import junit.framework.Assert;

class CoinTest {

	@Test
	void testCoin() {
		fail("Not yet implemented");
	}

	@Test
	void testGetValue() {
		Coin coin = new Coin(10);
		Assert.assertEquals("It should be equal to 10",10, coin.getValue());
	}

	@Test
	void testSetValue() {
		fail("Not yet implemented");
	}

}
