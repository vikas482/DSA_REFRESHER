public class LinearSearchInStrings {

    public static void main(String args[]){

        String str = "Vikas";
        char target = 'v';
        boolean result = linearSearchInStrings1(str.toLowerCase(),target);

        if(result== true){
            System.out.println("Element found ");
        }else{
            System.out.println("Element not found in the string");
        }
    }

    static boolean linearSearchInStrings1(String str, char target){

        if(str.length()<1){
            return false;
        }

        for(char ch: str.toCharArray()){

            if(ch==target){
                return true;
            }
        }

        return false;
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
