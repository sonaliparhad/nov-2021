import java.util.*;
public class Division{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: \n");
		int x=sc.nextInt();
		if(x%3==0 && x%5==0){
			System.out.println("Divisible by both five and three");
		}else if(x%5==0){
			System.out.println("Divisible by five");
		}else if(x%3==0){
			System.out.println("Divisible by three");
		}else{
			System.out.println("invalid ");
		}
	

	}
}