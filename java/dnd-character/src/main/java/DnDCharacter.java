import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    int strength, dexterity, constitution, intelligence, wisdom, charisma;

    public DnDCharacter() {
        this.strength = this.ability(rollDice());
        this.dexterity = this.ability(rollDice());
        this.constitution = this.ability(rollDice());
        this.intelligence = this.ability(rollDice());
        this.wisdom = this.ability(rollDice());
        this.charisma = this.ability(rollDice());
    }

    int ability(List<Integer> scores) {
        List<Integer> newList = new ArrayList<>(scores);
        int count = 0;
        newList.sort(null);
        for (int i = 0; i < newList.size(); i++) {
            if (i == 0) {
                continue;
            }
            count += newList.get(i);
        }
        return count;
    }

    List<Integer> rollDice() {
        Random ran = new Random();
        List<Integer> l;
        l = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int in = 1 + ran.nextInt(6);
            l.add(in);

        }

        return l;
    }

    int modifier(int input) {
        double output = 0;

        output = Math.floor(((double) input - 10) / 2);

        return (int) output;
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + this.modifier(this.constitution);
    }
}
