package aa224iu__assign1.Exercise_2;

public class Bicycle extends Vehicle{
	
	private final int MAX_PASSENGER = 1;
	
	
	
	public Bicycle (int id) {
		super.space = 1;
		super.totalPrice = 40;
		super.id = id;
		
		
			
		
	}
	
	@Override
	public int getTotalPrice() {
		
		return super.totalPrice;
	}



	@Override
	public int getVehicleSpace() {
		
		return super.space;
	}

	@Override
	public int getId() {
		
		return id;
	}
	@Override
	public int getMaxPassanger() {
	
		return MAX_PASSENGER;
	}

	
	
}
