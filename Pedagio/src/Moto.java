public class Moto extends Veiculo{
    public Moto(String placaVeiculo, String modelo, int qtdEixos) {
        super(placaVeiculo, modelo, qtdEixos);
    }

    @Override
    public float calcularTarifa(){
        return 5.00f;
    }
}
