package assigmentse;

public class RentalGroup {
	private GroupType group;
	private double price;
	
	public RentalGroup(GroupType type,double Price) {
		this.price = Price;
		this.group = type;
		
	}

	public GroupType getGroup() {
		return group;
	}

	public void setGroup(GroupType group) {
		this.group = group;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	}

