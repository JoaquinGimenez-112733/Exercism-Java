class ResistorColorDuo {
    int value(String[] colors) {
        String auxValue = "";
        ResistorsColors[] rcolors = ResistorsColors.values();

        for (String c : colors){
            for (ResistorsColors r : rcolors){
                if (c.equals(r.toString())){
                    if (auxValue.length() == 2){
                        break;
                    }else{
                        auxValue += r.getIndex();
                    }
                }
            }
        }

        return Integer.parseInt(auxValue);
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
