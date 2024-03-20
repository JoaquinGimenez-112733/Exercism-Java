import java.util.*;


class ProteinTranslator {
    Map<String, String> codons = new HashMap<>();

    ProteinTranslator(){
        this.codons.put("AUG","Methionine");
        this.codons.put("UUU","Phenylalanine");
        this.codons.put("UUC","Phenylalanine");
        this.codons.put("UUA","Leucine");
        this.codons.put("UUG","Leucine");
        this.codons.put("UCU","Serine");
        this.codons.put("UCC","Serine");
        this.codons.put("UCA","Serine");
        this.codons.put("UCG","Serine");
        this.codons.put("UAU","Tyrosine");
        this.codons.put("UAC","Tyrosine");
        this.codons.put("UGU","Cysteine");
        this.codons.put("UGC","Cysteine");
        this.codons.put("UGG","Tryptophan");
        this.codons.put("UAA","STOP");
        this.codons.put("UAG","STOP");
        this.codons.put("UGA","STOP");
    }
    List<String> translate(String rnaSequence) {

        List<String> listProteins = new ArrayList<>();
        double amountCodons = Math.ceil((double) rnaSequence.length() / 3) ;
        int inferiorPos = 0;
        int superiorPos = 3;

        for (int i = 0; i < amountCodons; i++) {
            try {
                String codon = rnaSequence.substring(inferiorPos, superiorPos);
                String protein = this.codons.get(codon);
                if (Objects.isNull(protein)){
                    throw  new IllegalArgumentException("Invalid codon");
                }
                if (protein.equals("STOP")){
                    break;
                }
                listProteins.add(protein);

                inferiorPos += 3;
                superiorPos += 3;
            }catch (StringIndexOutOfBoundsException e){
                throw  new IllegalArgumentException("Invalid codon");
            }
        }

        return listProteins;
    }
}
