public class No<T>{
    //Conteúdo do nó
    private T object;
    private No<T> refNo;

    //Constructor padrão
    public No(){

    }

    public No(T object){
        this.refNo = null;
        this.object = object;
    }

    public Object getObject(){
        return object;
    }
    
    public void setObject(T object){
        this.object = object;
    }

    public No getRefNo(){
        return refNo;
    }

    public void setRefNo(T refNo){
        this.refNo = (No<T>) refNo;
    }

    @Override
    public String toString(){
        return "No{"+
            "object=" + object +
                "}";
    }
}