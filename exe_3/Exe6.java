package exe_3;

public class Exe6 {
	public static void main(String[] args) {
//		char[] c = Striongutil.toCharArray("imtest");
//		for(int i = 0; i<c.length; i++) {
//		System.out.println(c[i]);
//		}
		System.out.println(Stringutil.getSingleString("abbcdefa"));
	}
}
class Stringutil{
	public static char[] toCharArray(String str) {
		char[] c = new char[str.length()];
		for (int i = 0; i<str.length(); i++) {
			c[i] = str.charAt(i);
		}
		return c;
	}
	
	@SuppressWarnings("removal")
	public static String getSingleString(String str) {
		//String[] strArrary = str.split("");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if( sb.toString().contains(String.valueOf(str.charAt(i))));
			else
			sb.append(String.valueOf(str.charAt(i)));
		}
		return sb.toString();
	}
}
