public class LinearSearchMinNo {

    public static void main(String args[]){

        int num[] = {11,2,31,4};
        int result = linearSearch(num);

        if(result!=-1){
            System.out.println("Minimum number is "+result);
        }else{
            System.out.println("Element not found in the array list");
        }
    }

    static int linearSearch(int arr[]){

        if (arr.length == 0) {
            return -1;
        }

        int minno = arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]<minno){
                minno = arr[i];
            }
        }

         return minno;

    }


}
