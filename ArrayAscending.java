public class ArrayAscending{
	public static void main(String[] args){
		int[] x={13,9,11,18,21,7,25};
		int temp=0;
		int swapping;
		do{
           swapping=0;
			for(int i=0; i<x.length-1; i++){
				if(x[i]>x[i+1]){
					temp=x[i+1];
					x[i+1]=x[i];
					x[i]=temp;
					swapping++;
				}
			}
		}while(swapping!=0);
		
		
		for(int num:x){
			System.out.println(num+ " ");
		}
	}
}