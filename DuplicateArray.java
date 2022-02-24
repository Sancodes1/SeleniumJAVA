package Week1.day2;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] arr= {11,15,12,11,16,17,15,17,19};
             int count;
             int temp;
             int lenarr =arr.length;
             for (int i = 0; i <lenarr; i++) {
            	 count=0;
            	 for (int j = i+1; j < lenarr-1; j++) {
            		 if(arr[i]==arr[j]) {
            			 count=count+1;
            			 temp=arr[i];
            		 }
					
				}
				if(count>0) {
					System.out.println(arr[i]);
				}
			}
	}

}
