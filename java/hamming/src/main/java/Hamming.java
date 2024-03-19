public class Hamming {
    int hammingDistance = 0;
    public Hamming(String leftStrand, String rightStrand) {
        int count = 0;

        validateStrands(leftStrand,rightStrand);

        for (int i = 0; i < leftStrand.length(); i++) {

            if (leftStrand.charAt(i) != rightStrand.charAt(i)){
                count++;
            }
        }

        this.hammingDistance = count;
    }

    public int getHammingDistance() {
        return this.hammingDistance;
    }

    public void validateStrands(String left, String right){

        if (left.length() != right.length()){
            throw new IllegalArgumentException("strands must be of equal length");
        }

    }
}
