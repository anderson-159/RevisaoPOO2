public class Moto implements VeiculoInterface {

    private int velocidade;

    @Override
    public void acelerar() {
        this.velocidade += 15;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "velocidade=" + velocidade +
                '}';
    }
}
}