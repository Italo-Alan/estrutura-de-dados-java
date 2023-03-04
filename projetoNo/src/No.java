import java.lang.reflect.Constructor;

/*
 * Refatoração da classe
 *  Foi adicionado um tipo <T> que determina que ela pode receber qualquer tipo.
 * Obrigatóriamente os tipos nós encadeados serão desse tipo gerenérico <T>
*/


public class No<T>{
    private T conteudo;
    private No<T> proximoNo;

    //Construtor
    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return conteudo;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo(){
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo){
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString(){
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
        }
}
