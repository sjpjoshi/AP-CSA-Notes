import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
        for(int i = 0; i < #; i++) {
            System.out.println(fibo(i));
        }
        int a = fibo(2);
       */

        int[] coins = {1, 5, 10, 25};
        int amount = 500;

        int coinNumber = change(amount, coins);
        System.out.println(coinNumber);

        int b = factorial(3);
        System.out.println(b);

        String[] names = {"Alice", "Bob", "Carl", "Dan", "Ethan", "Frank", "Grace"};
        int result = binarySearch(names, "Carl", 0, names.length - 1);
        if(result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Not found");
        }

    } // main

    public static int fibo(int n) {
        int fib;
        if(n > 1) {
            fib = fibo(n - 1) + fibo(n - 2);
        } else
            fib = n;

        return fib;

    } // fibo

    public static int factorial(int n) {
        int fact;
        if(n > 1) {
            fact = factorial(n - 1) * n;
        } else
            fact = 1;

        return fact;

    } // factorial

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // theres one way to make 0 amount, to use no coins

        for(int coin : coins) {
            for(int i = coin; i <= amount; i++) {
                dp[i] = dp[i] + dp[i - coin];
            }
        }

        return dp[amount];

    } // change

    public static int binarySearch(String[] names, String target, int first, int last) {
        if(first <= last) {
            int mid = (first + last) / 2;
            if(names[mid].equals(target)) {
                return mid;
            }

            // if the target name is alphabetically before the middle, search the left half
            if(names[mid].compareTo(target) > 0) {
                return binarySearch(names, target, first, mid - 1);
            }

            return binarySearch(names, target, mid + 1, last);

        } // if

        return -1;

    } // binarySearch

} // Main