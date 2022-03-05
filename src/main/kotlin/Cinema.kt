class Cinema (
    private val nome: String,
    private val horarioAberto: Byte,
    private val horarioFechado:Byte,
){
    private var assentos = mutableListOf<Assentos>()
    private var filmes = mutableListOf<Filmes>()

    fun adicionarFilme(filme: Filmes): Boolean = filmes.add(filme)

    fun listarFilmes() = filmes

    fun registrarAssento(assento: Assentos): Boolean = assentos.add(assento)

    fun listarAssentos() = assentos
}