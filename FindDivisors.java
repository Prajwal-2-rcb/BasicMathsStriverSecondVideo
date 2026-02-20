import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindDivisors {
    static void findDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i+" ");
            }

        }
        System.out.println();

    }

    static void findDivisors2(int n) {
        List<Integer> divisors = new ArrayList<Integer>();
        //takes O(sqrt(n))
        for (int i = 1; i*i <=n; i++) {
            //instead of built-in sqrt use this
            if (n % i == 0) {
//                System.out.print(i+" ");
                divisors.add(i);
                if((n/i)!=i)
                {
//                    System.out.print((n/i)+" ");
                    divisors.add(n/i);
                }
            }
        }
        //takes O(n log n) n is number of factors
        Collections.sort(divisors);
        System.out.println(divisors);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        findDivisors(num);
        //Time complexity -- O(n)
        findDivisors2(num);



    }
}
