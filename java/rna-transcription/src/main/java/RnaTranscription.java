import java.util.Objects;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder output = new StringBuilder();
        char[] charArray = dnaStrand.toCharArray();

        for (char c : charArray){
            for (Dna d : Dna.values()){
                if (Objects.equals(d.toString(), Character.toString(c))){
                    output.append(d.getRna());
                }
            }
        }

        return output.toString();
    }

    public enum Dna{
        G('C'),C('G'),T('A'),A('U');

        private final char rna;

        Dna(char c){
            this.rna = c;
        }

        public char getRna(){
            return this.rna;
        }
    }
}
