import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome", "Italo");
        aluno.put("Idade", "26");
        aluno.put("Graduando", "true");
        aluno.put("Turma", "3º semestre");
        
        System.out.println(aluno);
        
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());
        
        List<Map> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno);
        
        
        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Isabelle");
        aluno2.put("Idade", "23");
        aluno2.put("Graduando", "true");
        aluno2.put("Turma", "5º semestre");
        
        listaAlunos.add(aluno2);
        System.out.println(listaAlunos);

        //Verifica se tem uma chave com o nome "Nome"
        System.out.println(aluno.containsKey("Nome"));
    }
}
