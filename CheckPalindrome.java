import java.util.Scanner;

public class CheckPalindrome {

    static boolean isPalindrome(int n){
        int temp = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(temp == rev) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
