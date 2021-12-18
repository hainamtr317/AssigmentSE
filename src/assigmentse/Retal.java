package assigmentse;

import java.util.Date;

public class Retal {
	private String rental_number;
	private Date pickup_date;
	private Date return_date;
	private rental_status status;
	private double rent_cost;
	private String time;
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
	public rental_status getStatus() {
		return status;
	}
	public void setStatus(rental_status status) {
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
}
