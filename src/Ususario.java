import java.util.ArrayList;
import java.util.List;

public class Ususario {
    int id;
    String nome;
    List<Livro> livroEmprestados;

    public Ususario() {
    }

    public Ususario(int id, String nome, List<Livro> livroEmprestados) {
        this.id = id;
        this.nome = nome;
        this.livroEmprestados = livroEmprestados;
    }

    public Ususario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.livroEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void pegarLivroEmprestado(Livro livro) {
        try {
            livro.epmrestar();
            this.livroEmprestados.add(livro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void devolverLivroEmprestado(Livro livro) {
        try {
            livro.devolver();
            this.livroEmprestados.remove(livro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Ususario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", livroEmprestados=" + livroEmprestados +
                '}';
    }
}
