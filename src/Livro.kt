data class Livro(
    val nome: String,
    val genero: String,
    val autor: String,
    val totalPaginas: Int,
    var paginasLidas: Int
) {
    fun progressoLeitura(): Double {
        return (paginasLidas.toDouble() / totalPaginas) * 100
    }

    fun exibirInformacoes() {
        println("\nNome do Livro: $nome")
        println("Número Total de Páginas: $totalPaginas")
        println("Número de Páginas Lidas: $paginasLidas")
        println("Gênero: $genero")
        println("Autor: $autor")
    }
}
