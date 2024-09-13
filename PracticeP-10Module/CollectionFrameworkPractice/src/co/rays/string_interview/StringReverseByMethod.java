package co.rays.string_interview;

public class StringReverseByMethod {

	public static void main(String[] args) {
		String name="Hello";
		String s1="";
		for(int i=name.length()-1;i>=0;i--) {
			s1=s1+name.charAt(i);
		}
		System.out.println(s1);

	}

}
