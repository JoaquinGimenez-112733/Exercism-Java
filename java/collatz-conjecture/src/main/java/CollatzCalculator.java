class CollatzCalculator {

    int computeStepCount(int start) {

        if (start <= 0){
            throw new IllegalArgumentException("Only positive integers are allowed");
        }

        int count = 0;
        while (start != 1){

            if(start % 2 == 0){
                start = evenCalculation(start);
            }else{
                start = oddCalculation(start);
            }
            count++;
        }


        return count;
    }

    public int evenCalculation(int n){
        return n / 2;
    }

    public int oddCalculation(int n){
        return n*3+1;
    }

}
