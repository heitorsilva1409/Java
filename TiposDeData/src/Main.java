import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate dataHoraLocalAgora = LocalDate.now();
        System.out.println("Data-hora local: " + dataHoraLocalAgora);

        LocalDateTime dataHoraTempoLocalAgora = LocalDateTime.now();
        System.out.println("Data-hora-tempo local: " + dataHoraTempoLocalAgora);

        Instant dataHoraGlobalAgora = Instant.now();
        System.out.println("Instante atual(inclui fuso horário global): " + dataHoraGlobalAgora);
    }
}