import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class Scrabble {
    int score = 0;
    Map<Character, Integer> values = new HashMap<>();

    public void setValues() {
        this.values.put('A',1);
        this.values.put('E',1);
        this.values.put('I',1);
        this.values.put('O',1);
        this.values.put('U',1);
        this.values.put('L',1);
        this.values.put('N',1);
        this.values.put('R',1);
        this.values.put('S',1);
        this.values.put('T',1);

        this.values.put('D',2);
        this.values.put('G',2);

        this.values.put('B',3);
        this.values.put('C',3);
        this.values.put('M',3);
        this.values.put('P',3);

        this.values.put('F',4);
        this.values.put('H',4);
        this.values.put('V',4);
        this.values.put('W',4);
        this.values.put('Y',4);

        this.values.put('K',5);

        this.values.put('J',8);
        this.values.put('X',8);

        this.values.put('Q',10);
        this.values.put('Z',10);


    }

    Scrabble(String word) {
        this.setValues();

        word = word.toUpperCase();
        for (Character c :  word.toCharArray()){
            this.score += this.values.get(c);
        }
    }

    int getScore() {
        return this.score;
    }

}
