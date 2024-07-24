class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll("\\s+", "");
        if(!isNumeric(candidate)){
            return false;
        }
        if(candidate.length() <= 1){
            return false;
        }

        String aux = doubledCode(candidate);
        int sum = sumCode(aux);

        if(sum % 10 == 0){
            return true;
        }else{
            return false;
        }


    }

    boolean isNumeric(String code){
        for (Character c : code.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    String doubledCode(String code){
        StringBuilder sb = new StringBuilder(code);
        StringBuilder sb2 = new StringBuilder();
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if(i % 2 == 0){
                sb2.append(sb.charAt(i));
            }else{
                int in = Integer.parseInt(Character.toString(sb.charAt(i)));
                in = in*2;

                if(in > 9){
                    in = in-9;
                }

                sb2.append(in);
            }
        }
        return sb2.toString();
    }

    int sumCode(String code){
        int sum = 0;

        for (Character c : code.toCharArray()){
            sum += Integer.parseInt(Character.toString(c));
        }
        return sum;
    }
}
