public class Metro extends VeiculoTransporte{
    public Metro(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public double calcularCustoViagem() {
        return 10.0 + (0.05 * capacidadePassageiros);
    }
}
