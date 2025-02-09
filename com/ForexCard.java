package com;

public class ForexCard extends Card{
	String rootCurrency,targetCurrency;
	public void loadMoney()
	{
		System.out.println("load the money from your bank account to forexCard");
	}
	public void convertCurrency()
	{
		System.out.println("Convert the currency from root to target.");
	}

}
