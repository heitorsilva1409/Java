import java.util.Scanner;

public class FCJC04T01E2 {
    public static void main(String[] args) {
        Scanner scannerEntrada = new Scanner(System.in);

        String pesoString = scannerEntrada.nextLine();
        String alturaString = scannerEntrada.nextLine();

        float peso = Float.parseFloat(pesoString.replaceAll("[^0-9,]","").replace(",","."));
        float altura = Float.parseFloat(alturaString.replaceAll("[^0-9,]","").replace(",","."));

        float imc = peso / (altura * altura);

        String status;

        if (imc < 18.5) {
            status = "Abaixo do peso";
        }
        else if ((18.4 < imc) && (imc < 25.0)) {
            status = "Peso normal";
        }
        else if ((24.9 < imc) && (imc < 30.0)) {
            status = "Sobrepeso";
        }
        else if ((29.9 < imc) && (imc < 35.0)) {
            status = "Obesidade grau I";
        }
        else if ((34.9 < imc) && (imc < 40.0)) {
            status = "Obesidade grau II";
        }
        else {
            status = "Obesidade grau III";
        }


        System.out.printf("IMC: %.2f", imc);
        System.out.println("\nClassificação: " + status);
    }
}