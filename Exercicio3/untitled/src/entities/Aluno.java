package entities;

public class Aluno {

    public String name;

    public double semestre1;

    public double semestre2;

    public double semestre3;

    public double quantoFalta;


    public void notaFinal() {
        var a = semestre1 + semestre2 + semestre3;
        if (a < 60.0) {
            var quantoFalta = 60 - a;
             System.out.println("Sua nota foi:  " + a + " Faltou: " + quantoFalta + " para ser aprovado");
        } else {
             System.out.println("Parabésn voce passou de ano e sua media foi: " + a);
        }

    }
}
