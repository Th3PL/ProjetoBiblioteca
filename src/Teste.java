import java.time.LocalDateTime;

public class Teste {
    public static void main(String[] args) {

        // Criando livros
        Livro pj = new Livro(1, "Percy Jackson e o Ladrão de raios", "Rick Riordan", true);
        Livro hp = new Livro(2, "Harry Potter e a pedra filosofal", "JK Rowling", true);
        Livro cre = new Livro(3, "Crepúsculo", "Stephenie Meyer", true);

        Ususario p1 = new Ususario(1, "Pedro");
        Ususario p2 = new Ususario(2, "João");
        Ususario p3 = new Ususario(3, "Maria");



        // Criando a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Registrando usuários na biblioteca
        biblioteca.registrarUsusario(p1);
        biblioteca.registrarUsusario(p2);
        biblioteca.registrarUsusario(p3);

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(pj);
        biblioteca.adicionarLivro(hp);
        biblioteca.adicionarLivro(cre);

        // Testando empréstimos
        System.out.println("--- Testando empréstimos ---");
        biblioteca.emprestarLivro(1, 1); // Pedro empresta Percy Jackson
        System.out.println("Pedro emprestou Percy Jackson: " + p1.getLivrosEmprestados());

        biblioteca.emprestarLivro(2, 2); // João empresta Harry Potter
        System.out.println("João emprestou Harry Potter: " + p2.getLivrosEmprestados());

        // Tentativa de empréstimo de livro já emprestado
        System.out.println("\n--- Tentativa de empréstimo de livro já emprestado ---");
        biblioteca.emprestarLivro(1, 3); // Maria tenta emprestar Percy Jackson (já emprestado)
        System.out.println("Maria tentou emprestar Percy Jackson: " + p3.getLivrosEmprestados());

        // Testando devoluções
        System.out.println("\n--- Testando devoluções ---");
        biblioteca.devolverLivro(1, 1); // Pedro devolve Percy Jackson
        System.out.println("Pedro devolveu Percy Jackson: " + p1.getLivrosEmprestados());

        // Verificando multa (simulando atraso)
        System.out.println("\n--- Testando cálculo de multa ---");
        // Simulando atraso na devolução de Harry Potter
        Emprestimo emprestimoHarryPotter = biblioteca.encontrarEmprestimoPorLivro(2);
        if (emprestimoHarryPotter != null) {
            // Forçando a data de devolução para 10 dias atrás (simulando atraso)
            emprestimoHarryPotter.setDataDevolucao(LocalDateTime.now().minusDays(10));
            Double multa = emprestimoHarryPotter.calcularMulta();
            System.out.println("Multa a ser paga por João (Harry Potter): R$ " + multa);
        }

        biblioteca.devolverLivro(2, 2); // João devolve Harry Potter
        System.out.println("João devolveu Harry Potter: " + p2.getLivrosEmprestados());

        // Testando empréstimo após devolução
        System.out.println("\n--- Testando empréstimo após devolução ---");
        biblioteca.emprestarLivro(1, 3); // Maria empresta Percy Jackson (agora disponível)
        System.out.println("Maria emprestou Percy Jackson: " + p3.getLivrosEmprestados());

        // Verificando todos os empréstimos
        System.out.println("\n--- Lista de todos os empréstimos ---");
        System.out.println(biblioteca.getEmprestimos());

        // Verificando disponibilidade dos livros
        System.out.println("\n--- Disponibilidade dos livros ---");
        System.out.println("Percy Jackson está disponível? " + pj.isDisponivel());
        System.out.println("Harry Potter está disponível? " + hp.isDisponivel());
        System.out.println("Crepúsculo está disponível? " + cre.isDisponivel());

    }
}
