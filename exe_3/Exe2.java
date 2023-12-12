package exe_3;

import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number with at least two decimal:");
		float f = sc.nextFloat();
		float ans = _2decimal(f);
		System.out.println(ans);
		
		System.out.println(ans+1);
	}
	public static float _2decimal(float f) {
		StringBuilder sb = new StringBuilder();
		sb.append(f);
		String s = sb.toString();
		int i;
		for(i = 0; i<sb.length(); i++) {
			if(sb.charAt(i) == '.')
				break;
		}
		String fir = sb.substring(0, i);
		String se = sb.substring(i+1, i+3);
		String fina = new StringBuilder(fir).append('.').append(new StringBuilder(se)).toString();
		
		return Float.parseFloat(fina);
	}
}
