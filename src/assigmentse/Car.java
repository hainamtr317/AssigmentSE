package assigmentse;

import java.util.*;

public class Car implements SimpleKey{
	
	private String regNr;	
	private String color;
	private CarStatusType status;
	private String year_production;
	private List<CarType> CarTypes;
	private CarModel model;
	private Branch location;
	
	public Car(String regNr,String color, String year,CarStatusType status,List<CarType> CarTypes, CarModel m){
		this.regNr = regNr;
		this.color = color;
		this.year_production =year;
		this.status = status;
		this.CarTypes= CarTypes;
		this.model = m;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public CarStatusType getStatus() {
		return status;
	}
	
	public String getYear_production() {
		return year_production;
	}
	
	public List<CarType> getCarTypes() {
		return CarTypes;
	}
	
	public CarModel getModel() {
		return model;
	}
	
	
	public Branch getLocation() {
		return location;
	}

	public void setModel(CarModel model) {
		this.model = model;
	}
	
	public void setLocation(Branch location) {
		this.location = location;
	}
	
	public void setStatus(CarStatusType status) {
		this.status = status;
	}
	@Override
	public String getKey() {
		return regNr;
	}
	
}
