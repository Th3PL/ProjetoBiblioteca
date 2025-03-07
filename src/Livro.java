public class Livro {
    int id;
    String titulo;
    String autor;
    Boolean disponivel;

    public Livro() {
    }

    public Livro(int id, String titulo, String autor, Boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void epmrestar() throws Exception {
        if (disponivel){
            this.disponivel = false;
        } else{
            throw new Exception("Este livro não esta disponivél");
        }
    }

    public void devolver(){
        if (!disponivel){
            this.disponivel = true;
        }
    }
}
