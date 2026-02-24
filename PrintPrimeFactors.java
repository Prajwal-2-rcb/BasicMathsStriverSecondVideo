import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintPrimeFactors {

    static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                count++;
                if((n/i)!=i){
                    count++;
                }
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    //TC O(n * root(n) )
    static void printPrimeFactors(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                if(isPrime(i)){
                    primes.add(i);
                }
            }

        }
        System.out.println(primes);
    }

    //O( root n x 2 x root n)
    static void printPrimeFactors2(int n) {
        List<Integer> primes=new ArrayList<>();
        for (int i = 1; i*i <=n ; i++) {
            if(n%i==0){
                if(isPrime(i)){
                    primes.add(i);
                }

                if((n/i)!=i){
                    if(isPrime(n/i)){
                        primes.add(i);
                    }
                }
            }

        }
        System.out.println(primes);
    }

    //O(N)
    static void printPrimeFactors3(int n) {
        List<Integer> primes=new ArrayList<>();
        for (int i = 2; i <=n ; i++) {
            if(n%i==0){
                primes.add(i);
                while((n%i)==0){
                    n=n/i;
                }
            }
        }
        System.out.println(primes);
    }

    //O(root n * log n)
    static void printPrimeFactors4(int n) {
        List<Integer> primes=new ArrayList<>();
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0){
                primes.add(i);
                while((n%i)==0){
                    n=n/i;
                }
            }
        }
        if(n!=1){
            primes.add(n);
        }
        System.out.println(primes);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        printPrimeFactors(n);
        printPrimeFactors2(n);
        printPrimeFactors3(n);
        printPrimeFactors4(n);
    }
}
