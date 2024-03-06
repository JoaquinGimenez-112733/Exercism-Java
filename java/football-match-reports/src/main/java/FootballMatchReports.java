public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String pos = "";
       switch (shirtNum){
            case 1:
                pos = "goalie";
                break;
            case 2:
                pos = "left back";
                break;
           case 3:
           case 4:
                pos = "center back";
                break;
            case 5:
                pos = "right back";
                break;
           case 6:
           case 7:
           case 8:
                pos = "midfielder";
                break;
            case 9:
                pos = "left wing";
                break;
            case 10:
                pos = "striker";
                break;
            case 11:
                pos = "right wing";
                break;
           default:
               throw new IllegalArgumentException();
        }
        return pos;
    }
}
