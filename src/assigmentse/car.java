package assigmentse;

import java.util.*;
enum status{
	RENT_READY,
	HELD,
	RESERVED,
	PICKED_UP,
	EXCEPTIONAL
	
}
enum cartype{
	ECONOMY,
	COMPACT_CAR,
	MEDIUM_SIZE,
	FULL_SIZE,
	STATION_WAGON,
	VAN,
	SPORTS_LUXURY
	
}
public class car {
	
	private String regNr;	
	private String color;
	private status status;
	private String year_production;
	private List carTypes;

}
