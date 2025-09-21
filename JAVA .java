package gabrielly_ag7_ds_;

import java.util.Scanner;

public class Gabrielly_Ag7_DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite um número entre 1 e 12 para descobrir o mês: ");
            int numero = scanner.nextInt();

            switch (numero) {
                case 1:  System.out.println("Janeiro");   break;
                case 2:  System.out.println("Fevereiro"); break;
                case 3:  System.out.println("Março");     break;
                case 4:  System.out.println("Abril");     break;
                case 5:  System.out.println("Maio");      break;
                case 6:  System.out.println("Junho");     break;
                case 7:  System.out.println("Julho");     break;
                case 8:  System.out.println("Agosto");    break;
                case 9:  System.out.println("Setembro");  break;
                case 10: System.out.println("Outubro");   break;
                case 11: System.out.println("Novembro");  break;
                case 12: System.out.println("Dezembro");  break;
                default: System.out.println("Número inválido! Digite um valor entre 1 e 12.");
            }

            System.out.print("Deseja ver outro mês? (s/n): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
