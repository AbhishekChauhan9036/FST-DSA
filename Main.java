public class Main {

    public static int rangeBitwiseAnd(int left, int right) {
        int ans=0;
        while(left!=right){
            left=left/2;
            right=right/2;
            ans++;
        }
        return left<<ans;
    }
    public static void main(String[] args) {
        int a=9;
        int b=15;
        System.out.println(rangeBitwiseAnd(a, b));
    }
}
