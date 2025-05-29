public class Main {
    public static void main(String[] args) {
        VeiculoTransporte onibus = new Onibus("Ônibus 1", 50);
        VeiculoTransporte metro = new Metro("Metrô A", 200);
        VeiculoTransporte trem = new Trem("Trem X", 300);
        VeiculoTransporte vlt = new VLT("VLT Centro", 100);


        for (int i = 0; i < 12; i++) {
            onibus.realizarViagem(40);
            metro.realizarViagem(180);
            trem.realizarViagem(250);
            vlt.realizarViagem(90);
        }

        VeiculoTransporte[] veiculos = {onibus, metro, trem, vlt};

    }
}
