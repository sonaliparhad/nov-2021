import java.util.*;
public class Fibonasi{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		int n=sc.nextInt();
		int num1=0;
		int num2=1;
		for(int i=1;i<=n;++i){
			System.out.print(num1+ " ");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}
	}
}