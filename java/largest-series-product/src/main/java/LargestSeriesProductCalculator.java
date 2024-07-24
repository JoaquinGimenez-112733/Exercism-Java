import java.math.BigInteger;
import java.util.Arrays;

class LargestSeriesProductCalculator {

    private final String s;
    LargestSeriesProductCalculator(String inputNumber) {
        if(!esNumerica(inputNumber)){
            throw new IllegalArgumentException("String to search may only contain digits.");
        }else{
            this.s = inputNumber;
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {

        //validations
        if(this.s.length() < numberOfDigits){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if (numberOfDigits < 0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }


        long auxInt = 0;
        long largest = 0;
        StringBuilder auxString;

        BigInteger bigie = new BigInteger(this.s);
        BigInteger divisor = BigInteger.valueOf(numberOfDigits);
        BigInteger resto   = bigie.mod(divisor);
        int restoInt = resto.intValue();

        for (int j = 0; j <= restoInt+1 ; j++) {
            char[] charArr = Arrays.copyOfRange(this.s.toCharArray(), j, this.s.toCharArray().length);
            auxString = new StringBuilder();

            for (Character c : charArr){

                auxString.append(c);

                if(auxString.length() == numberOfDigits){

                    char[] li = auxString.toString().toCharArray();
                    for (int i = 0; i < numberOfDigits; i++) {
                        int auxInt1 = Integer.parseInt(Character.toString(li[i]));

                        if(i == 0){
                            auxInt = auxInt1;
                        }else{
                            auxInt = auxInt * auxInt1;
                        }
                    }

                    if(auxInt > largest){
                        largest = auxInt;
                    }
                    auxString = new StringBuilder();
                }
            }

        }

        return largest;


    }

    public boolean esNumerica(String cadena) {

        for (char c : cadena.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
