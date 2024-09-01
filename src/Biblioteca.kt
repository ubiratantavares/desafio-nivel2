class Biblioteca(private val capacidade: Int) {
    private val livros: Array<Livro?> = arrayOfNulls(capacidade)
    private var contador: Int = 0

    fun cadastrarLivro(livro: Livro) {
        if (contador < capacidade) {
            livros[contador] = livro
            contador++
        } else {
            println("Capacidade máxima atingida. Não é possível cadastrar mais livros.")
        }
    }

    fun buscarPorNome(nome: String): List<Livro> {
        return livros.filterNotNull().filter { it.nome.equals(nome, ignoreCase = true) }
    }

    fun buscarPorGenero(genero: String): List<Livro> {
        return livros.filterNotNull().filter { it.genero.equals(genero, ignoreCase = true) }
    }

    fun buscarPorAutor(autor: String): List<Livro> {
        return livros.filterNotNull().filter { it.autor.equals(autor, ignoreCase = true) }
    }

    fun exibirTodosOsLivros() {
        if (contador == 0) {
            println("Nenhum livro cadastrado.")
        } else {
            livros.filterNotNull().forEach {
                it.exibirInformacoes()
                println("-----------")
            }
        }
    }
}
