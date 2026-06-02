public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected int qntEixos;

    public Veiculo(String placa, String modelo, int qntEixos) {
        if(placa.isEmpty() || modelo.isEmpty()){
            System.out.println("Não é possivel colocar uma placa ou modelo vazio.");
        }
        this.placa = placa;
        this.modelo = modelo;
        this.qntEixos = qntEixos;
    }

    public double calcularTarifa () {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("Veiculo: %s - Placa: %s - Modelo: %s - Eixos: %d - Total a pagar: %.2f%n", getClass().getSimpleName(), placa, modelo, qntEixos, calcularTarifa());
    }
}
