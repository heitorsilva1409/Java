import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Veiculo {
    final static DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private String placaVeiculo;
    private String modeloVeiculo;
    private OffsetDateTime data;
    private String horaFormatada;

    public Veiculo(String placaVeiculo, String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.data = OffsetDateTime.now();
        horaFormatada = formatarDataHoraPadraoBrasileiro(data);
    }

    public static String formatarDataHoraPadraoBrasileiro(OffsetDateTime data) {
        return formatadorDataHora.format(data);
    }

    public String getHoraFormatada() {
        return horaFormatada;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

}
