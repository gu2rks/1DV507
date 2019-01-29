package aa224iu__assign1.Exercise_2;

public abstract class Vehicle {
	
	
	
	protected int size; //passenger in vehicle
	protected int totalPrice;
	protected int id;
	protected int space;
	
	protected int getsize() {
		return size;
	}
	
	
	public abstract int getTotalPrice();
	public abstract int getMaxPassanger();
	public abstract int getVehicleSpace();
	public abstract int getId();
	
}
