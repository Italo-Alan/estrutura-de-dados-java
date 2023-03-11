import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Reanult"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Volkswagen"));

        //Retornará true se estiver sido instanciado na lista
        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro car1 = new Carro("Ford");
        Carro car2 = new Carro("Chevrolet");
        Carro car3 = new Carro("Ford");

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
    }
}
