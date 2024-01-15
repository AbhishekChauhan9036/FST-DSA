public class ReverseString {
    public static String reverseString(String str){
        if(str.length()==0){
            return str;
        }else{
            return reverseString(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String... args){
        String str="Computer";
        System.out.println(reverseString(str));
    }
}



/*
 * Computer
 * omputer C
 * mputer oC
 * puter moC
 * uter pmoC
 * ter upmoC
 * er tupmoC
 * r etupmoC
 * retupmoC
*/
