import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Allergies {
    private int s;
    private ArrayList<Allergen> allergenFinal = new ArrayList<>();
    private ArrayList<Allergen> allAllergenReversed = new ArrayList<>(Arrays.asList(Allergen.values()));
    Allergies(int score) {
        int startPoint = score;
        while(startPoint > 255){
            startPoint -= 256;
        }

        if(score == 0){
            return;
        }
        this.s = score;
        Collections.reverse(this.allAllergenReversed);
        for (Allergen a : this.allAllergenReversed){
            if (startPoint == 0){
                break;
            }

            if (startPoint - a.getScore() >= 0){
                allergenFinal.add(a);
                startPoint -= a.getScore();
            }
        }
        Collections.reverse(allergenFinal);
    }

    boolean isAllergicTo(Allergen allergen) {
        return allergenFinal.contains(allergen);
    }

    List<Allergen> getList() {
        return allergenFinal;
    }


}
