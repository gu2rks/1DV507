package aa224iu__assign1.Exercise_2;

public class FerryMain {
	public static void main (String[]agrs) {
		FerryImp poseidon = new FerryImp();
		Vehicle car1 = new Car(3,1);
		Vehicle bus1 = new Bus(18,2);
		Vehicle lorry1 = new Lorry(2,3);
		Vehicle bike1 = new Bicycle(4);
		Vehicle bike2 = new Bicycle(5);
		Vehicle bike3 = new Bicycle(6);
		Vehicle bike4 = new Bicycle(7);
		Vehicle bike5 = new Bicycle(8);
		Passenger ppl1 = new Passenger("Amata");
		poseidon.embark(ppl1);
		poseidon.embark(lorry1);
		poseidon.embark(car1);
		poseidon.embark(bus1);
		poseidon.embark(bike1);
		poseidon.embark(bike2);
		poseidon.embark(bike3);
		poseidon.embark(bike4);
		poseidon.embark(bike5);
		Vehicle bus2 = new Bus(18,9);
		poseidon.embark(bus2);		
		System.out.println(poseidon.countVehicleSpace());
		System.out.println(poseidon.countPassengers());
		System.out.println(poseidon.countMoney());
		Passenger ppl2 = new Passenger("Findlay");
		System.out.println(poseidon.hasRoomFor(ppl2));
		poseidon.embark(ppl2);
		Vehicle lorry2 = new Lorry(2,10);
		System.out.println(poseidon.hasSpaceFor(lorry2));
		poseidon.embark(lorry2);
		
		System.out.println(poseidon.toString());
	}
}
