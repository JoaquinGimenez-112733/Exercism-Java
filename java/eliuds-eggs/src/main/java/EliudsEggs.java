
public class EliudsEggs {
    public int eggCount(int number) {
        String bin = Integer.toBinaryString(number);
        int count = 0;
        for (char c : bin.toCharArray()){
            if (c == '1'){
                count++;
            }
        }
        return count;
      }
}
