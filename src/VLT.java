public class VLT extends VeiculoTransporte {
    public VLT(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public double calcularCustoViagem() {
        double capacidadePassageiros = 0;
        return 5.0 + (0.08 * capacidadePassageiros);
    }
}