public class RemoveDuplicate {
    public static void main(String args[]){
        int arr[] = {1,1,2,2,2,3,3};
        int n = arr.length;
        int i=0;
        for(int j=1; j<n; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }

        }

        int UniqueCount = i+1;

        System.out.println("Array After Remove Duplicate Element");
        for(int k=0; k<UniqueCount; k++){
           System.out.print(arr[k] + " "); 
        }
    }
    
}
