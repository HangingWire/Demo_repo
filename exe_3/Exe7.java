package exe_3;

import java.util.Random;

public class Exe7 {
	public static void main(String[] args) {
		Random r = new Random();
		char ch = (char)(r.nextInt(26)+65);
		System.out.println(ch);
	}
}
