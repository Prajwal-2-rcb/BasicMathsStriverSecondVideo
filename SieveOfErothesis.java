import java.util.Scanner;

public class SieveOfErothesis {
    static void printSieve(int n) {
        int[] sieve = new int[n+1];
        for(int i=2; i<=n; i++){
            sieve[i] = 1;
        }
        for(int i=2; i<=n; i++){
            if(sieve[i] == 1){
                for(int j=2*i; j<=n; j+=i){
                    sieve[j] = 0;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(sieve[i] == 1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static void findSieveOfEratosthenes(int n) {
        int[] sieve = new int[n+1];
        for(int i=2; i<=n; i++){
            sieve[i] = 1;
        }
        for(int i=2; i*i<=n; i++){
            if(sieve[i] == 1){
                for(int j=i*i; j<=n; j+=i){
                    sieve[j] = 0;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(sieve[i] == 1){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSieve(n);
        findSieveOfEratosthenes(n);

    }
}
