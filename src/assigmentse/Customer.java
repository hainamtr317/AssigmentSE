package assigmentse;

public class Customer {
	private String driver_licence;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private Boolean blackList_status;
	public String getDriver_licence() {
		return driver_licence;
	}
	public void setDriver_licence(String driver_licence) {
		this.driver_licence = driver_licence;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
