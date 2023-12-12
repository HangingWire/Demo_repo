package exe_3;

public class Exe4 {
	public static void main(String[] args) {
		String[] num = {"01081","32231","6661","78909879","1231234","1233212"};
		for(int i = 0; i<num.length; i++) {
			int f=0;
			for(int j = 0; i<=num[i].length()/2; j++) {
				if(num[i].charAt(j)!=num[i].charAt(num[i].length()-1-j)) {
					f++;
					System.out.println("f="+num[i].charAt(j));
					System.out.println("s="+num[i].charAt(num[i].length()-1-j));
					break;
				}else {
					System.out.println("f="+num[i].charAt(j));
					System.out.println("s="+num[i].charAt(num[i].length()-1-j));
				}
			}
			if(f>0) {
				System.out.println("It is not symmatric");
				System.out.println("f is "+f);}
			else {
				System.out.println("It is symmatric");
				System.out.println("f is "+f);
			}
		}
	}
}
