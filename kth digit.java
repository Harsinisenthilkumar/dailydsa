import java.util.*;
public class kthdigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        long n = 1;
        for (int i = 0; i < b; i++) {
            n *= a;
        }
        for (int i = 1; i < k; i++) {
            n /= 10;
        }
     System.out.println(n % 10);
    }
}