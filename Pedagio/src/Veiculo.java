public class Veiculo {
    String placaVeiculo;
    String modelo;
    int qtdEixos;

    public Veiculo(String placaVeiculo, String modelo, int qtdEixos) {
        this.modelo = modelo;
        this.placaVeiculo = placaVeiculo;
        this.qtdEixos = qtdEixos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public float calcularTarifa() {
        return 0.0f;
    }
}
