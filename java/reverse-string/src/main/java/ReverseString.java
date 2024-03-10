import java.util.Objects;

class ReverseString {

    String reverse(String inputString) {

        String output = "";
        if (!Objects.isNull(inputString) && !inputString.isEmpty()) {
            int len = inputString.length();
            for (int i = 0; i < len; i++) {
                char c = inputString.charAt(((i - len) * -1)-1);
                output += c;
            }
        }
        return output;
    }

}
