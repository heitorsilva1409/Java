import java.util.Locale;
import java.util.Scanner;

public class FCJC05T01E1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int operacao = entrada.nextInt();

        float valor1;
        float valor2;
        float resultado;

        if (operacao < 0 || operacao == 8) {
            System.out.println("Opção inválida!");
        }
        else if (operacao == 7) {
            System.out.println("Saindo do programa");
        }
        else {
            valor1 = entrada.nextFloat();
            valor2 = entrada.nextFloat();

            switch (operacao) {
                case 1:
                    resultado = valor1 + valor2;
                    if (resultado % 1 == 0){
                        System.out.printf(Locale.US,"%.0f", resultado);
                    } else {
                        System.out.printf(Locale.US,"%.4f", resultado);
                    }
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    if (resultado % 1 == 0){
                        System.out.printf(Locale.US,"%.0f", resultado);
                    } else {
                        System.out.printf(Locale.US,"%.4f", resultado);
                    }
                    break;
                case 3:
                    resultado = valor1 * valor2;
                    if (resultado % 1 == 0){
                        System.out.printf(Locale.US,"%.0f", resultado);
                    } else {
                        System.out.printf(Locale.US,"%.4f", resultado);
                    }
                    break;
                case 4:
                    resultado = valor1 / valor2;
                    if (valor2 != 0) {
                        if (resultado % 1 == 0){
                            System.out.printf(Locale.US,"%.0f", resultado);
                        } else {
                            System.out.printf(Locale.US,"%.4f", resultado);
                        }
                    } else {
                        System.out.println("Não é possível dividir por zero");
                    }
                    break;
                case 5:
                    resultado = valor1 % valor2;
                    if (valor2 != 0) {
                        if (resultado % 1 == 0){
                            System.out.printf(Locale.US,"%.0f", resultado);
                        } else {
                            System.out.printf(Locale.US,"%.4f", resultado);
                        }
                    } else {
                        System.out.println("Não é possível dividir por zero");
                    }
                    break;
                case 6:
                    double d;
                    d = Math.pow(valor1,valor2);
                    if (d % 1 == 0){
                        System.out.printf(Locale.US,"%.0f", d);
                    } else {
                        System.out.printf(Locale.US,"%.4f", d);
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

