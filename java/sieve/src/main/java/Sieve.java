import java.util.ArrayList;
import java.util.List;

class Sieve {
    int maxPrimerGlobal;
    Sieve(int maxPrime) {
        this.maxPrimerGlobal = maxPrime;
    }

    List<Integer> getPrimes() {
        List<Integer> allNumbers = buildListAllNumbers(this.maxPrimerGlobal);
        List<Integer> primes = new ArrayList<>(allNumbers);
        for (Integer i : allNumbers){
            int multi = i;
            if(primes.contains(i)){
                while (i<= this.maxPrimerGlobal){
                    i = i+multi;
                    primes.remove(i);
                }
            }

        }

        return primes;
    }

    List<Integer> buildListAllNumbers(int max){
        List<Integer> l = new ArrayList<>();
        for (Integer i = 2; i <= max; i++) {
            l.add(i);
        }

        return l;
    }
}
