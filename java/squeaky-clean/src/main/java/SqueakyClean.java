class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder newString = new StringBuilder();
        final char guionMedio = '-';

        for(int i = 0; i < identifier.length(); i++){
            char ch = identifier.charAt(i);

            if (ch == ' '){
                ch = '_';
            }
            if(ch == guionMedio){

                continue;
            }
            if(i >= 1){
                if(identifier.charAt(i-1) == guionMedio){
                    ch = Character.toUpperCase(ch);
                }
            }

            if(ch == '4'){
                ch = 'a';
            }else if(ch == '3'){
                ch = 'e';
            }else if(ch == '7'){
                ch = 't';
            } else if(ch == '0'){
                ch = 'o';
            }else if(ch == '1'){
                ch = 'l';
            }

            if (!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '_'){
                continue;
            }
            newString.append(ch);
        }



        return newString.toString();
    }
}
