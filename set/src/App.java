
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Carro> hashSetCarros = new HashSet<>();
    
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));
        hashSetCarros.add(new Carro("Chevrolet"));
        
        //Vale atentar que ele não respeita a ordem de inserção
        System.out.println(hashSetCarros);
        
        Set<Carro> treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeo"));
        treeSetCarros.add(new Carro("Chevrolet"));
        System.out.println(treeSetCarros);
    }
}
