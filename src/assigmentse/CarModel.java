package assigmentse;

public class CarModel {
	private String model_num;
	private String model_desc;
	private ControlType controlType;
	private int door_num;
	private String petrol_consume;
	
	
	public CarModel(String num,String desc, ControlType type,int door,String consume) {
		this.model_num= num;
		this.model_desc =desc;
		this.controlType= type;
		this.door_num =door;
		this.petrol_consume = consume;
		
	}
	public String getModel_num() {
		return model_num;
	}
	public void setModel_num(String model_num) {
		this.model_num = model_num;
	}
	public String getModel_desc() {
		return model_desc;
	}
	public void setModel_desc(String model_desc) {
		this.model_desc = model_desc;
	}
	public int getDoor_num() {
		return door_num;
	}
	public void setDoor_num(int door_num) {
		this.door_num = door_num;
	}
	public ControlType getControlType() {
		return controlType;
	}
	public void setControlType(ControlType controlType) {
		this.controlType = controlType;
	}
	public String getPetrol_consume() {
		return petrol_consume;
	}
	public void setPetrol_consume(String petrol_consume) {
		this.petrol_consume = petrol_consume;
	}

}
