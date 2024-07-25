import java.util.HashSet;
import java.util.Set;

class SumOfMultiples {
    private int lvlCap;
    private int[] setGlobal;
    private Set<Integer> setEnergy = new HashSet<>();
    SumOfMultiples(int number, int[] set) {
        this.lvlCap = number;
        this.setGlobal = set;
    }

    int getSum() {
        int sum = 0;
        for (int i : this.setGlobal){
            if(i <= 0){
                continue;
            }
            int multi = i;
            while (multi < this.lvlCap){
                if(!this.setEnergy.contains(multi)){
                    sum += multi;
                    this.setEnergy.add(multi);
                }

                multi += i;
            }
        }
        return sum;
    }

}
