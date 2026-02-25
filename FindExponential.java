import java.util.Scanner;

public class FindExponential {

    public static int findExponential(int x,int n){
        int ans=1;
        int m=n;
        while(n>0){
            if(n%2==1){
                ans=ans*x;
                n=n-1;
            }
            else{
                n=n/2;
                x=x*x;
            }
        }
        if(m<0){
            ans=1/ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int base = sc.nextInt();
        System.out.println("Enter exponent");
        int exponent = sc.nextInt();
        System.out.println(findExponential(base,exponent));
    }
}
