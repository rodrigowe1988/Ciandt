package bytebankherdado;

public class Gerente extends FuncionarioAutenticavel{

    public double getBonificacao() {
        return  super.getSalario();
    }


}
