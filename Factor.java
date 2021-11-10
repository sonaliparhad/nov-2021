import java.util.*;
public class Factor{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number: ");
	int num=sc.nextInt();
	int r=num;
	int fact=1;
	do{
		fact=fact*num;
		num--;
	}while(num>=1);
	System.out.println("factorial of "+r+" is: "+fact);
}
}