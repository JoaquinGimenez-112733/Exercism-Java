import java.util.ArrayList;

class PrimeCalculator {
    ArrayList<Integer> primes = new ArrayList<>();
    int nth(int nth) {
        if(nth <= 0){
            throw new IllegalArgumentException();
        }

        int count = 1;
        int result = 2 ;
        while (count != nth){
            boolean flag = true;
            if(result % 2 == 0){
                if(result == 2){
                    primes.add(result);
                }
                result++;
                continue;
            }

            for (Integer i : primes){
                if(result % i == 0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                count++;
                primes.add(result);
            }

            if(count == nth){
                continue;
            }
            result++;

        }

        return result;

    }

}
