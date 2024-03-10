import java.util.ArrayList;

class ResistorColor {
    int colorCode(String color) {
        return Resistors.valueOf(color.toUpperCase()).getIndex();
    }

    String[] colors() {
        ArrayList<String> list = new ArrayList<>();
        for(Resistors color : Resistors.values()){
            list.add(color.toString().toLowerCase());
        }

        String[] output = list.toArray(new String[list.size()]);
        return output;
    }

    public enum Resistors{

        BLACK(0),
        BROWN(1),
        RED(2),
        ORANGE(3),
        YELLOW(4),
        GREEN(5),
        BLUE(6),
        VIOLET(7),
        GREY(8),
        WHITE(9);

        public final int index;

        Resistors(int idx){
            this.index = idx;
        }
        public int getIndex(){
            return this.index;
        }

    }
}
