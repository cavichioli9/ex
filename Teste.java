import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

        listaVeiculos.add(new Veiculo("ABC1234", "Toyota", "Corolla", "Branco", 180, 4, new Motor(4, 150)));
        listaVeiculos.add(new Veiculo("XYZ5678", "Honda", "Civic", "Preto", 200, 4, new Motor(4, 160)));
        listaVeiculos.add(new Veiculo("LMN9876", "Ford", "Mustang", "Vermelho", 250, 4, new Motor(8, 450)));
        listaVeiculos.add(new Veiculo("JKL5432", "Chevrolet", "Onix", "Azul", 170, 4, new Motor(3, 116)));
        listaVeiculos.add(new Veiculo("PQR6543", "Volkswagen", "Gol", "Prata", 160, 4, new Motor(4, 110)));

        System.out.println("**************** LISTA DE VEÍCULOS ****************");
        for (Veiculo v : listaVeiculos) {
            v.exibirVeiculo();
        }
    }
}
