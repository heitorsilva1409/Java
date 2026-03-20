public class Caminhao extends Veiculo{
    public Caminhao(String placa,  String modelo, int qntEixos) {
        super(placa, modelo, qntEixos);
    }
    @Override
    public double calcularTarifa (){
        return qntEixos * 7.5;
    }
}
