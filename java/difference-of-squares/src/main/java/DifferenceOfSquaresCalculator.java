class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int aux = 0;
        for (int i = input; i > 0 ; i--) {
            aux += i;
        }

        return (int) Math.pow(aux,2);
    }

    int computeSumOfSquaresTo(int input) {
        int aux = 0;
        for (int i = input; i > 0 ; i--) {
            aux += (int) Math.pow(i,2);
        }
        return aux;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
