//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diasFumados = 0;

        System.out.println("Quantos cigarros você fuma por dia? " );
        int cigarrosDia = scanner.nextInt();

        System.out.println("Há quantos anos você fuma? " );
        int anosFumando = scanner.nextInt();

        int totalCigarros = (anosFumando * 365) *  cigarrosDia;

        int horasFumadas = (totalCigarros * 10) / 60;

        while(horasFumadas > 24){
            diasFumados += 1;
            horasFumadas = horasFumadas - 24;
        }

        System.out.printf("Você ja perdeu %d dias e %d horas de vida", diasFumados, horasFumadas);

        scanner.close();
    }
}
