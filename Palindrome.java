import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number: ");
		int num=sc.nextInt();
		int reverse=0;
		
		int temp=num;
		for(;num>0;){
			int digit=num%10;
			
			reverse=reverse*10+digit;
			
			num=num/10;
		
		
		}
		
		 if(temp==reverse){
			System.out.println("given no is palindrome. ");
			}else{
				System.out.println("given no is not Palindrome");
			}
		}
	}
