package trainingday3STRINGMETHODS;

public class SMEqualsignoreCase {
	public static void main(String[] args) {
		String name = "EQUALS";
        String name1 = "CASTRO";
	    boolean name2 = name.equalsIgnoreCase(name1);
	    boolean name3 = name1.equalsIgnoreCase("CasTRo");
        System.out.println(name2);
        System.out.println(name3);

}
}