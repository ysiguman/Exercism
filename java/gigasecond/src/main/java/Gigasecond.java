import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDateTime = birthDate.atTime(0,0,0);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        long giga = 1000000000;
        LocalDateTime newDate = this.birthDateTime.plusSeconds(giga);
        return newDate;
    }

}
