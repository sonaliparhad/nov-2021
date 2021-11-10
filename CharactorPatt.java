import java.util.*;
public class CharactorPatt{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number of rows:");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++){
			char ch='a';
			for(j=i;j<=n;j++){
			System.out.print(" ");
			}
			for(j=1;j<=i;j++,ch++){
				System.out.print(ch+ "  ");
			}
			System.out.println();
		}
	}
}