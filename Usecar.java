package trainingday3STRINGMETHODS;

public class Usecar {
	public static void main(String[] args) {
		car car1 = new car();
		car1.brand = "bmw";
		car1.model = "XVI";
		car1.price = 400000;
		car1.isPetrol = true;
		
		car car2 = new car();
		car2.brand = "tata";
		car2.model = "IX";
		car2.price = 300000;
		car2.isPetrol = true;
		
		car car3 = new car();
		car3.brand = "swift";
		car3.model = "X2V";
		car3.price = 200000;
		car3.isPetrol = true;
		
		int car4 = car1.brand.length();
		int car5 = car2.brand.length();
		int car6 = car3.brand.length();
		int total = car1.price+car2.price+car3.price;
		String car7 = car1.brand.toUpperCase();
		String car8 = car2.brand.toUpperCase();
		String car9= car3.brand.toUpperCase();
		
		System.out.println(car4);
		System.out.println(car5);
		System.out.println(car6);
		System.out.println(car7);
		System.out.println(car8);
		System.out.println(car9);
		System.out.println(total);
		System.out.println(car7+" "+car1.model+" "+car1.price+" "+car1.isPetrol+".");
		System.out.println(car8+" "+car2.model+" "+car2.price+" "+car2.isPetrol+".");
		System.out.println(car9+" "+car3.model+" "+car3.price+" "+car3.isPetrol+" ");
	
	}
}
