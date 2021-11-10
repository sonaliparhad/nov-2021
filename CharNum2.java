import java.util.*;
public class CharNum2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur number of rows:");
		int n=sc.nextInt();
		int i,j,p;
		 char ch='a';
		for(i=1,p=1;i<=n;i++){
            
			for(j=i;j<=n;j++){
			System.out.print(" ");
			}
			
			for(j=1;j<=i;j++){
				if(i%2!=0){
					
					System.out.print(p+"  ");
                       p++;
				}else if(i%2==0){
					System.out.print(ch +"  ");
					
                    
				}
			}
			ch++;
			
			System.out.println();
		}
	}
}