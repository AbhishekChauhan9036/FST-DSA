public class Stringpractice{
    public static void main(String...args){
        // length(): Returns the length of the string.
        String str = "Hello";
        int length = str.length(); 


        // charAt(int index): Returns the character at the specified index.
        char ch = str.charAt(1);


        // substring(int beginIndex), substring(int beginIndex, int endIndex): Returns a substring of the original string.
        String sub1 = str.substring(2); // sub1 will be "llo"
        String sub2 = str.substring(1, 4); // sub2 will be "ell"


        // indexOf(String str), lastIndexOf(String str): Returns the index of the first/last occurrence of the specified substring.
        int index1 = str.indexOf("l"); // index1 will be 2
        int index2 = str.lastIndexOf("l"); // index2 will be 3


        // toUpperCase(), toLowerCase(): Returns a new string with all characters converted to uppercase/lowercase.
        String upperCase = str.toUpperCase(); // upperCase will be "HELLO"
        String lowerCase = str.toLowerCase(); // lowerCase will be "hello"


        // trim(): Returns a new string with leading and trailing whitespaces removed.
        String stringWithSpaces = "   Hello   ";
        String trimmedString = stringWithSpaces.trim(); // trimmedString will be "Hello"

    }
}