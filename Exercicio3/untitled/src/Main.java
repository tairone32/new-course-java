import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do Aluno: ");
        aluno.name = sc.nextLine();
        System.out.println("Entre com a nota do primeiro semestre: ");
        aluno.semestre1 = sc.nextDouble();
        System.out.println("Entre com a nota do segundo semestre: ");
        aluno.semestre2 = sc.nextDouble();
        System.out.println("Entre com a nota do terceiro semestre: ");
        aluno.semestre3 = sc.nextDouble();


        aluno.notaFinal();
    }
}
