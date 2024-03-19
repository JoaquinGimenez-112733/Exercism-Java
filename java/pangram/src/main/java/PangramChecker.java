import java.util.Objects;

public class PangramChecker {

    public boolean isPangram(String input) {
        if (input.length() < 26){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        boolean charExists = false;

        input = input.toUpperCase();
        input = input.replaceAll(" ", "");
        input = input.replaceAll("_", "");


        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))){
                for (int j = 0; j < sb.toString().length(); j++) {
                    if (Objects.equals(input.charAt(i), sb.charAt(j))){
                        charExists = true;
                        break;
                    }else{
                        charExists = false;
                    }
                }

                if (!charExists){
                    sb.append(input.charAt(i));
                }

            }
        }
        System.out.println(sb.toString().length());
        if (sb.length() == 26){
            return true;
        }else{
            return false;
        }
    }



}
