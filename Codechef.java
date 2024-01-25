import java.util.*;
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int p = sc.nextInt();
            int l = sc.nextInt();
            System.out.println((l*100)/p>=75?"YES":"NO");
        }
        sc.close();
    }
}
