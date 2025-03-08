public class Teste {
    public static void main(String[] args) {
        Livro pj = new Livro(1, "Percy Jackson e o Ladrão de raios", "Rick Riordan", true);
        Livro hp = new Livro(2, "Harry Potter e a pedra filosofal", "JK Roling", true);
        Livro cre = new Livro(2, "Crepúsculo0", "Stephenie Meyer", true);

        Ususario p1 = new Ususario(1, "Pedro");
        Ususario p2 = new Ususario(2, "João");
        Ususario p3 = new Ususario(3, "Maria");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(pj);
        biblioteca.adicionarLivro(hp);
        biblioteca.adicionarLivro(cre);

        biblioteca.registrarUsusario(p1);
        biblioteca.registrarUsusario(p2);
        biblioteca.registrarUsusario(p3);

        biblioteca.emprestarLivro(1, 1);
        System.out.println(p1.toString());
        biblioteca.emprestarLivro(1, 2);
        System.out.println(p2.toString());
        biblioteca.devolverLivro(1,1);
        System.out.println(p1.toString());
        biblioteca.emprestarLivro(1, 2);
        System.out.println(p2.toString());

    }
}
