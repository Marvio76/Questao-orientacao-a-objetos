public class Onibus extends VeiculoTransporte {
    public Onibus(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public double calcularCustoViagem() {
        return 3.50 + (0.1 * capacidadePassageiros);
    }
}
