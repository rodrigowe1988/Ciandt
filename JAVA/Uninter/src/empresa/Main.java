package empresa;

import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {

        Roupa roupa1 = new Roupa("Camiseta", 10, Estacao.OUTONO);
        roupa1.msg();



        /*
        Funcionario f1 = new Assalariado("Mario", 3500);
        Funcionario f2 = new Horista("Luigi", 100, 40.5f);

        System.out.println(f1);
        System.out.println(f2);
        */

        /*
        Funcionario funcionarios[] = {  new Assalariado("Mario", 3500),
                                        new Horista("Luigi", 100, 40.5f),
                                        new Comissionado("Yoshi", 50000, 0.05f)
        };

        Funcionario f;
        float total = 0;
        for (int i = 0; i < funcionarios.length; i++) {
            f = funcionarios[i];
            System.out.printf("Nome: %s, tem a receber: %.2f.\n",f.nome, f.pagamento());
            total += f.pagamento();
        }
        System.out.printf("Total: %.2f. \n", total);

        System.out.println("-*-*-*-*-*-*-*-*");
        FormaGeometrica forma;

        //Forma sendo um quadrado
        forma = new Quadrado();
        forma.calculaArea();
        //System.out.println(forma.area);

        //Forma sendo um círculo
        forma = new Circulo();
        forma.calculaArea();
        */

        /*
        Gato g1 = new Gato();
        Animal a1 = new Gato();

        a1.emitirSom();
        g1.emitirSom();
        a1.dormir();
        g1.dormir();

        */

    }
}
