package exe_3;
//""
public class Exe3 {
	public static void main(String[] args) {
		float f = 12.225f;
		String[] s = Float.toString(f).split("\\.");
		for(int i = 0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		String st = new StringBuffer(s[0]).append('.').append(new StringBuffer(s[1]).substring(0, 2)).toString();
		System.out.println(Float.parseFloat(st));
	}
}
