public class IsSorted {
    public static void main(String args[]){
        int arr[] = {1,2,2,3,3,4};
        int n = arr.length;
       for(int i = 1; i<n; i++){
        if(arr[i] >= arr[i-1]){

            System.out.println("Array is sorted");
            return;
    
        }
        
        System.out.println("Array is not sorted");
       }

    }
    
}
