package assigmentse;

import java.util.ArrayList;
import java.util.List;

public class Branch implements SimpleKey {
	private String branchNumber;
	private String branchLocation;
	private List<Branch> neightborList;
	private List<Car> carList;

	public Branch(String branchNumber, String branchLocation) {
		this.branchLocation = branchLocation;
		this.branchNumber = branchNumber;
		this.neightborList = new ArrayList<Branch>();
		this.carList = new ArrayList<Car>();
	}

	public String getBranchNumber() {
		return branchNumber;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public List<Branch> getNeightborList() {
		return neightborList;
	}

	public void setNeightbor(Branch branch) {
		this.neightborList.add(branch);
	}

	public List<Car> getCarList() {
		return carList;
	}

	public String getLocation() {
		return branchLocation;
	}

	public void setCar(Car car) {
		this.carList.add(car);
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return branchNumber;
	}

}
