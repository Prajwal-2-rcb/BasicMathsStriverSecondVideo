
import java.util.Arrays;
import java.util.Scanner;

public class CountofPrimesLTOR {

    static int[] findSieveOfEratosthenes(int n) {
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

        return sieve;
    }

    static void printPrimesLTOR(int[][] queries) {
        int[] primes=findSieveOfEratosthenes(1000000);
        int count=0;
        for(int i=2;i<primes.length;i++){
            count=count+primes[i];
            primes[i]=count;
        }
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            System.out.println(primes[r]-primes[l-1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Q:");
        int q = sc.nextInt();
        int[][] queries = new int[q][2];
        System.out.println("Enter the values of L and R:");
        for (int i = 0; i < q; i++) {
            queries[i][0]=sc.nextInt();
            queries[i][1]=sc.nextInt();
        }

        printPrimesLTOR(queries);

    }
}
