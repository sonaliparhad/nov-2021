import java.util.*;
public class SqarePatt{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number of rows:");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++){
			for(j=10;j>=1;j--){
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	}
}