package Questao02;

public abstract class Empresa {
    private String funcionario;
    private boolean salario;

    public Empresa(String funcionario, boolean salario) {
        this.funcionario = funcionario;
        this.salario = salario;
    }

    public abstract double calcularpagamento();

    public void realizarPagamento(){
        if (salario == true) {
            System.out.println(funcionario + " vai receber R$: " + calcularpagamento());
        } else {
            System.out.println(funcionario + " teve o pagamento suspenso por inatividade. Considerado(a) desligado(a).");
        }
    }


    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public boolean getSalario() {
        return salario;
    }

    public void setSalario(boolean salario) {
        this.salario = salario;
    }
}
