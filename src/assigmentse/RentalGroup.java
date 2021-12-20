package assigmentse;

public class RentalGroup implements SimpleKey{
	private GroupType group;
	private double price;

	public RentalGroup(GroupType type, double Price) {
		this.price = Price;
		this.group = type;

	}

	public GroupType getGroup() {
		return group;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public GroupType getKey() {
		// TODO Auto-generated method stub
		return group;
	}
}
