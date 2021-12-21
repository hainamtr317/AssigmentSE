package assigmentse;

import java.util.Arrays;

public class Main {
	
	public static void main(String args[]) {
		VinaRentSystem system = new VinaRentSystem();
		system.addRentalGroup(GroupType.Group_A, 120);
		system.addRentalGroup(GroupType.Group_B, 175);
		system.addRentalGroup(GroupType.Group_C, 200);
		system.addRentalGroup(GroupType.Group_D, 220);
		system.addRentalGroup(GroupType.Group_E, 250);
		
		system.addBranch("123", "70 Hoang Dieu HCM");
		system.addBranch("124", "55 Phan Dinh Hung HN");
		
		system.addModel("1", "Toyata", ControlType.MANUAL, 4, "6.0L/100km", GroupType.Group_A);
		system.addModel("2", "Honda", ControlType.MANUAL, 2, "8.0L/100km", GroupType.Group_D);
		
		system.addCar("343214", "BLACK", "2010", CarStatusType.RENT_READY, Arrays.asList(CarType.COMPACT_CAR,CarType.VAN, CarType.FULL_SIZE),"1235km", "123" , "1");
		system.addCar("932413", "RED", "2014", CarStatusType.RENT_READY, Arrays.asList(CarType.STATION_WAGON,CarType.ECONOMY, CarType.MEDIUM_SIZE), "2235km","123" , "1");
		
		system.getListOfCars("123", GroupType.Group_A);
	}
	
	
}
