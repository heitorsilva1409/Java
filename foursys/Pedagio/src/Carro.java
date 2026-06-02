public class Carro extends Veiculo{
    public Carro(String placa, String modelo, int qntEixos) {
        super(placa, modelo, qntEixos);
    }
    @Override
    public double calcularTarifa (){
        return 12.00;
    }
}
