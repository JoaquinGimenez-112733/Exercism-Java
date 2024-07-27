import java.util.ArrayList;
import java.util.List;

class VariableLengthQuantity {

    List<String> encode(List<Long> numbers) {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arrEncoded = new ArrayList<>();

        for (Long l : numbers){

            if (l <=127){
                arrEncoded.add("0x"+Long.toHexString(l));
                continue;
            }

            int count7 = 6;
            String s = Long.toBinaryString(l);
            StringBuilder sb = new StringBuilder();
            char[] charArr = s.toCharArray();

            for (int i = charArr.length - 1; i >= 0 ; i--) {
                sb.append(charArr[i]);

                if (count7 == 0){
                    arr.add(sb.reverse().toString());
                    sb = new StringBuilder();
                    if (i != 0){
                        count7 = 6;
                    }

                }else{
                    count7--;
                }
            }

            if (count7 != 0){
                for (int i = sb.length(); i < 7 ; i++) {
                    sb.append("0");
                }
                arr.add(sb.reverse().toString());

            }

            for (int i = arr.size()-1; i >= 0; i--) {
                String auxString;
                if(i == 0){
                    auxString = "0"+arr.get(i);
                    String hexString = "0x"+Long.toHexString(Long.valueOf(auxString, 2));
                    arrEncoded.add(hexString);
                    arr.set(i, auxString);
                }else{
                    auxString = "1"+arr.get(i);
                    String hexString = "0x"+Long.toHexString(Long.valueOf(auxString, 2));
                    arrEncoded.add(hexString);
                    arr.set(i, auxString);
                }
            }

            arr = new ArrayList<>();
        }

        return arrEncoded;
    }

    List<String> decode(List<Long> bytes) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Long number : bytes) {
            String binaryString = Long.toBinaryString(number);
            String binarySegment = binaryString.length() == 8 ? binaryString.substring(1) : "0000000".substring(0, 7 - binaryString.length()) + binaryString;
            sb.append(binarySegment);
            if (binaryString.length() != 8) {
                result.add("0x" + Long.toHexString(Long.valueOf(sb.toString(), 2)));
                sb.setLength(0);
            }
        }
        if (result.isEmpty()) {
            throw new IllegalArgumentException("Invalid variable-length quantity encoding");
        }
        return result;
    }
}
