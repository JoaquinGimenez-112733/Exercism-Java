import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(this.languages.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    public String firstLanguage() {
        return this.languages.getFirst();
    }

    public int count() {
        return this.languages.size();        
    }

    public boolean containsLanguage(String language) {
        return this.languages.contains(language);
    }

    public boolean isExciting() {
        boolean res = false;
        for(String lang : this.languages){
            if(lang.equals("Kotlin") || lang.equals("Java")){
                res = true;
            }else{
                res = false;
            }
        }   
        return res;
    }
}
