public class ArrayDemo{
	public static void main(String[] args){
		int[][] x={{1,2},{3,4,5},{6},{7,8,9,10}};
		int result=0;
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				result=result+x[i][j];
				
			}
		}
		System.out.println("addition is:"+result);
	}
}