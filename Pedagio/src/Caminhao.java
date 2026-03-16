public class Caminhao extends Veiculo{
    public Caminhao(String placaVeiculo, String modelo, int qtdEixos) {
        super(placaVeiculo, modelo, qtdEixos);
    }

    @Override
    public float calcularTarifa(){
        return qtdEixos * 7.5f;
    }
}
