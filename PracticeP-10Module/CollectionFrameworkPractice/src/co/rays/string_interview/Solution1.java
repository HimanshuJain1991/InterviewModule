package co.rays.string_interview;


public class Solution1{

    public static void main(String[] args) {
//    	String S ="5F3Z-2e-9-w";int K=2;
//    	 String cleaned = S.replaceAll("-", "").toUpperCase();
//         StringBuilder sb = new StringBuilder(cleaned);
//         for (int i = sb.length() - K; i > 0; i=i- K) {
//             sb.insert(i, '-');
//         }
//         System.out.println(sb.toString());
    	
    	String s="5F3Z-2e-9-w";int K=4;
    	String replace=s.replaceAll("-", "").toUpperCase();
    	StringBuffer sb=new StringBuffer(replace);
    	for(int i=sb.length()-K;i>0;i=i-K) {
    	sb.insert(i, '-');
    	}
    	System.out.println(sb);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}