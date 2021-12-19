package assigmentse;

public class RentalGroup {
	private String group;
	private double price;
	
	public RentalGroup(String Group,double Price) {
		this.price = Price;
		this.group = Group;
		
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	}

