import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Data-hora local (sem zulu time)
        LocalDate dataHoraLocalAgora = LocalDate.now();
        System.out.println("Data-hora local: " + dataHoraLocalAgora);

        LocalDateTime dataHoraTempoLocalAgora = LocalDateTime.now();
        System.out.println("Data-hora-tempo local: " + dataHoraTempoLocalAgora);

        // Data-hora global (com zulu time)
        Instant instanteDataHoraGlobal = Instant.now();
        System.out.println("Instante atual(inclui fuso horário global): " + instanteDataHoraGlobal);

        // Para formatar a data-hora Global é necessário que a zona(zulu time) da data-hora seja informada
        DateTimeFormatter formatadorPadraoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        System.out.println("Instante atual formatado: " + formatadorPadraoBrasil.format(instanteDataHoraGlobal));

        // Extrair dados especificos de uma data SEM hora
        System.out.println("Dia do mês: " + dataHoraLocalAgora.getDayOfMonth());
        System.out.println("Dia da semana: " + dataHoraLocalAgora.getDayOfWeek());
        System.out.println("Dia do ano: " + dataHoraLocalAgora.getDayOfYear());
        System.out.println("Mês do dia: " + dataHoraLocalAgora.getMonth());
        System.out.println("Número de mês do dia: " + dataHoraLocalAgora.getMonthValue());
        System.out.println("Ano do dia: " + dataHoraLocalAgora.getYear());

        // Extrair dados de HORA de uma data
        // * esses métodos só funcionam em variáveis de tempo que contenham informações de tempo(ex LocalDateTime)
        System.out.println("Hora da data: " + dataHoraTempoLocalAgora.getHour());
        System.out.println("Minutos da data: " + dataHoraTempoLocalAgora.getMinute());
        System.out.println("Segundos da data: " + dataHoraTempoLocalAgora.getSecond());

        // Operações com datas
        // * funciona tanto para LocalDate quanto para LocalDateTime(exceto as operações de horas, minutos e segundos)
        System.out.println("Dia atual mais um dia: " + dataHoraLocalAgora.plusDays(1));
        System.out.println("Dia atual mais uma semana: " + dataHoraLocalAgora.plusWeeks(1));
        System.out.println("Dia atual mais um mês: " + dataHoraLocalAgora.plusMonths(1));
        System.out.println("Dia atual mais um ano: " + dataHoraLocalAgora.plusYears(1));

        // Operações com horas, minutos e segundos
        // Dessa forma não funciona para variáveis do tipo Instant
        System.out.println("Hora atual mais dez minutos: " + formatadorPadraoBrasil.format(dataHoraTempoLocalAgora.plusMinutes(10)));
        System.out.println("Hora atual mais dez horas: " + formatadorPadraoBrasil.format(dataHoraTempoLocalAgora.plusHours(10)));
        System.out.println("Hora atual mais dez segundos: " + formatadorPadraoBrasil.format(dataHoraTempoLocalAgora.plusSeconds(10)));

        // Operações com variáveis do tipo Instant
        System.out.println("Instante mais uma hora: " + formatadorPadraoBrasil.format(instanteDataHoraGlobal.plus(1, ChronoUnit.HOURS)));

        // Duração entre duas datas
        // * não funciona para LocalDate pois não possui informações de tempo hora, minutos e segundos. Se for preciso, usar o método .atTime(Horas, minutos) que será possível
        Duration duracaoEntreDuasDatas = Duration.between(dataHoraTempoLocalAgora.minusMonths(2), dataHoraTempoLocalAgora);
        System.out.println("Duração entre duas datas(em dias): " + duracaoEntreDuasDatas.toDays());
        System.out.println("Duração entre duas datas(em horas): " + duracaoEntreDuasDatas.toHours());
        System.out.println("Duração entre duas datas(em minutos): " + duracaoEntreDuasDatas.toMinutes());
        System.out.println("Duração entre duas datas(em segundos): " + duracaoEntreDuasDatas.toSeconds());
    }
}