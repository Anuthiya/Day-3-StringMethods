package trainingday3STRINGMETHODS;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop Laptop1 = new Laptop();
		Laptop1.brand = "Dell";
		Laptop1.price = 400000;
		Laptop1.color = "BLACK";
		
		String a = Laptop1.brand.toUpperCase();
		int b = Laptop1.brand.length();
		boolean c = Laptop1.brand.startsWith("D");
		char d = Laptop1.brand.charAt(Laptop1.brand.length()-1);
		String e = Laptop1.color.toLowerCase();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
