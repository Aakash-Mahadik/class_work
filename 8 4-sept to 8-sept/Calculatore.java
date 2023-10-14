public class Calculatore
{
	public int add(int a, int b) {
		 
		 int result=a+b;
		 return result; //System.out.println(result);
		 }
		 
		public  int findMax(int arr[]){  
	        int max=arr[0];//arr[0] instead of 0  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;  
	    }  
}