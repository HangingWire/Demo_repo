package exe_3;

public class Exe1 {
	public static void main(String[] args) {
		//""
		int[] array = {5,6,8,9,7,5,};
		System.out.println(Arrays.toString(array));
	}
}
class Arrays{
	public static String toString(int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(int i = 0; i <array.length; i++) {
			sb.append(array[i]);
			if(i == array.length-1) {
				sb.append(']');
				break;
			}
			sb.append(',');
		}
		return sb.toString();
	}
}