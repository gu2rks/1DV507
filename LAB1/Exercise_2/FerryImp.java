package aa224iu__assign1.Exercise_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FerryImp implements Ferry {
	private int ppl;
	private int vehicleSpace;
	private int cash = 0;
	private static final int MAX_VEHICLE_SPACE = 200;
	private static final int MAX_PASSENGER_SPACE = 200;

	private List<Vehicle> vehicles;
	private List<Passenger> passengers;

	public FerryImp() {
		ppl = 0;
		vehicleSpace = 0;
		vehicles = new ArrayList<Vehicle>();
		passengers = new ArrayList<Passenger>();
	}

	@Override
	public int countPassengers() {
		
		return ppl;
	}

	@Override
	public int countVehicleSpace() {
		
		return vehicleSpace/5;
	}

	@Override
	public int countMoney() {
		if (vehicleSpace == 0 || ppl == 0) {
			return getMoney();
		}

		else {
			int temp = 0;
			for (Vehicle v : vehicles)
				temp += v.getTotalPrice();

			int moneyPassenger = 20 * passengers.size();
			temp += moneyPassenger;

			cash = temp;
			return temp;
		}

	}

	public int getMoney() {
		return cash;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		
		return vehicles.iterator();
	}

	@Override
	public void embark(Vehicle id) {
		
		if (hasSpaceFor(id) && id.getsize() + ppl <= MAX_PASSENGER_SPACE) {
			if(vehicles.contains(id)) {
				System.err.println("Vehicle with the number plat "+id+" has already been embarked. ");
			}
			else {
				ppl += id.getsize();
				vehicles.add(id);
				vehicleSpace += id.getVehicleSpace();
				
			}
		}
		
		else {
			if (id.getsize() + ppl > MAX_PASSENGER_SPACE) {
				System.err.println("To many passengers in vehicle");
			}
			else {
				System.err.println("There is no more space for vehicle");
			}
		}
		
	}

	@Override
	public void embark(Passenger p) {
		if(hasRoomFor(p)) {
			if (passengers.contains(p)) {
				System.err.println("Passenger "+p+" has already been embarked");
			}
			ppl++;
			passengers.add(p);
		}
		else {
			System.out.println("No space for more passenger");
		}
	}

	@Override
	public void disembark() {
		vehicles.clear();
		passengers.clear();
		vehicleSpace = 0;
		ppl = 0;
		countMoney();
		System.out.println("CASH IN"+getMoney());

	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		
		return v.getVehicleSpace() + vehicleSpace <= MAX_VEHICLE_SPACE;
	}

	@Override
	public boolean hasRoomFor(Passenger p) {
		
		return p.getSize() + ppl <= MAX_PASSENGER_SPACE;
	}
	
	public String toString() {
		String status = countPassengers()+" Passengers on board\n"
				+vehicles.size()+" Vehicles on board\n"
				+countMoney()+" kr.\n\n Passengers with no Vehicle: \n";
		Iterator<Passenger> itrPass = passengers.iterator();
		int count = 0;
		
		while(itrPass.hasNext()) {
			count++;
			Passenger pas = itrPass.next();
			status += "passenger "+count+": "+pas.toString()+"\n";
		}
		return status;
	}
}	
