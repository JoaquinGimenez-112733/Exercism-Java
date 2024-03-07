public class LogLine {
    private String logCode;
    private String msg;
    public LogLine(String logLine) {
        String[] arr = logLine.split("]");
        String code = arr[0];
        String msg  = arr[1];
        code = code.replaceAll("[\\[\\]]", "");
        msg = msg.replace(":", "");
        msg = msg.strip();

        this.logCode = code;
        this.msg = msg;
    }

    public LogLevel getLogLevel() {
        LogLevel lvl;
         lvl =  switch (this.logCode){
            case "INF":
                yield LogLevel.INFO;
            case "TRC":
                yield LogLevel.TRACE;
            case "DBG":
                yield LogLevel.DEBUG;
            case "WRN":
                yield LogLevel.WARNING;
            case "ERR":
                yield LogLevel.ERROR;
            case "FTL":
                yield LogLevel.FATAL;
             default:
                 yield LogLevel.UNKNOWN;
        };

         return lvl;
    }

    public String getOutputForShortLog() {
        LogLevel lvl = this.getLogLevel();

        return String.format("%d:%s", lvl.getOutputForShortLog(),this.msg);
    }
}
