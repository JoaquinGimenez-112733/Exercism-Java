import java.util.ArrayList;
import java.util.Arrays;

class Proverb {
    ArrayList<String> list = new ArrayList<>();

    Proverb(String[] words) {
        list.addAll(Arrays.asList(words));
    }

    String recite() {
        String result = "";
        if(list.isEmpty()){
            return result;
        }

        if(list.size() > 1) {

            for (int i = 0; i < list.size()-1; i++) {

                result += String.format("For want of a %s the %s was lost.\n", list.get(i), list.get(i+1));
            }

        }

        result += String.format("And all for the want of a %s.", list.getFirst());

        return result;
    }

}
