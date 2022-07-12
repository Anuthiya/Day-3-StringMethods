package trainingday3STRINGMETHODS;

public class strinhCars {
	public static void main(String[] args) {
		String cars = "innova Swift Tata";
		String cars1 = cars.toUpperCase();
		String[] b = cars1.split(" ");
		String low = b[1].toLowerCase();
		int len = b[0].length();
		int len1arr = cars.length();
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(low);
		System.out.println("innova length is="+len);
		System.out.println("array length="+len1arr);
		
		
	}

}
