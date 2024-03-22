import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DiamondPrinter {
    final String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    List<String> printToList(char a) {
        List<String> list = new ArrayList<>();
        StringBuilder sb  = new StringBuilder();
        String splited = abc.split(Character.toString(a))[0] + a;

        int j = splited.length();
        for (int i = 0; i < splited.length(); i++) {
            j--;
            sb.setLength(0);

            if (splited.charAt(i) == 'A'){
                for (int l = 0; l < splited.length(); l++) {
                    if (l == j) {
                        sb.append(splited.charAt(i));
                    } else {
                        sb.append(' ');
                    }
                }
            }else{
                for (int k = 0; k < splited.length()-1; k++) {
                    if (k == j) {
                        sb.append(splited.charAt(i));
                    } else {
                        sb.append(' ');
                    }
                }
            }
            if (i == 0) {
                String aux = sb.toString().replace(Character.toString(splited.charAt(i)), "");
                list.add(sb+ aux);
            } else {
                String aux = sb + " " + sb.reverse();
                list.add(aux);
            }

        }
        List <String> list2 = new ArrayList<>(list);
        Collections.reverse(list2);
        list2.removeFirst();
        list.addAll(list2);
        return list;
    }

}
