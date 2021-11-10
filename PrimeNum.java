import java.util.*;
public class PrimeNum{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number: ");
	int num=sc.nextInt();
	if(num>2 && num%2==0){
		System.out.println("its not prime number.its divided by 2");
	}else if(num>3 && num%3==0){
		System.out.println("its not prime number.its divided by 3");
	}else if(num>5 && num%5==0){
		System.out.println("its not prime number.its divided by 5");
	}else if(num>7 && num%7==0){
		System.out.println("its not prime number.its divided by 7");
	}else if(num>=1 && num%1==0 && num%num==0){
		System.out.println("given number is prime");
	}else{
		System.out.println("invalid number");
	}
}
}