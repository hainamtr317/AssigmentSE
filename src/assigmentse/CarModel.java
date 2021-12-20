package assigmentse;

public class CarModel implements SimpleKey{
	private String model_num;
	private String model_desc;
	private ControlType controlType;
	private int door_num;
	private String petrol_consume;
	private RentalGroup group;
	
	public CarModel(String num,String desc, ControlType type,int door,String consume) {
		this.model_num = num;
		this.model_desc = desc;
		this.controlType= type;
		this.door_num = door;
		this.petrol_consume = consume;
		
	}
	public String getModel_num() {
		return model_num;
	}

	public String getModel_desc() {
		return model_desc;
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
	
	public RentalGroup getGroup() {
		return group;
	}
	
	public String getPetrol_consume() {
		return petrol_consume;
	}
	
	public void setGroup(RentalGroup group) {
		this.group = group;
	}
	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return model_num;
	}
	

}
