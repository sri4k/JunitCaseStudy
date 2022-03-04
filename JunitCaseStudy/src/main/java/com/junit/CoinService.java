package com.junit;

public class CoinService {

	public static void main(String[] args) {
		Purse purse = new Purse();
		System.out.println(purse.size());
		
		purse.insertCoin(new Coin(5));
		purse.insertCoin(new Coin(5));
		purse.insertCoin(new Coin(10));
		purse.insertCoin(new Coin(10));
		purse.insertCoin(new Coin(1));
		purse.insertCoin(new Coin(1));
		purse.insertCoin(new Coin(1));
		
		System.out.println(purse.count(new Coin(1)));
		System.out.println(purse.getBalance());
		System.out.println(purse.isFull());
		
		purse.withdrawCoin(new Coin(10));
		System.out.println(purse.getBalance());
		
	}

}
