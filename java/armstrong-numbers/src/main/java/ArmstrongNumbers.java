class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String strNumber = String.valueOf(numberToCheck);
        int count = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            char c = strNumber.charAt(i);
            int n = Character.getNumericValue(c);
            double d = Math.pow(n, strNumber.length());
            count += (int) d;

        }

        return count == numberToCheck;

    }

}
