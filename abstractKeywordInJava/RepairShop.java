package abstractKeywordInJava;

public class RepairShop {
	public static void repairCar(Car object) {
		System.out.println("Car is repaired");
	}
	
	

	public static void main(String[] args) {
		Audi a = new Audi();
		a.accelerate();
		a.breaking();
		
		WagonR w = new WagonR();
		w.accelerate();
		w.breaking();
		
		repairCar(w);
		repairCar(a);
		// TODO Auto-generated method stub
		
		 // Car c = new Car(); 
		//Car Class Cannot be Instantiated becauese It Is declared as Abstract Class  Hence
		// We can't Create Objects of Abstract Class
		

	}

}
