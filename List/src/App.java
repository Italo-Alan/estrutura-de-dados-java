
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros.contains(new Carro("Ford")));

        //Pega o carro na posição 2
        System.out.println(listCarros.get(2));

        //Saber em qual índice está o carro que passarmos como parâmetro,caso não encontre, o método retornará -1
        System.out.println(listCarros.indexOf(new Carro("Fiat")));
        
        //O método remove o que estiver no índice passado como parâmetro
        System.out.println(listCarros.remove(3));
        System.out.println(listCarros);
    }
}
