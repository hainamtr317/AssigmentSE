package assigmentse;

public class carModel {
	private String model_num;
	private String model_desc;
	private controlType controlType;
	private int door_num;
	private String petrol_consume;
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
	public controlType getControlType() {
		return controlType;
	}
	public void setControlType(controlType controlType) {
		this.controlType = controlType;
	}
	public String getPetrol_consume() {
		return petrol_consume;
	}
	public void setPetrol_consume(String petrol_consume) {
		this.petrol_consume = petrol_consume;
	}

}
