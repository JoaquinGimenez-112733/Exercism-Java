import java.util.Locale;

class Atbash {
    enum Alphabet{
        A(0),B(1),C(2),D(3),E(4),
        F(5),G(6),H(7),I(8),J(9),
        K(10),L(11),M(12),N(13),O(14),
        P(15),Q(16),R(17),S(18),T(19),
        U(20),V(21),W(22),X(23),Y(24),
        Z(25);

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
    enum AlphabetBackwards{
        Z(0),Y(1),X(2),W(3),V(4),
        U(5),T(6),S(7),R(8),Q(9),
        P(10),O(11),N(12),M(13),L(14),
        K(15),J(16),I(17),H(18),G(19),
        F(20),E(21),D(22),C(23),B(24),
        A(25);

        private final int value;

        AlphabetBackwards(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }

        public static AlphabetBackwards find(int value){
            for (AlphabetBackwards a : AlphabetBackwards.values()){
                if(value == a.getValue()){
                    return a;
                }
            }
            return null;
        }
    }


    String encode(String input) {
        input = input.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        String aux = "";

        for (int i = 0; i < input.length(); i++) {

            Character c = input.charAt(i);
            if (Character.isLetter(c)){
                Alphabet a = Alphabet.valueOf(Character.toString(c).toUpperCase());
                AlphabetBackwards b = AlphabetBackwards.find(a.getValue());
                sb.append(b.toString().toLowerCase());
            }else if(Character.isDigit(c)){
                sb.append(c);
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            if(i % 5 == 0 && i != 0){
                aux += " ";
            }
            aux += sb.toString().charAt(i);
        }
        return aux;
    }

    String decode(String input) {
        input = input.replaceAll(" ","");
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()){
            if(Character.isLetter(c)){
                AlphabetBackwards valueB = AlphabetBackwards.valueOf(Character.toString(c).toUpperCase(Locale.ROOT));
                Alphabet valueA = Alphabet.find(valueB.getValue());
                sb.append(valueA.toString().toLowerCase());
            } else if (Character.isDigit(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }



}
