import java.util.*;
public class CharactorPatt2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number of rows:");
		int n=sc.nextInt();
		int i,j;
		char ch='a';
		for(i=1;i<=n;i++,ch++){
			
			for(j=i;j<=n;j++){
			System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(ch+ "  ");
			}
			System.out.println();
		}
	}
}