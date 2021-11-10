import java.util.*;
public class MixChar{
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
				while(i<=4){
					System.out.print(i+ " ");
				}
				while(i<=3){
                    System.out.print(ch+ " ");
				}
				while(i<=2){
					System.out.print("* ");
				}
				while(i==1){
					System.out.print(i);
				}
				
				
			}
			System.out.println();
		}
	}
}