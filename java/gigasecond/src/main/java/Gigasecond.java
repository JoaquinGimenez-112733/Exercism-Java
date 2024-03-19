import java.time.*;


public class Gigasecond {
    LocalDateTime local;
    public Gigasecond(LocalDate moment) {
        //gigas constant
        long gigas = 1000000000L;
        //moment
        LocalDateTime momentDateTime = LocalDateTime.of(moment, LocalTime.MIDNIGHT);
        Instant momentInstant = momentDateTime.toInstant(ZoneOffset.UTC);
        long momentSeconds = momentInstant.getEpochSecond();

        long sumSeconds = gigas + momentSeconds;

        Instant finalInstant = Instant.ofEpochSecond(sumSeconds);
        LocalDateTime local = LocalDateTime.ofInstant(finalInstant, ZoneOffset.UTC);

        this.local = local;
    }

    public Gigasecond(LocalDateTime moment) {
        long gigas = 1000000000L;

        Instant momentInstant = moment.toInstant(ZoneOffset.UTC);
        long momentSeconds = momentInstant.getEpochSecond();

        long sumSeconds = gigas + momentSeconds;

        Instant finalInstant = Instant.ofEpochSecond(sumSeconds);
        LocalDateTime local = LocalDateTime.ofInstant(finalInstant, ZoneOffset.UTC);

        this.local = local;

    }

    public LocalDateTime getDateTime() {
        return local;
    }
}
