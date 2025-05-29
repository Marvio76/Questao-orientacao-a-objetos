public abstract class VeiculoTransporte {
    private String nome;
   public int capacidadePassageiros;
    private int totalPassageiros;
    private int totalViagens;
    private double custoTotal;

    public VeiculoTransporte(String nome, int capacidadePassageiros) {
        this.nome = nome;
        this.capacidadePassageiros = capacidadePassageiros;
        this.totalPassageiros = 0;
        this.totalViagens = 0;
        this.custoTotal = 0;
    }

    public abstract double calcularCustoViagem();

    public void realizarViagem(int passageiros) {
        totalPassageiros += passageiros;
        totalViagens++;
        double custo = calcularCustoViagem();
        custoTotal += custo;
        System.out.println(nome + " fez uma viagem. Custo: R$ " + custo);
        if (totalViagens % 10 == 0) {
            System.out.println(nome + " precisa de manutenção.");
        }
    }

    public void exibirEstatisticas() {
        System.out.println("Veículo: " + nome);
        System.out.println("Total de passageiros: " + totalPassageiros);
        System.out.println("Total de viagens: " + totalViagens);
        System.out.println("Custo total: R$ " + custoTotal);
        System.out.println("-----------------------------");
    }


    public int getTotalPassageiros() {
        return totalPassageiros;
    }

    public int getTotalViagens() {
        return totalViagens;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
}
