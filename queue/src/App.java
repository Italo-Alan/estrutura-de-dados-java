import java.util.Queue;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        //Retorna um boolean, deixando claro se conseguiu ou não adicionar
        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);
        
        //Retorna falso caso não consiga executar.
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        //Pega o primeiro elemento da fila, se estiver vazio ele retornará null
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //Pega o primeiro elemento da fila e remove, se estiver vazio ele retornará null
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //Verifica se a fila está vazia
        System.out.println(queueCarros.isEmpty());
        //Verifica o tamanho da fila
        System.out.println(queueCarros.size());
        System.out.println(queueCarros);
    }
}
