import java.util.Scanner;

public class MainVeiculo {

    public static void main(String[] args) {

        VeiculoInterface veiculo = escolherVeiculo();

        acelerar(veiculo);

    }

    static VeiculoInterface escolherVeiculo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um tipo de carro:");
        String tipoCarro = scanner.nextLine();

        VeiculoInterface veiculo = null;

        if ("CarroEsportivo".equals(tipoCarro)) {
            veiculo = new CarroEsportivo();
        } else if ("CarroPasseio".equals(tipoCarro)) {
            veiculo = new CarroPasseio();
        } else if ("Moto".equals(tipoCarro)) {
            veiculo = new Moto();
        } else if ("Onibus".equals(tipoCarro)) {
            veiculo = new Onibus();
        }

        return veiculo;
    }

    static void acelerar(VeiculoInterface veiculo) {
        veiculo.acelerar();
        veiculo.acelerar();
        System.out.println(veiculo);
    }

}
