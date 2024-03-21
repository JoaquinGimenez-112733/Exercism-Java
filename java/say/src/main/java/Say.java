import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Say {
    Map<Character, String> basic = new HashMap<>();
    Map<String, String> tenToTwenty = new HashMap<>();

    Map<String, String> twentyToHundred = new HashMap<>();


    Say() {
        this.basic.put('0', "zero");
        this.basic.put('1', "one");
        this.basic.put('2', "two");
        this.basic.put('3', "three");
        this.basic.put('4', "four");
        this.basic.put('5', "five");
        this.basic.put('6', "six");
        this.basic.put('7', "seven");
        this.basic.put('8', "eight");
        this.basic.put('9', "nine");

        this.tenToTwenty.put("zero", "ten");
        this.tenToTwenty.put("one", "eleven");
        this.tenToTwenty.put("two", "twelve");
        this.tenToTwenty.put("three", "thirteen");
        this.tenToTwenty.put("four", "fourteen");
        this.tenToTwenty.put("five", "fifteen");
        this.tenToTwenty.put("six", "sixteen");
        this.tenToTwenty.put("seven", "seventeen");
        this.tenToTwenty.put("eight", "eighteen");
        this.tenToTwenty.put("nine", "nineteen");


        this.twentyToHundred.put("two", "twenty");
        this.twentyToHundred.put("three", "thirty");
        this.twentyToHundred.put("four", "forty");
        this.twentyToHundred.put("five", "fifty");
        this.twentyToHundred.put("six", "sixty");
        this.twentyToHundred.put("seven", "seventy");
        this.twentyToHundred.put("eight", "eighty");
        this.twentyToHundred.put("nine", "ninety");

    }

    public String say(long number) {
        String auxNumber;

        if (number < 0 || number > 999999999999L) {
            throw new IllegalArgumentException();
        }

        StringBuilder sb = new StringBuilder();

        if (number >= 1_000_000_000L) {
            //billion region
            auxNumber = this.reversedNumber(number);
            List<String> list;
            list = this.cutThousands(auxNumber);

            auxNumber = String.format("%s billion",this.analizeChunk(list.get(0)));
            sb.append(auxNumber);

            if (!list.get(1).equals("000")){
                auxNumber = String.format(" %s million",this.analizeChunk(list.get(1)));
                sb.append(auxNumber);
            }
            if (!list.get(2).equals("000")){
                auxNumber = String.format(" %s thousand",this.analizeChunk(list.get(2)));
                sb.append(auxNumber);
            }
            if (!list.get(3).equals("000")){
                auxNumber = String.format(" %s",this.analizeChunk(list.get(3)));
                sb.append(auxNumber);
            }
        }
        if (number >= 1_000_000L && number < 999_999_999L) {
            //million region
            auxNumber = this.reversedNumber(number);
            List<String> list;
            list = this.cutThousands(auxNumber);

            auxNumber = String.format("%s million",this.analizeChunk(list.get(0)));
            sb.append(auxNumber);

            if (!list.get(1).equals("000")){
                auxNumber = String.format(" %s thousand",this.analizeChunk(list.get(1)));
                sb.append(auxNumber);
            }
            if (!list.get(2).equals("000")){
                auxNumber = String.format(" %s",this.analizeChunk(list.get(2)));
                sb.append(auxNumber);
            }
        }
        if (number >= 1_000L && number < 1_000_000L) {
            //a thousand region
            auxNumber = this.reversedNumber(number);
            List<String> list;
            list = this.cutThousands(auxNumber);

            auxNumber = String.format("%s thousand",this.analizeChunk(list.get(0)));
            sb.append(auxNumber);

            if (!list.get(1).equals("000")){
                auxNumber = String.format(" %s",this.analizeChunk(list.get(1)));
                sb.append(auxNumber);
            }
        }
        if (number >= 100 && number < 1_000L) {
            sb.append(this.toHundred(number));
        }
        if (number >= 20L && number < 100L) {
            sb.append(this.twentyToNinetyNine(number));
        }
        if (number >= 10L && number < 20L) {
            sb.append(this.tenToTwenty(number));
        }
        if (number >= 0L && number < 10L) {
            sb.append(this.zeroToNine(number));
        }

        return sb.toString();
    }

    public String reversedNumber(long l) {
        StringBuilder sb = new StringBuilder();
        sb.append(l);
        return sb.reverse().toString();
    }

    public List<String> cutThousands(String s) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int enteros = s.length() / 3;
        int principio = 0;
        int fin = 3;
        if (s.length() % 3 == 0) {
            for (int i = 0; i < enteros; i++) {
                sb.setLength(0);
                sb.append(s, principio, fin);
                list.add(sb.reverse().toString());

                principio += 3;
                fin += 3;
            }
        } else {
            for (int i = 0; i < enteros; i++) {
                sb.setLength(0);
                sb.append(s, principio, fin);
                list.add(sb.reverse().toString());

                principio += 3;
                fin += 3;
            }

            list.add(s.substring(principio, principio + s.length() % 3));

        }

        return list.reversed();

    }

    public String analizeChunk(String s) {
        StringBuilder sb = new StringBuilder();
        long number = Long.parseLong(s);

        if (number >= 100 && number < 1000) {
            sb.append(this.toHundred(number));
        }
        if (number >= 20 && number < 100) {
            sb.append(this.twentyToNinetyNine(number));
        }
        if (number >= 10 && number < 20) {
            sb.append(this.tenToTwenty(number));
        }
        if (number >= 0 && number < 10) {
            sb.append(this.zeroToNine(number));
        }

        return sb.toString();
    }

    public String zeroToNine(long l) {
        StringBuilder sb = new StringBuilder();
        String aux = String.valueOf(l);
        sb.append(this.basic.get(aux.charAt(0)));
        return sb.toString();
    }

    public String tenToTwenty(long l) {
        StringBuilder sb = new StringBuilder();
        String auxNumber = String.valueOf(l);
        auxNumber = this.basic.get(auxNumber.charAt(auxNumber.length() - 1));
        sb.append(this.tenToTwenty.get(auxNumber));
        return sb.toString();
    }

    public String twentyToNinetyNine(long l) {
        StringBuilder sb = new StringBuilder();
        String auxNumber = String.valueOf(l);
        String a = this.twentyToHundred.get(this.basic.get(auxNumber.charAt(0)));
        String b = this.basic.get(auxNumber.charAt(1));

        if (b.equals("zero")) {
            sb.append(String.format("%s", a));
        } else {
            sb.append(String.format("%s-%s", a, b));
        }
        return sb.toString();
    }
    public String toHundred(long l) {
        StringBuilder sb = new StringBuilder();
        String auxNumber = String.valueOf(l);
        Character a = auxNumber.charAt(0); //never zero
        sb.append(String.format("%s hundred", this.basic.get(a)));
        Character b = auxNumber.charAt(1);
        Character c = auxNumber.charAt(2);
        if (!b.equals('0')) {
            sb.append(String.format(" %s", this.twentyToHundred.get(this.basic.get(b))));
            if (!c.equals('0')) {
                sb.append(String.format("-%s", this.basic.get(c)));
            }
        } else {
            if (!c.equals('0')) {
                sb.append(String.format(" %s", this.basic.get(c)));
            }
        }
        return sb.toString();
    }
}
