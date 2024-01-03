import java.util.*;
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Initialize t with the desired number of test cases
        while (t-- > 0) {
            int x = sc.nextInt();
            int y=sc.nextInt();
            System.out.println((x>y)?x-y:y-x);
        }
        sc.close();
    }
}
