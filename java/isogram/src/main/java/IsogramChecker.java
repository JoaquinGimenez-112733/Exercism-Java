import java.util.ArrayList;
import java.util.List;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        List<Character> list = new ArrayList<>();
        boolean b = true;

        for (Character c : phrase.toCharArray()) {
            if (c == '-' || c == ' ') continue;
            for (Character ch : list){
                if (ch == c){
                    b = false;
                    return b;
                }
            }

            list.add(c);
        }
        return b;
    }

}
