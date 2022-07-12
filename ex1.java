package trainingday3STRINGMETHODS;

public class ex1 {
	public static void main(String[] args) {
		String name = "raja";
		String name1 = "raman";
		String name2 = name.toUpperCase();
		String name3 = name1.toUpperCase();
		String name4 = name2.concat(name3);
		int name5 = name4.length();
	
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		
		
	}

}
