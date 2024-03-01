public class Main {
    public static void main(String[] args) {
        String octStr = "63";
        int num = Integer.parseInt(octStr, 8);
        int result = 0;
        int i = 0;
        while (num != 0) {
            result ^= num;
            num >>= 1;
            i++;
        }
        System.out.println(Integer.toOctalString(result));
    }
}
