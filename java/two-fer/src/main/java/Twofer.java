import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        if(Objects.isNull(name) || name.isEmpty()){
            return "One for you, one for me.";
        }else{
            return String.format("One for %s, one for me.", name);
        }
    }
}
