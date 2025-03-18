import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Ususario> ususarios;
    private List<Emprestimo> emprestimos;

    Emprestimo emprestimo;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.ususarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public Biblioteca(List<Livro> livros, List<Emprestimo> emprestimos, List<Ususario> ususarios) {
        this.livros = new ArrayList<>();
        this.ususarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Ususario> getUsusarios() {
        return ususarios;
    }

    public void setUsusarios(List<Ususario> ususarios) {
        this.ususarios = ususarios;
    }

    public String getEmprestimos() {
        String retorno = "";

        for(Emprestimo i : this.emprestimos){
            retorno += "\n" + i.toString();
        }
        return retorno;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void registrarUsusario(Ususario ususario) {
        this.ususarios.add(ususario);
    }

    public void emprestarLivro(int idLivro, int idUsusario) {
        LocalDateTime data = LocalDateTime.now();
        Livro livro = new Livro();
        Ususario ususario = new Ususario();
        for(Livro i : this.livros){
            if(i.getId() == idLivro){
                livro = i;
            }
        }

        for(Ususario i : this.ususarios){
            if(i.getId() == idUsusario){
                ususario = i;
            }
        }

        emprestimo = new Emprestimo(livro, data, ususario);
        emprestimos.add(emprestimo);
        ususario.pegarLivroEmprestado(livro);

    }

    public void devolverLivro(int idLivro, int idUsusario) {
        Livro livro = new Livro();
        Ususario ususario = new Ususario();
        for(Livro i : this.livros){
            if(i.getId() == idLivro){
                livro = i;
            }

        }

        for(Ususario i : this.ususarios){
            if(i.getId() == idUsusario){
                ususario = i;
            }
        }
        emprestimo.calcularMulta();
        ususario.devolverLivroEmprestado(livro);
    }
}
