package assigmentse;

import java.util.ArrayList;
import java.util.List;

public class VinaRentSystem {
	private List<Rental> rentalList = new ArrayList<Rental>();
	private List<Customer> customerList = new ArrayList<Customer>();
	private List<RentalGroup> rentalGroupList = new ArrayList<RentalGroup>();
	private List<Car> carList = new ArrayList<Car>();
	private List<Branch> branchList = new ArrayList<Branch>();
	private List<CarModel> carModelList = new ArrayList<CarModel>();
	
	
	public void addBranch(String number, String location) {
		Branch branch = Helper.search(branchList, number);
		if(branch == null) {
			branchList.add(new Branch(number, location));
			System.out.println("The Car Branch " + number + " is added to the system" );
		}
		else {
			System.out.println("The Car Branch " + number + " has already existed. Please enter a new n" );
		}
	}
	
	public void pairingBranch(String branch_1, String branch_2) {
		Branch branch1 = Helper.search(branchList, branch_1);
		Branch branch2 = Helper.search(branchList, branch_2);
		if(branch1 != null) {
			if(branch2 != null) {
				branch1.setNeightbor(branch2);
				branch2.setNeightbor(branch1);
				System.out.println("Branches number "+ branch1.getKey() + " and number " + branch2.getKey() +" is now paired");
			}
			else 
				System.out.println("The second branch's number doesn't exist. Please try again");
			
		}
		else
			System.out.println("The first branch's number doesn't exist. Please try again");
	}
	
	public void addRentalGroup(GroupType status, double price) {
		RentalGroup group = Helper.search(rentalGroupList ,status);
		if(group == null) {
			rentalGroupList.add(new RentalGroup(status,price));
		}
		else {
			System.out.println("The rental group " + status + " has already existed.");
		}
	}
	
	public void addModel(String model_num, String desc, ControlType type, int door, String petrol, GroupType group) {
		//Find the model and the rental group from their id.
		CarModel model = Helper.search(carModelList , model_num);
		RentalGroup carGroup = Helper.search(rentalGroupList , group);
		//check if the model number existed or not.
		if(model == null) {
			if(carGroup != null) {
				CarModel a = new CarModel(model_num, desc, type, door, petrol);
				a.setGroup(carGroup);
				carModelList.add(a);
				System.out.println("The model "+ a.getKey()+ " is added.");
			}
			else 
				System.out.println("The Rental Group is not group. Please try again.");
		}
		else
			System.out.println("The model number " + model_num +" has already existed. Please try enter a new model number.");
	}
	
	public void addCar(String regNr, String color,String year, CarStatusType status, List<CarType>types, String mileage,String branch_num, String model_num) {
		Car car = Helper.search(carList , regNr);
		CarModel model = Helper.search(carModelList , model_num);
		Branch branch = Helper.search(branchList, branch_num);
		
		if(car == null) {
			if(model != null) {
				if(branch != null) {
					Car a = new Car(regNr, color, year, status, types, mileage, model);
					a.setLocation(branch);
					carList.add(a);
					branch.setCar(car);
					System.out.println("The car with the registration number " + regNr +" has been added");
				}
				else
					System.out.println("The branch " + branch_num+" doesn't exist");
			}
			else
				System.out.println("The model number " + model_num+" doesn't exist");
		}else
			System.out.println("The registration number " + regNr +" has already existed");
	}
	
	public void getListOfCars(String branch_num, GroupType group_type) {
		Branch branch = Helper.search(branchList, branch_num);
		RentalGroup group = Helper.search(rentalGroupList , group_type);
		int count = 1 ;
		if(branch != null) {
			if(group != null) {
				System.out.println("List of Cars locate at Branch " + branch_num+ " and belong to " + group_type +" :");
				System.out.println("---------------------------------------------------------");
				for(Car n : carList) {
					if(n.getModel().getGroup().equals(group) && n.getLocation().equals(branch)) {
						System.out.println("Car #" + count++ +":");
						System.out.println("Registration number: " + n.getKey() + "\n" + 
								"Color: " + n.getColor() + 
								"\n" + "Car Type: " + n.getCarTypes() + "\n" + 
								"Year Of Production: " + n.getYear_production() + "\n" + 
								"Car Status: " + n.getStatus() + "\n" +
								"Mileage: " + n.getMileage() + "\n");
					}
					else {
						System.out.println("There is no car available.");
					}
				}
			}
			else {
				System.out.println("The group "+ group.getGroup() +" doesn't exist");
			}
		}
		else
			System.out.println("The branch number "+ branch.getBranchNumber() +" doesn't exist");
	}
	
	public void addCustomer(String license, String firstName, String lastName, String phone, String email, boolean status) {
		Customer customer = Helper.search(customerList, license);
		if(customer == null) {
			customerList.add(new Customer(license, firstName, lastName, phone, email, status));
			System.out.println("The customer with the driver license number " + license +" has been added");
		}
		else
			System.out.println("The customer with the driver license number " + license +" has already existed");
	}
	
	public void recordReturnedCar(String regNr) {
		Car car = Helper.search(carList, regNr);
		if(car != null) {
			car.setStatus(CarStatusType.RETURNED);
		}
	}
}
