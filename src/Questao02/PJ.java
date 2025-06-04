package Questao02;

public class PJ extends Empresa {
    private int horasTrabalhadas;
    private double valorHora;
    private String registrarEntregaProjeto;

    public PJ(String funcionario, boolean salario, int horasTrabalhadas, double valorHora, String registrarEntregaProjeto) {
        super(funcionario, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.registrarEntregaProjeto = registrarEntregaProjeto;
    }

    @Override
    public double calcularpagamento() {
        return horasTrabalhadas * valorHora;
    }




}
