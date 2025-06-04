

public class Trem extends VeiculoTransporte {
    public Trem(String nome, int capacidade) {

        super(nome, capacidade);
    }

    @Override
    public double calcularCustoViagem() {
        // valor  //taxa
        return 15.0 + (0.04 * capacidadePassageiros);
    }
    @Override
    public void manutencao(){
        if (getTotalViagens() == 10){
            System.out.println( "o veiculo fez manutenção");
        }
    }
}