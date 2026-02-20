import java.util.Scanner;

public class AmstrongNumber {

   static int calculateDigits(int n) {
       int count = 0;
       while (n > 0) {
           count=count+1;
           n=n/10;
       }
       return count;
   }

   static boolean isAmstrongNumber(int n) {
       int temp=n;
       int sum=0;
       int power=calculateDigits(n);
       while(n>0){
           int rem=n%10;
           
           sum= (int) (sum+Math.pow(rem,power));
           n=n/10;
       }
       return sum==temp;
   }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isAmstrongNumber(n)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
