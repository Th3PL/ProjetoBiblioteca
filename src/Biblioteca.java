import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Ususario> ususarios;
    private List<Emprestimo> emprestimos;

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

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
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
        ususario.devolverLivroEmprestado(livro);
    }
}
