import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

class MicroBlog {
    public String truncate(String input) {
        if (input.length() < 6 ){
            return input;
        }

        return input.substring(0, input.offsetByCodePoints(0,5));
    }
}
