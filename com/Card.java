package com;

public class Card {
	long cardNo;
	String expDate,custName,bankName;
	int cvv;
	public void swipe()
	{
		System.out.println("Swipe thecard");
	}
	public void withdraw()
	{
		System.out.println("Withdraw money using card.");
	}

}
