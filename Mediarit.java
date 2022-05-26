import java.util.Scanner;

public class Mediarit {
    public static void main(String[] args) {
        double valorA, valorB, valorC;
        double resultado;

        System.out.println("Informe tres valores inteiros quaisquer");
        System.out.print("  Primeiro valor: ");
        Scanner entrada = new Scanner(System.in);
        valorA = entrada.nextDouble();

        System.out.print("  Segundo valor: ");
        valorB = entrada.nextDouble();

        System.out.print("  Terceiro valor: ");
        valorC = entrada.nextDouble();

        resultado = (valorA + valorB + valorC) / 3;

        System.out.println("O resultado é:" + resultado);

        entrada.close();

    }

}