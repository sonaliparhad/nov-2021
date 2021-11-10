public class ArrayDemo1{
	public static void main(String[] args){
	int[] x={13,9,11,13,21,9,9,18,25};
	for(int i=0; i<x.length-1; i++){
	int temp=x[i];
	if(temp==x[x.length-1]){
	System.out.println("Duplicate numbers are:" +temp);
	x[x.length]--;
	}
	}
	}
}