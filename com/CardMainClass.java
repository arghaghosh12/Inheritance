package com;

public class CardMainClass {

	public static void main(String[] args) {
		ForexCard fx=new ForexCard();
		fx.custName="Argha";
		fx.bankName="PNB";
		fx.cardNo=12345678;
		fx.cvv=123;
		fx.loadMoney();
		fx.rootCurrency ="INR";
		fx.targetCurrency="EURO";
		fx.swipe();
		fx.withdraw();
		System.out.println(fx.cardNo+" "+ fx.bankName+" "+fx.custName+" "+fx.rootCurrency+" "+fx.targetCurrency);
		fx.loadMoney();
		fx.convertCurrency();

	}

}
