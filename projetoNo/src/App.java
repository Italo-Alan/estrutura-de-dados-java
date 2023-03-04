public class App {
    public static void main(String[] args) throws Exception {
        No<String> no1 = new No<>("Conteudo no1");
        No<String> no2 = new No<>("Conteudo no2");

        //O nó1 já faz referência ao no2
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo no3");

        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo no4");

        no3.setProximoNo(no4);

        No<Integer> no5 = new No<>(4);

        // no1 -> no2 -> no3 -> no4 -> null
        // Caso esteja no no1, você poderá recuperar o no2.
        // Caso esteja no no2 recuperará o no 3. E assim por diante.
        // Sempre que tentarmos recuperar um próximo nó e recebermos nulo devemos deduzir que terminou o encadeamento de nós.

        System.out.println(no1);

        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no3);

        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no4);
        
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        
        System.out.println(no5);
        //Basicamente este é o conceito de nó, muito importante para montar uma estrutura de dados dinâmicos.
    }
}
