package academy.devdojo.maratonajava.introducao;

/*
Pr�tica
    Crie vari�veis para os campos descritos entre <> e imprima a seguinte pensagem

    Eu <nome>, morando no endere�o <endere�o> confirmo que recebi o sal�rio de <sal�rio>, na data <data>
 */
public class Aula03TiposPrimitivosExericios {
    public static void main (String []args) {

        String name = "Fl�via";
        String adress = "Rua Jo�o de Oliveira";
        int number = 1907;
        double salaryDouble = 1821.12;
        String dateReceveirSalary ="30/03/2021";
        String exercicioMensagemImpressa = "I "+ name+ " living in adress " + adress +" number "+ number+ " cofirm that i receveid the salary "
            + salaryDouble + " on date "+ dateReceveirSalary;

        System.out.println(exercicioMensagemImpressa);





    }

}
