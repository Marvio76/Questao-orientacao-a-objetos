public class Trem extends VeiculoTransporte {
    public Trem(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public double calcularCustoViagem() {
        return 15.0 + (0.04 * capacidadePassageiros);
    }
}