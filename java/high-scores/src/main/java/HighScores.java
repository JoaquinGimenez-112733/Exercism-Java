import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class HighScores {
    List<Integer> hs = new ArrayList<>();

    public HighScores(List<Integer> highScores) {
        this.hs = highScores;
    }

    List<Integer> scores() {
        return this.hs;
    }

    Integer latest() {
        int len = this.hs.size();
        return this.hs.get(len - 1);
    }

    Integer personalBest() {
        List<Integer> auxList = new ArrayList<>(this.hs);
        int len = this.hs.size();
        auxList.sort(null);

        return auxList.get(len - 1);
    }

    List<Integer> personalTopThree() {
        List<Integer> outputList = new ArrayList<>();
        List<Integer> auxList = new ArrayList<>(this.hs);

        int len = auxList.size();
        auxList.sort(Comparator.reverseOrder());

        for (int i = 0; i < len ; i++) {
            if (i == 3){
                break;
            }
            outputList.add(auxList.get(i));
        }


        return outputList;
    }

}
