import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();


        System.out.println("Entre com o nome: ");
        employee.name = sc.nextLine();

        System.out.println("Entre com o salario bruto: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Entre com o imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("Entre com a porcentagem de aumento: ");
        double taxa = sc.nextDouble();
        employee.increaseSalary(taxa);

        System.out.println();
        System.out.println(employee);

    }

}