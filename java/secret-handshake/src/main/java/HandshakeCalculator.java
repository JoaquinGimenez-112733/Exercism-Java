import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        StringBuilder sb = new StringBuilder();
        List<Signal> list = new ArrayList<>();
        String binary = Integer.toBinaryString(number);

        sb.append(binary);
        sb.reverse();

        for (int i = 0; i < sb.toString().length(); i++) {
            if (i >= 5){
                break;
            }

            char c = sb.toString().charAt(i);

            switch (i){
                case 0:
                    if (c == '1'){
                        list.add(Signal.WINK);
                        break;
                    }
                case 1:
                    if (c == '1'){
                        list.add(Signal.DOUBLE_BLINK);
                        break;
                    }
                case 2:
                    if (c == '1'){
                        list.add(Signal.CLOSE_YOUR_EYES);
                        break;
                    }
                case 3:
                    if (c == '1'){
                        list.add(Signal.JUMP);
                        break;
                    }
                case 4:
                    if (c == '1'){
                        Collections.reverse(list);
                        break;
                    }
            }

        }
        return list;
    }

}
