package GamePackage;

import java.util.Scanner;

public class Player {
	public String name;
	public String word;
	
	public Player(String name){
		this.name= name;
	}
	public String sayWord() {

		Scanner in = new Scanner(System.in);

		word = in.next();

		return word;
	}
		public boolean succeed(String lastWord) {

			int lastIndex = lastWord.length() - 1;

			char lastChar = lastWord.charAt(lastIndex);

			char firstChar = word.charAt(0);

			if (lastChar == firstChar) {

				return true;

			}

			return false;
		

 }

}
