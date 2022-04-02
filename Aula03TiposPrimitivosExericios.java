package academy.devdojo.maratonajava.introducao;

/*
Prática
    Crie variáveis para os campos descritos entre <> e imprima a seguinte pensagem

    Eu <nome>, morando no endereço <endereço> confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExericios {
    public static void main (String []args) {

        String name = "Flávia";
        String adress = "Rua João de Oliveira";
        int number = 1907;
        double salaryDouble = 1821.12;
        String dateReceveirSalary ="30/03/2021";
        String exercicioMensagemImpressa = "I "+ name+ " living in adress " + adress +" number "+ number+ " cofirm that i receveid the salary "
            + salaryDouble + " on date "+ dateReceveirSalary;

        System.out.println(exercicioMensagemImpressa);





    }

}
