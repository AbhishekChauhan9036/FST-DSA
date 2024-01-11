public class Recursion {

    public static void rec(int i,int n){
        if(i>n) return;
        rec(i+1,n);
        System.out.println(i);
    }
    public static void main(String... args){
        rec(1,4);
    }
}

/*
Stack Overflow
 * 4
 * 3
 * 2
 * 1
 */
