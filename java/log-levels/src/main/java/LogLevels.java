public class LogLevels {
    
    public static String message(String logLine) {
        String[] splited;
        String msg;
        splited = logLine.split(":");
        msg = splited[1].strip();
        return msg;
    }

    public static String logLevel(String logLine) {
        String[] splited;
        splited = logLine.split("]");
        return splited[0].replace("[", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        String level = logLevel(logLine);
        String[] splited;
        String msg;
        splited = logLine.split(":");
        msg = splited[1].strip();
        return String.format("%s (%s)", msg, level);


    }
}
