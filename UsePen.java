package trainingday3STRINGMETHODS;

public class UsePen {
	public static void main (String[] args) {
		Pen pen1 = new Pen();
		pen1.brand = "reynolds";
		pen1.price = 5;
		pen1.color = "bule";
		
		Pen pen2 = new Pen();
		pen2.brand = "parker";
		pen2.price = 25;
		pen2.color = "black";
		
		String pen3 = pen1.brand.toUpperCase();
		String pen4 = pen2.brand.toUpperCase();
		boolean pen5 = pen1.brand.contains("r");
		boolean pen6 = pen2.brand.contains("r");
		boolean pen7 = pen1.color.equals("BLUE");
		boolean pen8 = pen2.color.equals("black");
		char pen9 = pen2.color.charAt(4);
		char pen10 = pen1.color.charAt(2);
		String[] pen11 = pen1.brand.split("n");
		int pen12 = pen1.color.length();
		int pen13 = pen2.color.length();
		
		System.out.println(pen3);
		System.out.println(pen4);
		System.out.println(pen5);
		System.out.println(pen6);
		System.out.println(pen7);
		System.out.println(pen8);
		System.out.println(pen9);
		System.out.println(pen10);
		System.out.println(pen11[0]+" "+pen11[1]);
		System.out.println(pen12);
		System.out.println(pen13);
		
				
		
	}

}
