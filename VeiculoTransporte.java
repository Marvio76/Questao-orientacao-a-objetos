package src;

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
    public abstract void manutencao();

    public void realizarViagem(int passageiros) {
        if (getTotalPassageiros() > getCapacidadePassageiros()){
            System.out.println("Impossivel fazer a viagem");
        }
        totalPassageiros += passageiros;
        totalViagens++;
        double custo = calcularCustoViagem();
        custoTotal += custo;
        System.out.println(nome + " fez uma viagem. Custo: R$ " + custo);
        manutencao();

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getTotalPassageiros() {
        return totalPassageiros;
    }

    public void setTotalPassageiros(int totalPassageiros) {
        this.totalPassageiros = totalPassageiros;
    }

    public int getTotalViagens() {
        return totalViagens;
    }

    public void setTotalViagens(int totalViagens) {
        this.totalViagens = totalViagens;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }
}
