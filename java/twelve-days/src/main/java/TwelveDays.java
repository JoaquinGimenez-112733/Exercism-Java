import java.util.ArrayList;
import java.util.Arrays;

class TwelveDays {

    String entireSong = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, " +
            "two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " +
            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " +
            "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " +
            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," +
            " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," +
            " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " +
            "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
            "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " +
            "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

    String[] verses = this.entireSong.split("\n");
    ArrayList<String> v = new ArrayList<>();

    String verse(int verseNumber) {
        cleanList();
        return this.v.get(verseNumber-1);
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        cleanList();
        for (int i = startVerse-1; i <= endVerse-1 ; i++) {
            if (i == endVerse-1){
                sb.append(this.v.get(i));
            }else {
                sb.append(this.v.get(i)).append("\n");
            }
        }

        return sb.toString();
    }
    
    String sing() {
        return this.entireSong;
    }

    void cleanList(){
        this.v = new ArrayList<>();
        for (String s : this.verses){
            if (!s.isEmpty()){
                this.v.add(s+"\n");
            }
        }
    }
}
