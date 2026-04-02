package domain.agenda;

import domain.animal.Animal;
import domain.funcionario.Funcionario;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class HorarioAgenda {
    private final OffsetDateTime horario;
    private final Animal animal;
    private final Funcionario funcionario;

    public HorarioAgenda(Animal animal, OffsetDateTime horario, Funcionario funcionario) {
        this.animal = animal;
        this.horario = horario;
        this.funcionario = funcionario;
    }
}
