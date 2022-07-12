package trainingday3STRINGMETHODS;

public class world {
	public static void main (String[] args) {
		String word = "World Wide Wonder";
		String[] word2 = word.split(" ");
		int word3 = word2[0].length();
		int word4 = word2[1].length();
		int word5 = word2[2].length();
		String word6 = word2[0].toUpperCase();
		String word7 = word2[1].toUpperCase();
		String word8 = word2[2].toUpperCase();
		System.out.println("world length = "+word3);
		System.out.println("wide length = "+word4);
		System.out.println("wonder length = "+word5);
		System.out.println(word6);
		System.out.println(word7);
		System.out.println(word8);
		System.out.println(word2[0]+" "+word2[1]+" "+word2[2]);
		
		
	}

}
