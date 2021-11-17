public class ArrayLargestNum{
	public static void main(String[] args){
		int[] x={37,4,19,86,76,2,98};
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
		System.out.println("second largest number:"+x[x.length-2]);
	}
}