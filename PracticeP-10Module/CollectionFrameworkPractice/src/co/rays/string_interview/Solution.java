package co.rays.string_interview;

public class Solution {
	
	public static void main(String[] args) {
	String name="I.Have.complete.MCA.in.2015";
	String result="";
	String stringWords[]=name.split("\\.");
	for(int i=stringWords.length-1;i>=0;i--) {
		result=result+stringWords[i];
		if(i!=0) {
			result=result+".";
		}
		System.out.println(result);
	}
	//System.out.println(result);
	
	}
}
