public class ArrayDuplicate{
	public static void main(String[] args){
		int[] x={13,9,11,13,21,9,9,18,25,18,21};
		int[] SecondArr=new int[x.length/2];
			
		
		System.out.println("Duplicate numbers of array:");
		int index=0;
		for(int i=0; i<x.length; i++){ 
			int box=1;
			for(int j=i+1; j<x.length; j++){
               if(x[i]==x[j]){
               	box++;
               }
			}
			if(box>1){
				int count=1;
				for(int k=0; k<SecondArr.length; k++){
					if(x[i]==SecondArr[k]){
						count++;
					}
				}
				if(count>1){

		            }
		        else{
			         SecondArr[index]=x[i];
			          index++;
		         }
			}
		}
           for(int m=0; m<index; m++){
           	System.out.print(SecondArr[m] +" ");
           }
   
           

             
         
     }
 }
           	
           
		
	
