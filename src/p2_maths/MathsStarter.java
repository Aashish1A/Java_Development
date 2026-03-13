package p2_maths;

import java.util.*;

public class MathsStarter {
    private static int countDigit(int n){
        if(n==1) return 1;
        int count = 0;
        while(n>0){
            count++;
            n = n / 10;
        }
        return count;
    }
    private static int sumOfDigit(int n){
        int sum = 0;
        while(n > 0){
            int ld = n%10;
            sum += ld;
            n = n/10;
        }
        return sum;
    }
    private static int[] printDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0) list.add(i);
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Total number count : " + countDigit(n));
        System.out.println("Sum of number : " + sumOfDigit(n));
        System.out.println("All divisors : " + Arrays.toString(printDivisors(n)));
    }
}
