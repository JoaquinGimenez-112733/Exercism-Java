class Acronym {
    private String acronym = "";
    Acronym(String phrase) {
        //replace guiones

        phrase = phrase.replaceAll("-", " ");
        phrase = phrase.replaceAll("_", " ");
        String[] arrayOfWords = phrase.split(" ");

        for (int i = 0; i < arrayOfWords.length; i++) {

            for (char c : arrayOfWords[i].toCharArray()){
                this.acronym += Character.toUpperCase(c);
                break;
            }
        }
    }

    String get() {
        return this.acronym;
    }

}
