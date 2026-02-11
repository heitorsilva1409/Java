import java.util.Scanner;

public class FCJC05T05E2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean condicao = true;
        float totalNota = 0;
        float mediaFinal;
        float nota;
        int contador = 0;
        int qtdInvalidas = 0;

        while (condicao) {
            nota = entrada.nextFloat();
            entrada.nextLine();

            if (nota >= 0 && nota <= 10) {
                totalNota += nota;
                contador += 1;
            }
            else if (nota > 10) {
                qtdInvalidas += 1;
                break;
            }
            else {
                break;
            }
        }
        if (qtdInvalidas > 0) {
            System.out.println("Nota inválida");
        }
        else if(qtdInvalidas == 0 && contador != 0) {
            mediaFinal = totalNota / contador;
            System.out.printf("A média final do aluno é: %.2f", mediaFinal);
        }
        else {
            System.out.println("Nenhuma nota foi informada");
        }
    }
}