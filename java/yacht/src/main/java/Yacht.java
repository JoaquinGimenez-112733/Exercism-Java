import java.util.ArrayList;

class Yacht {

    private ArrayList<Dict> d = new ArrayList<>();
    private YachtCategory y;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.y = yachtCategory;

        for (int die : dice){
            if (die == 1){
                if (this.d.stream().anyMatch(dict -> dict.getDie().equals("one"))){
                    this.d.forEach(dic ->{
                        if (dic.getDie().equals("one")){
                            dic.setValue(dic.getValue()+die);
                            dic.setQuantity(dic.getQuantity()+1);
                        }
                    });
                }else {
                    Dict dd = new Dict("one", die, 1);
                    this.d.add(dd);
                }
            } else if (die == 2) {
                if (this.d.stream().anyMatch(dict -> dict.getDie().equals("two"))){
                    this.d.forEach(dic ->{
                        if (dic.getDie().equals("two")){
                            dic.setValue(dic.getValue()+die);
                            dic.setQuantity(dic.getQuantity()+1);
                        }
                    });
                }else {
                    Dict dd = new Dict("two", die, 1);
                    this.d.add(dd);
                }
            } else if (die == 3) {
                if (this.d.stream().anyMatch(dict -> dict.getDie().equals("three"))){
                    this.d.forEach(dic ->{
                        if (dic.getDie().equals("three")){
                            dic.setValue(dic.getValue()+die);
                            dic.setQuantity(dic.getQuantity()+1);
                        }
                    });
                }else {
                    Dict dd = new Dict("three", die, 1);
                    this.d.add(dd);
                }
            } else if (die == 4) {
                if (this.d.stream().anyMatch(dict -> dict.getDie().equals("four"))){
                    this.d.forEach(dic ->{
                        if (dic.getDie().equals("four")){
                            dic.setValue(dic.getValue()+die);
                            dic.setQuantity(dic.getQuantity()+1);
                        }
                    });
                }else {
                    Dict dd = new Dict("four", die, 1);
                    this.d.add(dd);
                }
            } else if (die == 5) {
                if (this.d.stream().anyMatch(dict -> dict.getDie().equals("five"))){
                    this.d.forEach(dic ->{
                        if (dic.getDie().equals("five")){
                            dic.setValue(dic.getValue()+die);
                            dic.setQuantity(dic.getQuantity()+1);
                        }
                    });
                }else {
                    Dict dd = new Dict("five", die, 1);
                    this.d.add(dd);
                }
            } else if (die == 6) {
                if (this.d.stream().anyMatch(dict -> dict.getDie().equals("six"))){
                    this.d.forEach(dic ->{
                        if (dic.getDie().equals("six")){
                            dic.setValue(dic.getValue()+die);
                            dic.setQuantity(dic.getQuantity()+1);
                        }
                    });
                }else {
                    Dict dd = new Dict("six", die, 1);
                    this.d.add(dd);
                }
            }
        }
    }

    int score() {
        int result = 0;
        if (this.y == YachtCategory.ONES){
            for(Dict dict : this.d) {
                if (dict.getDie().equals("one")){
                    result = dict.getQuantity();
                }
            }
        }
        if (this.y == YachtCategory.TWOS){
            for(Dict dict : this.d) {
                if (dict.getDie().equals("two")){
                    result = dict.getQuantity() * 2;
                }
            }
        }
        if (this.y == YachtCategory.THREES){
            for(Dict dict : this.d) {
                if (dict.getDie().equals("three")){
                    result = dict.getQuantity() * 3;
                }
            }
        }
        if (this.y == YachtCategory.FOURS){
            for(Dict dict : this.d) {
                if (dict.getDie().equals("four")){
                    result = dict.getQuantity() * 4;
                }
            }
        }
        if (this.y == YachtCategory.FIVES){
            for(Dict dict : this.d) {
                if (dict.getDie().equals("five")){
                    result = dict.getQuantity() * 5;
                }
            }
        }
        if (this.y == YachtCategory.SIXES){
            for(Dict dict : this.d) {
                if (dict.getDie().equals("six")){
                    result = dict.getQuantity() * 6;
                }
            }
        }
        if (this.y == YachtCategory.FULL_HOUSE){
            if (this.d.stream().anyMatch(dict -> dict.getQuantity() == 3) &&
                    this.d.stream().anyMatch(dict -> dict.getQuantity() == 2)){
                for(Dict dict : this.d) {
                        result += dict.getValue();
                }
            }
        }
        if (this.y == YachtCategory.FOUR_OF_A_KIND){
            if (this.d.stream().anyMatch(dict -> dict.getQuantity() == 4 || dict.getQuantity() == 5)){
                for(Dict dict : this.d) {
                    if (dict.getQuantity() == 4 ){
                        result += dict.getValue();
                    }else if(dict.getQuantity() == 5){
                        result += dict.getValue()  * 0.8;
                    }
                }
            }
        }
        if (this.y == YachtCategory.LITTLE_STRAIGHT){
            if (this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("one")) &&
                    this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("two")) &&
                    this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("three")) &&
                    this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("four")) &&
                    this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("five"))){
                        result = 30;
            }
        }

        if (this.y == YachtCategory.BIG_STRAIGHT){
            if (    this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("two")) &&
                    this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("three")) &&
                    this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("four")) &&
                    this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("five")) &&
                    this.d.stream().anyMatch(dict -> dict.getQuantity() == 1 && dict.getDie().equals("six"))) {
                         result = 30;
            }
        }
        if (this.y == YachtCategory.CHOICE){
                for(Dict dict : this.d) {
                        result += dict.getValue();

                }
            }

        if (this.y == YachtCategory.YACHT){
            if (this.d.stream().anyMatch(dict -> dict.getQuantity() == 5)){
                for(Dict dict : this.d) {
                    if (dict.getQuantity() == 5){
                        result = 50;
                    }
                }
            }
        }
        return result;
    }

}

class Dict{
    private String die;
    private int value;
    private int quantity;

    public Dict(String die, int value, int quantity) {
        this.die = die;
        this.value = value;
        this.quantity = quantity;
    }

    public String getDie() {
        return die;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
