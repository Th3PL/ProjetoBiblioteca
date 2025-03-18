import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Ususario ususario;
    private LocalDateTime dataEmprestimo;
    private LocalDateTime datadevolucao;

    public Emprestimo() {
    }

    public Emprestimo(Livro livro, LocalDateTime datadevolucao, LocalDateTime dataEmprestimo, Ususario ususario) {
        this.livro = livro;
        this.datadevolucao = datadevolucao;
        this.dataEmprestimo = dataEmprestimo;
        this.ususario = ususario;
    }

    public Emprestimo(Livro livro, LocalDateTime dataEmprestimo, Ususario ususario) {
        this.livro = livro;
        this.datadevolucao = dataEmprestimo.plusDays(7);
        this.dataEmprestimo = dataEmprestimo;
        this.ususario = ususario;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDatadevolucao() {
        return datadevolucao;
    }

    public void setDatadevolucao(LocalDateTime datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

    public Ususario getUsusario() {
        return ususario;
    }

    public void setUsusario(Ususario ususario) {
        this.ususario = ususario;
    }

    public Livro getLivro() {
        return livro;
    }


    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Double calcularMulta(){
        double diferenca = ChronoUnit.DAYS.between(datadevolucao, LocalDateTime.now());
        double multa = diferenca * 2;
        if (diferenca > 10){
            return multa;
        } else{
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro=" + livro +
                ", ususario=" + ususario +
                ", dataEmprestimo=" + dataEmprestimo +
                ", datadevolucao=" + datadevolucao +
                '}';
    }
}
