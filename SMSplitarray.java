package trainingday3STRINGMETHODS;

public class SMSplitarray {
	public static void main(String[] args) {
		String a = "mango apple banana";
		String[] b = a.split("a");
		System.out.println(b[0]+" "+b[1]+" "+b[2]);
	}

}

