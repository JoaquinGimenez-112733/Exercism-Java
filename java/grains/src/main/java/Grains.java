import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {

        if (square <= 0 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        BigInteger bi = BigInteger.valueOf(1);

        for (int i = 1; i < square+1; i++) {
            if (i == 1){
                continue;
            }
            bi = bi.multiply(BigInteger.valueOf(2));
        }
        return bi;
    }

    BigInteger grainsOnBoard() {
        BigInteger bi = BigInteger.valueOf(1);
        BigInteger aux = BigInteger.valueOf(1);
        for (int i = 1; i <= 64; i++) {
            if (i == 1){
                continue;
            }
            bi = bi.multiply(BigInteger.valueOf(2));
            aux = aux.add(bi);
        }
        return aux;
    }

}
