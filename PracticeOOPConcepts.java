package oOPs;

class Payment{
	
	 void makePayment(double amount){
		System.out.println("Processing generic payment of "+amount);
	}
	 void makePayment(double amount, String currency) {
		 System.out.println("Processing generic payment of " +amount+ " in "+currency);
	 }
	 void getPaymentType() {
		 System.out.println("Generic Payment");
	 }
}

class CreditCardPayment extends Payment{
	void makePayment(double amount){
		System.out.println("Processing credit card payment of "+amount);
	}
	
	void makePayment(double amount, String cardNumber) {
		System.out.println("Paid"+amount+" using card ending with "+cardNumber);
	}
	void getPaymentType() {
		System.out.println("Credit Card Payment");
	}
}

class UPIPayment extends Payment{
	void makePayment(double amount) {
		System.out.println("Processing UPI payment of"+amount);
	}
	
	void makePayment(double amount, String upiId, boolean isVerified) {
		if(isVerified== true) {
			System.out.println("UPI Payment successful for $upiId");
		}
		else
			System.out.println("UPI ID not verified!");
	}
	void getPaymentType() {
		System.out.println("UPI Payment");
	}
}

class CryptoPayment extends Payment{
	void makePayment(double amount) {
		System.out.println("Processing BitCoin payment of"+amount);
	}
	
	 void getPaymentType() {
		 System.out.println("BitCoin Payment");
	 }
	
}


public class PracticeOOPConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment P = new Payment();
		CreditCardPayment cc= new CreditCardPayment();
		UPIPayment UPI = new UPIPayment();
		
		P.makePayment(3000);
		P.makePayment(5000.00, "INR");
		
		cc.makePayment(4500.67);
		cc.makePayment(678.97, "4566");
		
		UPI.makePayment(457.33);
		UPI.makePayment(435, "Shr254", false);
		
		P.getPaymentType();
		cc.getPaymentType();
		UPI.getPaymentType();
		
		Payment PP= new UPIPayment();
		PP.makePayment(20000, "USD");
		PP.getPaymentType();
		
		CryptoPayment CP = new CryptoPayment();
		CP.makePayment(4322);
		CP.getPaymentType();
		
	}

}
