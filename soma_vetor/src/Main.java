import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma = 0, media = 0;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        for (int i = 0; i < vect.length; i++) {
            soma = soma + vect[i];
        }
        media = soma / n;

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f VALORES: ", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();

    }
}