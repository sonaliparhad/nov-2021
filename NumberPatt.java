import java.util.*;
public class NumberPatt{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number of rows:");
		int n=sc.nextInt();
		int i,j,p;
		for(i=1,p=1;i<=n;i++,p++){
			for(j=i;j<=n;j++){
			System.out.print("  ");
			}
			for(j=1;j<i;j++){
				System.out.print(p+ " ");
			}
			for(j=1;j<=i;j++){
				System.out.print(p+ " ");
			}
			System.out.println("  ");
		}
	}
}