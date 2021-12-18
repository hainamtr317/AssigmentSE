package assigmentse;

import java.util.List;

public class Branch{
private String branchNumber;
private String branchLocation;
private List<Branch> neightborList;
private List<Car> carList;
public Branch(String branchNumber,String branchLocation) {
	this.setBranchNumber(branchNumber);
	this.setBranchLocation(branchLocation);
}
public String getBranchNumber() {
	return branchNumber;
}
public void setBranchNumber(String branchNumber) {
	this.branchNumber = branchNumber;
}
public String getBranchLocation() {
	return branchLocation;
}
public void setBranchLocation(String branchLocation) {
	this.branchLocation = branchLocation;
}
public List<Branch> getNeightborList() {
	return neightborList;
}
public void setNeightborList(List<Branch> neightborList) {
	this.neightborList = neightborList;
}
public List<Car> getCarList() {
	return carList;
}
public void setCarList(List<Car> carList) {
	this.carList = carList;
}

}
