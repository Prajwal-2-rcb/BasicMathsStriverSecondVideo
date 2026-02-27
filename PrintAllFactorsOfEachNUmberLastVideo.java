import java.util.Scanner;

public class PrintAllFactorsOfEachNUmberLastVideo {

    static void printAllFactorsOfEachNUmberLastVideo(int[] queries) {
        int[] spf = new int[1000000+1];
        for(int i=1;i<spf.length;i++){
            spf[i]=i;
        }
        for(int i=2;i*i<spf.length;i++){
            if(spf[i]==i){
                for(int j=i*i;j<spf.length;j+=i){
                    if(spf[j]==j){
                        spf[j]=i;
                    }
                }
            }
        }
        for(int i=0;i<queries.length;i++){
            int n=queries[i];
            while(n!=1){
                System.out.println(spf[n]);
                n=n/spf[n];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of queries:");
        int queries = sc.nextInt();
        int[] arr = new int[queries];
        for (int i = 0; i < queries; i++) {
            arr[i] = sc.nextInt();
        }
        printAllFactorsOfEachNUmberLastVideo(arr);
    }
}
