package src;

public class Onibus extends VeiculoTransporte {
    public Onibus(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public double calcularCustoViagem() {
              // valor  //taxa
        return 3.50 + (0.1 * capacidadePassageiros);
    }

    @Override
    public void manutencao() {
        if (getTotalViagens() == 10){
            System.out.println( "o veiculo fez manutenção");
        }
    }
}
