public class Motor {
    private int qtdPist;
    private int potencia;

    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    public void exibirMotor() {
        System.out.println("Motor: " + qtdPist + " pistões, " + potencia + " CV");
    }
}
