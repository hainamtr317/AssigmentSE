package assigmentse;

import java.util.*;

public class Car {
	
	private String regNr;	
	private String color;
	private CarStatusType status;
	private String year_production;
	private List<CarType> Cartypes;
	private CarModel model;
	
	
	public Car(String regNr,String color, String year,CarStatusType status,List<CarType> Cartypes){
		this.regNr = regNr;
		this.color =color;
		this.year_production =year;
		this.status =status;
		this.Cartypes= Cartypes;
		
	}
	public String getRegNr() {
		return regNr;
	}
	public void setRegNr(String regNr) {
		this.regNr = regNr;
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
	public void setStatus(CarStatusType status) {
		this.status = status;
	}
	public String getYear_production() {
		return year_production;
	}
	public void setYear_production(String year_production) {
		this.year_production = year_production;
	}
	public List<CarType> getCarTypes() {
		return getCarTypes();
	}
	public void setCarTypes(List<CarType> CarTypes) {
		this.Cartypes = CarTypes;
	}
	public CarModel getModel() {
		return model;
	}
	public void setModel(CarModel model) {
		this.model = model;
	}

}
