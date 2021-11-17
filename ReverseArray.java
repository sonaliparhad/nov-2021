public class ReverseArray{
	public static void main(String[] args){
		int[] x={4,25,43,76,54,43,21,7,9,80};
		int[] x2= new int[x.length]; 
		
		System.out.println("Reverse of given array:");
	      for(int i=0; i<x2.length; i++){
	      	x2[i]=x[x.length-1-i];
	      	System.out.print(x2[i]+" ");
	      }

		}
			
		}
		
