public class Moto extends Veiculo{
    public Moto(String placa, String modelo, int qntEixos) {
        super(placa, modelo, qntEixos);
    }
    @Override
    public double calcularTarifa (){
        return 5.00;
    }
}
