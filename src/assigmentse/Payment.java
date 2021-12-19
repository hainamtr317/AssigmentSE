package assigmentse;

public class Payment {
	private PaymentType paymentType;
	private double amount;
	
	
	public Payment(PaymentType Type,double amount) {
		this.paymentType= Type;
		this.amount =amount;
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
