package Week1.day2;
import java. util. Arrays;

public class MissingElementInArray {

	     public static void main(String[] args) {
	    	
	    	 int[] arr = {1,2,3,4,7,6,8};
	    	 Arrays.sort(arr);
	    	 for (int i = arr[0]; i <= arr.length-1; i++) {
	    		 if(i!=arr[i-1]) {
	    			 System.out.println("The Missing number is" + i);
				      break;
	    		 }
}
}

}