package co.rays.string_interview;

public class SumOfGivenNumber {

	public static void main(String[] args) {

	int sum=0,rem=0,num=123456;
	while(num>0) {
		rem=num%10;
		sum=(sum)+rem;
		num=num/10;
	}
	System.out.println(sum);

	}

}
