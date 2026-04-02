package service;

import domain.agenda.HorarioAgenda;
import domain.animal.Animal;
import domain.animal.Cachorro;
import domain.animal.Gato;
import domain.funcionario.Funcionario;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.LinkedList;
import java.util.List;

public class GerenciadorAgenda {
    private final List<Funcionario> funcionarios = new LinkedList<>();
    private final List<HorarioAgenda> horarios = new LinkedList<>();


    public double calcularPreco(int servico, Animal animal) {
        // calculo do preço por TIPO do pelo
        double precoPorPelo = animal.calcularPrecoPorTipoPelo(animal.getTipoPelo());

        double adicionalPorte;

        if (servico == 1) {
            if (animal instanceof Cachorro) {
                // calculo do preço adicional POR PORTE do cachorro
                adicionalPorte = ((Cachorro) animal).calcularAdicionalPorte(((Cachorro) animal).getPorte());
                return precoPorPelo * adicionalPorte;
            }
            if (animal instanceof Gato) {
                if (((Gato) animal).isAcostumadoAgua()) {
                    return precoPorPelo;
                } else {
                    return precoPorPelo + 20;
                }
            }
        } else {
            if (animal instanceof Cachorro) {
                // calculo do preço adicional POR PORTE do cachorro
                adicionalPorte = ((Cachorro) animal).calcularAdicionalPorte(((Cachorro) animal).getPorte());
                return (precoPorPelo * adicionalPorte) + 20;
            }
            if (animal instanceof Gato) {
                if (((Gato) animal).isAcostumadoAgua()) {
                    return precoPorPelo + 20;
                } else {
                    return precoPorPelo + 40;
                }
            }
        }
        return 0.00;
    }
}
