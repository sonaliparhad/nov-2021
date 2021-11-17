public class ArrayPrime{
	public static void main(String[] args){
		int[] x={2,7,15,11,91,27,20,13,78,17,91};
		System.out.println("prime number from given array:");
		for(int i=0; i<x.length; i++){
			if(x[i]==2 || x[i]==3 || x[i]==5 || x[i]==7){
			System.out.print(x[i]+" ");	
			}
			else if(x[i]%2!=0 && x[i]%3!=0 && x[i]%5!=0 && x[i]%7!=0){
				System.out.print(x[i]+" ");
			}
			else{

			}
			

				
			}
		
		
	}
}