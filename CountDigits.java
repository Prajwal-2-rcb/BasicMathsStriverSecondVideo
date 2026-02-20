import java.util.Scanner;

public class CountDigits {

    public static void usingDigits(int n) {
        int count = 0;
        while (n != 0) {
            n=n/10;
            count++;
        }
        System.out.println(count);

    }

    public static void usingLog(int n){
        int res= (int) (Math.log10(n)+1);
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        usingDigits(n);
        usingLog(n);
    }
}
