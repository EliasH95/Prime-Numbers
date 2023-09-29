
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EratosthenesPrimeSieve {

    public static boolean isPrime(int p){
        int smallestPrime = 0;
        ArrayList<Integer> nonPrimes = new ArrayList<Integer>();
        ArrayList<Integer> primes = new ArrayList<Integer>();

        int num = 0;
        for (int i = 2; i < p; i++) {
            if(!nonPrimes.contains(i)){
                smallestPrime = i;
                primes.add(i);
                num = 0;
                while (num <= p){
                    num += smallestPrime;
                    if(!nonPrimes.contains(num) && num < p && !primes.contains(num)){
                        nonPrimes.add(num);
                    }
                }
            }


        }
        Collections.sort(primes);
        System.out.println(primes);
        return true;
    }

}
