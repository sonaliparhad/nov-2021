import java.util.*;
public class ReverseNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number: ");
		int num=sc.nextInt();
         for(;num>0;){
			int digit=num%10;
			System.out.print(digit);
			num=num/10;
		}
	}
}