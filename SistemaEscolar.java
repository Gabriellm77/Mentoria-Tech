import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Receber as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        double[] mediasBimestrais = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2.0;
        }

        // Médias semestrais
        double mediaSemestre1 = (mediasBimestrais[0] + mediasBimestrais[1]) / 2.0;
        double mediaSemestre2 = (mediasBimestrais[2] + mediasBimestrais[3]) / 2.0;

        // Média final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2.0;

        // Exibição dos resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%dº Bimestre: %.1f\n", (i + 1), mediasBimestrais[i]);
        }
        System.out.printf("1º Semestre: %.1f\n", mediaSemestre1);
        System.out.printf("2º Semestre: %.1f\n", mediaSemestre2);
        System.out.printf("Média Final: %.1f\n", mediaFinal);
    }
}
