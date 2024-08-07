import java.util.Locale;

class RotationalCipher {

    enum Alphabet{
        A(0),B(1),C(2),D(3),E(4),F(5),G(6),H(7),I(8),J(9),K(10),L(11),M(12),N(13),O(14),P(15),Q(16),
        R(17),S(18),T(19),U(20),V(21),W(22),X(23),Y(24),Z(25);

        private final int value;

        Alphabet(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

        public static Alphabet find(int value){
            for (Alphabet a : Alphabet.values()){
                if(value == a.getValue()){
                    return a;
                }
            }
            return null;
        }
    }
    private int shift = 0;
    RotationalCipher(int shiftKey) {
        this.shift = shiftKey;
    }

    String rotate(String data) {
        StringBuilder sb = new StringBuilder();

        for (Character c : data.toCharArray()){
            if(!Character.isLetter(c)){
                sb.append(c);
                continue;
            }
            Alphabet alpha = Alphabet.valueOf(c.toString().toUpperCase(Locale.ROOT));

            int index = alpha.getValue()+this.shift;
            if(index > 25){
                index = index - 26;
            }
            Alphabet newAlpha = Alphabet.find(index);
            String ch = "";
            if(Character.isLowerCase(c)){
                ch = newAlpha.toString().toLowerCase();
            }else{
                ch = newAlpha.toString().toUpperCase();
            }
            sb.append(ch);
        }

        return sb.toString();
    }

}
