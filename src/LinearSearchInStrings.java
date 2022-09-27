public class LinearSearchInStrings {

    public static void main(String args[]){

        String str = "Vikas";
        char target = 'v';
        int result = linearSearchInStrings(str.toLowerCase(),target);

        if(result!=-1){
            System.out.println("Element found at "+result+" position");
        }else{
            System.out.println("Element not found in the string");
        }
    }

    static int linearSearchInStrings(String str, char target){

        if(str.length()<1){
            return -1;
        }

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == target ){
                return i;
            }
        }

        return -1;
    }

}
