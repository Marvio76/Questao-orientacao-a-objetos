package Questao02;

public class CLT extends Empresa {

    public CLT(String funcionario, boolean salario) {
        super(funcionario, salario);
    }

    @Override
    public double calcularpagamento() {
        return 3000;
    }
}
