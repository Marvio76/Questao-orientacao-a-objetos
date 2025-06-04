import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        VeiculoTransporte onibus = new Onibus("Ônibus 1", 50);
        VeiculoTransporte metro = new Metro("Metrô A", 200);
        VeiculoTransporte trem = new Trem("Trem X", 300);
        VeiculoTransporte vlt = new VLT("VLT Centro", 100);


        List<VeiculoTransporte> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(onibus);
        listaVeiculos.add(metro);
        listaVeiculos.add(trem);
        listaVeiculos.add(vlt);


        for (int i = 0; i <= 11; i++) {
            System.out.println("Viagem #" + (i + 1));
            for (VeiculoTransporte veiculo : listaVeiculos) {
                veiculo.realizarViagem(10);
            }
            System.out.println();
            System.out.println("Próxima viagem...");
            System.out.println("---------------------------------------");
        }
    }
}