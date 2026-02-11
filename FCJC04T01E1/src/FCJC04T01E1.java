import java.util.Scanner;

class FCJC04T01E1 {
    public static void main(String[] args) {
        Scanner scannerNota = new Scanner(System.in);

        float nota1 = scannerNota.nextFloat();
        float nota2 = scannerNota.nextFloat();
        float nota3 = scannerNota.nextFloat();
        float nota4 = scannerNota.nextFloat();


        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("%.2f", media);
    }
}