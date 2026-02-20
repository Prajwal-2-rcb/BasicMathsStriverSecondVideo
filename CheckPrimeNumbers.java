import java.util.Scanner;

public class CheckPrimeNumbers {

    public static boolean isPrime(int n) {
        int count = 0;
        //Takes O(n)
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                count++;
            }
        }
        if(count==2) return true;
        return false;
    }

    public static boolean isPrime(long n) {
        int count = 0;
        //Takes O(sqrt(n))
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        if(count==2) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        if(isPrime(num)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
