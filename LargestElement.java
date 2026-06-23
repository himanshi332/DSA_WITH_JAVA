public class LargestElement{
    public static void main(String[] args) {

        int arr[] = {3,1,2,5,2};
        int n = arr.length;
        int Largest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>Largest){
                Largest= arr[i];
            }
        }
        System.out.println(Largest);

    }
    
}