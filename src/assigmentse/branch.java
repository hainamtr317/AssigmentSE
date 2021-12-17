package assigmentse;

public class branch{
private String branchNumber;
private String branchLocation;
public branch(String branchNumber,String branchLocation) {
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

}
