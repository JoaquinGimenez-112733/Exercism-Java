import java.math.BigInteger;

class ResistorColorTrio {
    String label(String[] colors) {
        String auxValue = "";
        int zeros = 0;
        ResistorsColors[] rcolors = ResistorsColors.values();
        for (int i = 0; i < colors.length; i++) {
            if (i > 2){
                break;
            }

            for (ResistorsColors r : rcolors){
                if (colors[i].equals(r.toString())){
                    if (i == 2){
                        int zerosAux = r.getIndex();

                        for (int j = 0; j < zerosAux; j++) {
                            auxValue += "0";
                        }

                        if (auxValue.isEmpty()){
                            auxValue = "0";
                        }else{
                            for (int j = 0; j < auxValue.length(); j++) {
                               if (auxValue.charAt(j) == '0'){
                                   zeros++;
                               }
                            }
                            switch (zeros){
                                case 1,2:
                                    int value = Integer.parseInt(auxValue);
                                    return value + " ohms";
                                case 3, 4, 5:
                                    value = Integer.parseInt(auxValue) / (int) Math.pow(10,3);
                                    return value + " kiloohms";
                                case 6,7,8:
                                    value = Integer.parseInt(auxValue) / (int) Math.pow(10,6);
                                    return value + " megaohms";
                                case 9:
                                    BigInteger big = new BigInteger(auxValue);
                                    int divisor = (int) Math.pow(10,zeros);
                                    BigInteger div = BigInteger.valueOf(divisor);
                                    BigInteger v = big.divide(div);
                                    return v + " gigaohms";
                            }
                        }
                        return auxValue + " ohms";
                        //break;
                    }
                    if (r.getIndex() == 0 && auxValue.isEmpty()){
                        continue;
                    }
                    auxValue += r.getIndex();

                }
            }
        }
        return auxValue;
    }


    public enum ResistorsColors{
        black(0),
        brown(1),
        red(2),
        orange(3),
        yellow(4),
        green(5),
        blue(6),
        violet(7),
        grey(8),
        white(9);
        final int index;
        ResistorsColors(int index){
            this.index = index;
        }
        int getIndex(){
            return this.index;
        }
    }
}
