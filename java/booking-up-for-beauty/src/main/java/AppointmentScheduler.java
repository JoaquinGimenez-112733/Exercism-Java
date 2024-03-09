import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter template = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(appointmentDateDescription, template);
        return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        if (appointmentDate.isBefore(LocalDateTime.now())){
            return true;
        }else{
            return false;
        }
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        if (appointmentDate.getHour() >=12 && appointmentDate.getHour() < 18){
            return true;
        } else{
            return false;
        }
    }

    public String getDescription(LocalDateTime appointmentDate) {
        // => "You have an appointment on Friday, March 29, 2019, at 3:00 PM."
        String text = "You have an appointment on";
        String weekDay =  String.valueOf(appointmentDate.getDayOfWeek());
        weekDay = capitalizeDate(weekDay);
        String monthText = String.valueOf( appointmentDate.getMonth());
        monthText = capitalizeDate(monthText);
        int day = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear();
        int hour = appointmentDate.getHour();
        int minute = appointmentDate.getMinute();
        String hourFormatted = formatHour(hour,minute);

        text =  String.format("%s %s, %s %d, %d, at %s", text, weekDay, monthText, day, year, hourFormatted);
        return text;
    }

    public LocalDate getAnniversaryDate() {
        LocalDate date = LocalDate.of(LocalDate.now().getYear(), 9,15);
        return date;
    }

    public String formatHour(int hour, int minute){
        String stringHour = "";

        if (hour > 12){
            if (minute > 9){
                stringHour = String.format("%d:%d PM.", hour-12, minute);
            }else{
                stringHour = String.format("%d:0%d PM.", hour-12, minute);
            }
        }else{
            if (minute > 9){
                stringHour = String.format("%d:%d AM.", hour, minute);
            }else{
                stringHour = String.format("%d:0%d AM.", hour, minute);
            }


        }
        return stringHour;
    }
    public String capitalizeDate(String dateDesc){
        String dateString = "";

        dateString = Character.toUpperCase(dateDesc.charAt(0)) + dateDesc.substring(1).toLowerCase();

        return dateString;
    }
}
