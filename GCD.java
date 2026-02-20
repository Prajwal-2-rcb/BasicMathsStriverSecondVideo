import java.util.Scanner;

public class GCD {

    public static int gcd(int a, int b) {
        for(int i=Math.min(a,b);i>=1;i--)
        {
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 0;
    }

    public static int gcd2(int a, int b) {
        while(a>0 && b>0){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        if(a==0){
            return b;
        }
        else{
            return a;
        }
    }
// O(log (min (a,b) ) )
    public static int gcd3(int a, int b) {
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        else{
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(gcd2(a,b));
        System.out.println(gcd3(a,b));
    }
}
