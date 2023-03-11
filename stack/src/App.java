import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);

        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);
        
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        //Retornará true se a Stack estiver vazia.
        System.out.println(stackCarros.empty());
    }
}
