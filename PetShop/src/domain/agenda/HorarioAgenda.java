package domain.agenda;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class HorarioAgenda {
    private OffsetDateTime hora;

    public static boolean podeAgendar(OffsetDateTime ultimo, OffsetDateTime novo) {
        long diferenca = Duration.between(ultimo, novo).toMinutes();
        return diferenca >= 60;
    }

}
