package exe_3;
import java.util.Scanner;
public class Exe5 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number:");
//		float f = sc.nextFloat();
//		String[] str = new Float(f).toString().split("\\.");
//		System.out.println(str[0].toString()+"."+str[1].toString().substring(0,2));
		System.out.println(getPropertyGetName("name"));
	}
	public static String getPropertyGetName(String property) {
		return "get"+property.substring(0,1).toUpperCase()+property.substring(1).toLowerCase();
	}
}
 