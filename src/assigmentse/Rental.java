package assigmentse;

import java.util.Date;
import java.util.List;

public class Rental {
	private String rental_number;
	private Date pickup_date;
	private Date return_date;
	private RentalStatusType status;
	private double rent_cost;
	private String time;
	private Car car;
	private List<Payment> paymentList;
	
	
	public String getRental_number() {
		return rental_number;
	}
	public void setRental_number(String rental_number) {
		this.rental_number = rental_number;
	}
	public Date getPickup_date() {
		return pickup_date;
	}
	public void setPickup_date(Date pickup_date) {
		this.pickup_date = pickup_date;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public RentalStatusType getStatus() {
		return status;
	}
	public void setStatus(RentalStatusType status) {
		this.status = status;
	}
	public double getRent_cost() {
		return rent_cost;
	}
	public void setRent_cost(double rent_cost) {
		this.rent_cost = rent_cost;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<Payment> getPaymentList() {
		return paymentList;
	}
	public void setPaymentList(List<Payment> paymentList) {
		this.paymentList = paymentList;
	} 
}
