class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        for (char c : stringToVerify.toCharArray()){
            if(!Character.isDigit(c)){
                if (c != '-' && c != 'X'){
                    return false;
                }
            }
        }

        stringToVerify = stringToVerify.replaceAll("-","");
        if (stringToVerify.length() != 10){
            return false;
        }
        int count = 0, charIndex = 0;

        for (int i = 10; i > 0 ; i--) {
            int aux;
            char c = stringToVerify.charAt(charIndex);
            if (c == 'X' && i == 1){
                aux = 10;
            }else{
                try{
                    aux = Integer.parseInt(String.valueOf(stringToVerify.charAt(charIndex)));
                }catch (Exception e){
                    return false;
                }
            }
            count += aux * i;
            charIndex++;
        }

        return count % 11 == 0;
    }
}
