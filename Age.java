import java.util.*;
public class Age{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your age: ");
	int year=sc.nextInt();
	if(year>0 && year<18){
	System.out.println("you are a kid.");
	}else if(year>=18 && year<60){
		System.out.println("you are an adult");
	}else if(year>=60 && year<=110){
		System.out.println("you are a senior citizen");
	}else{
		System.out.println("invalid age");
	}
}
}