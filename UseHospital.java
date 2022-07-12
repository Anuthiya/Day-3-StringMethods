package trainingday3STRINGMETHODS;

public class UseHospital {
	public static void main (String[] args) {
		Hospital hos1 = new Hospital();
		hos1.name = "Apollo";
		hos1.location = "CHENNAI";
		hos1.isAvail24 = true;
		
		Hospital hos2 = new Hospital();
		hos2.name = "kauvery";
		hos2.location = "CHENNAI";
		hos2.isAvail24 = true;
		
		Hospital hos3 = new Hospital();
		hos3.name = "Sims";
		hos3.location = "CHENNAI";
		hos3.isAvail24 = true;
		
		String hos4 = hos1.name.toUpperCase();
		String hos5 = hos2.name.toUpperCase();
		String hos8 = hos3.name.toUpperCase();
		int hos6 = hos1.location.length();
		boolean hos7 = hos1.name.equals(hos2.name);
		
		System.out.println(hos4+" "+hos1.location+" "+hos1.isAvail24);
		System.out.println(hos5+" "+hos2.location+" "+hos2.isAvail24);
		System.out.println(hos8+" "+hos3.location+" "+hos3.isAvail24);
		System.out.println("The length of location is = "+hos6);
		System.out.println(hos7);
		
	}

}
