public class Coin {
	int value;
	public Coin(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}


package com.junit;

import java.util.ArrayList;

public class Purse {

	ArrayList<Coin> coins;
	int count;
	int capacity;
	
	public Purse() {
		coins = new ArrayList<>();
		count =0;
		capacity=100;
	}
	
	public Purse(int capacity) {
		coins = new ArrayList<>();
		count = 0;
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public int getBalance() {
		int balance = 0;
		for(Coin c: coins) {
			balance += c.value;
		}
		return balance;
	}
		
	public boolean isFull() {
		if (count==capacity) {
			return true;
		}
		return false;
	}
	
	public void insertCoin(Coin coin) {
		coins.add(coin);
		count++;
	}
	
	public void withdrawCoin(Coin coin) {
		int index=-1;
		
		for(Coin c: coins) {
			if(c.value == coin.value) {
				index = coins.indexOf(c);
			}
		}
		
//		System.out.println("Removal = " +coins.remove(coin) );
		System.out.println("remove = " + 
		coins.remove(index));
		count--;
		System.out.println("count = " + count);
		
	}
	
	int count(Coin coin) {
		int temp=0;
		for (int i=0; i<coins.size(); i++) {
			if (coins.get(i).value == coin.value) {
				temp++;
			}
		}
		return temp;
	}
	public int size() {
		return capacity;
	}
}



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
