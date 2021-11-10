import java.util.*;
public class Powerof{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base:");
		int base=sc.nextInt();
		System.out.println("enter the exponent:");
		int expo=sc.nextInt();
		int result=1;
		for(;expo!=0;--expo){
			result*=base;
		}
		System.out.println("answer is:" +result);
	}
}