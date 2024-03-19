class NaturalNumber {
    Classification clas;
    NaturalNumber(int number) {
        if (number <= 0){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        int count = 0;
        for (int i = 1; i < number ; i++) {
            if (number % i == 0){
                count += i;
            }
        }

        if (number == count){
            this.clas = Classification.PERFECT;
        }else if(number < count){
            this.clas = Classification.ABUNDANT;
        }else{
            this.clas = Classification.DEFICIENT;
        }
    }

    Classification getClassification() {
        return this.clas;
    }
}
