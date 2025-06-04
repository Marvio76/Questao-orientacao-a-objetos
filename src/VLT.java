public class VLT extends VeiculoTransporte {
    public VLT(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public double calcularCustoViagem() {
        double capacidadePassageiros = 0;
        // valor  //taxa
        return 5.0 + (0.08 * capacidadePassageiros);
    }

    @Override
    public void manutencao() {
        if (getTotalViagens() == 10){
            System.out.println( "o veiculo fez manutenção");
        }
    }
}