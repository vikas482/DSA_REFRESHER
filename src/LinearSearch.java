public class LinearSearch {

    public static void main(String args[]){

        int target = 3;
        int num[] = {11,2,31,4};
        int result = linearSearch(num,target);

        if(result!=-1){
            System.out.println("Element found at "+result+" position");
        }else{
            System.out.println("Element not found in the array list");
        }
    }

    static int linearSearch(int arr[], int target){

        if (arr.length == 0) {
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

}
