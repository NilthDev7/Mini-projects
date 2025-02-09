import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            while (true) {
                System.out.println("Calculadora de perimetros");
                System.out.println("Area do Quadrado = 1\nArea do Triângulo = 2\nArea do Trapézio = 3 ");

                int um = sq.nextInt();

                switch (um) {

                    case 1:
                        System.out.println("Digite o tamanho dos dois lados (L), o sistema de medida (Cm) (m) (mmm)");
                        float alttri = sq.nextFloat();
                        float cumpr = sq.nextFloat();
                        String medida = sq.nextLine();
                        System.out.println("O perimetro do quadrado é " + alttri * cumpr + medida);
                        break;
                    case 2:
                        System.out.println("Digite o tamanho da base e a altura, e o sistema de medida (cm) (m) (mmm)");
                        float tam = sq.nextFloat();
                        float alt = sq.nextFloat();
                        String med = sq.nextLine();
                        System.out.println("A area do triângulo é " + tam * alt / 2 + med);
                        break;
                    case 3:
                        System.out.println("Digite a altura e base e o sistema de medida (cm) (m) (mmm)");
                        float al = sq.nextFloat();
                        float bs = sq.nextFloat();
                        String me = sq.nextLine();
                        System.out.println("A medidda do Trápezio é " + al * bs / 2 + me);
                        break;

                    default:
                        System.out.println("Digite um valor válido, 1 2 ou 3");
                        break;
                }
                continue;
            }
        }
    }
}

