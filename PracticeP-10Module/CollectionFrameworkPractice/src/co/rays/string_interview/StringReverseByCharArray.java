package co.rays.string_interview;

public class StringReverseByCharArray {

	public static void main(String[] args) {
		String name="H ello";
		
		String s="";
		char[] charArray=name.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			s=s+charArray[i];

		}
		System.out.println(s);

	}

}
