fun main() {
    val biblioteca = Biblioteca(20)
    
    // criando livros
    val livro1 = Livro("The Hobbit", "Fantasia", "J.R.R. Tolkien", 310, 100)
    val livro2 = Livro("Clean Code", "Tecnologia", "Robert C. Martin", 464, 120)
    val livro3 = Livro("To Kill a Mockingbird", "Ficção", "Harper Lee", 281, 150)
    val livro4 = Livro("Pride and Prejudice", "Romance", "Jane Austen", 279, 100)
    val livro5 = Livro("The Great Gatsby", "Clássico", "F. Scott Fitzgerald", 180, 180)
    val livro6 = Livro("The Catcher in the Rye", "Ficção", "J.D. Salinger", 214, 50)
    val livro7 = Livro("Moby Dick", "Aventura", "Herman Melville", 635, 320)
    val livro8 = Livro("War and Peace", "Histórico", "Leo Tolstoy", 1225, 600)
    val livro9 = Livro("The Alchemist", "Ficção", "Paulo Coelho", 208, 50)
    val livro10 = Livro("The Lord of the Rings", "Fantasia", "J.R.R. Tolkien", 1178, 900)

    // cadastrando livros
    biblioteca.cadastrarLivro(livro1)
    biblioteca.cadastrarLivro(livro2)
    biblioteca.cadastrarLivro(livro3)
    biblioteca.cadastrarLivro(livro4)
    biblioteca.cadastrarLivro(livro5)
    biblioteca.cadastrarLivro(livro6)
    biblioteca.cadastrarLivro(livro7)
    biblioteca.cadastrarLivro(livro8)
    biblioteca.cadastrarLivro(livro9)
    biblioteca.cadastrarLivro(livro10)

    // exibindo os livros da biblioteca
    biblioteca.exibirTodosOsLivros()

    // consultando um livro pelo nome
    val nome = "The Hobbit"
    val livrosPorNome = biblioteca.buscarPorNome(nome)
    println("\nConsulta de livro pelo nome '${nome}': ")
    livrosPorNome.forEach { it.exibirInformacoes() }

    // consultando um livro pelo genero
    val genero = "Ficção"
    val livrosPorGenero = biblioteca.buscarPorGenero(genero)
    println("\nConsulta de livro pelo gênero '${genero}': ")
    livrosPorGenero.forEach { it.exibirInformacoes() }

    // consultando um livro pelo autor
    val autor = "Harper Lee"
    val livrosPorAutor = biblioteca.buscarPorAutor(autor)
    println("\nConsulta de livro pelo autor '${autor}': ")
    livrosPorAutor.forEach { it.exibirInformacoes() }

    // acompanhando o progresso de leitura de um livro
    println("\nProgresso de leitura do livro '${livro1.nome}': %.2f%%".format(livro1.progressoLeitura()))
}
