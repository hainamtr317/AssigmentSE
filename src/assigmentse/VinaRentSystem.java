package assigmentse;

import java.util.List;

public class VinaRentSystem {
	private List<Rental> rentalList;
	private List<Customer> customerList;
	private List<RentalGroup> rentalGroupList;
	private List<Car> carList;
	public List<Rental> getRentalList() {
		return rentalList;
	}
	public void setRentalList(List<Rental> rentalList) {
		this.rentalList = rentalList;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public List<RentalGroup> getRentalGroupList() {
		return rentalGroupList;
	}
	public void setRentalGroupList(List<RentalGroup> rentalGroupList) {
		this.rentalGroupList = rentalGroupList;
	}
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	
}
