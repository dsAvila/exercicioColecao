fun main() {
    var cinemax = Cinema("Cinemark", 10, 22)

    if (
        cinemax.adicionarFilme(
            Filmes(
                nomeFilme = "BATMAN",
                classificacao = 14,
                genero = "Ação"
            )
        )
    )
    if (
         cinemax.adicionarFilme(
             Filmes(
                 nomeFilme = "Uncharted - Fora do Mapa",
                 classificacao = 12,
                 genero = "Aventura"
             )
         )
    )
    if (
        cinemax.adicionarFilme(
            Filmes(
                nomeFilme = "Homem-Aranha: Sem Volta Para Casa",
                classificacao = 12,
                genero = "Ação"
            )
        )
    )
            println("Filmes em cartaz disponíveis:")

    val filme = cinemax.listarFilmes()
    val numeroFilme = filme.size - 1
    for (index in 0..numeroFilme) {
        println("\nNome: ${filme[index].nomeFilme}\nGênero: ${filme[index].genero}\nClassificação: ${filme[index].classificacao}")
    }
    println("\nQual filme você deseja assistir?\n1 - BATMAN\n2 - Uncharted - Fora do Mapa\n3 - Homem-Aranha: Sem Volta Para Casa")
    val escolha = readLine()!!.toInt()

    if (escolha == 1){
        cinemax.registrarAssento(
            Assentos(
                numeroAssento = 1,
                ocupado = "Não"
            )
        )
    } else if (escolha == 2){
        cinemax.registrarAssento(
            Assentos(
                numeroAssento = 1,
                ocupado = "Sim"
            )
        )
    } else if (escolha == 3) {
        cinemax.registrarAssento(
            Assentos(
                numeroAssento = 1,
                ocupado = "Não"
            )
        )
    } else {
        println("Escolha Inválida!")
    }

    if (escolha == 1){
        cinemax.registrarAssento(
            Assentos(
                numeroAssento = 2,
                ocupado = "Não"
            )
        )
    } else if (escolha == 2){
        cinemax.registrarAssento(
            Assentos(
                numeroAssento = 2,
                ocupado = "Sim"
            )
        )
    } else if (escolha == 3){
        cinemax.registrarAssento(
            Assentos(
                numeroAssento = 2,
                ocupado = "Não"
            )
        )
    }

    if (escolha == 1){
        cinemax.registrarAssento(
            Assentos(
                numeroAssento = 3,
                ocupado = "Sim"
            )
        )
    } else if (escolha == 2){
        cinemax.registrarAssento(
            Assentos(
                numeroAssento = 3,
                ocupado = "Não"
            )
        )
    } else if (escolha == 3) {
        cinemax.registrarAssento(
            Assentos(
                numeroAssento = 3,
                ocupado = "Sim"
            )
        )
    }

    println("Assentos disponíveis:")
    val assento = cinemax.listarAssentos()
    val numeroAssento = assento.size - 1
    for (index in 0..numeroAssento) {
        println("\nAssento: ${assento[index].numeroAssento}\nEstá ocupado: ${assento[index].ocupado}")
    }

    println("\nQual assento você gostaria?\n1 Para o primeiro assento.\n2 Para o segundo assento. \n3 Para o terceiro assento.")
    val ocupado = readLine()!!.toInt()

    if(escolha == 1 && ocupado == 3){
        println("O assento escolhido já está ocupado")
    } else if (escolha == 2 && ocupado == 2 ||
        escolha == 2 && ocupado == 3){
        println("O assento escolhido já está ocupado")
    }

    val precoIngresso = 28
    val precoMetade = 2
    val avaliacao = 4.34

    println("\nVocê se encaixa em uma destas classes:\n1 - Estudante\n2 - Professor\n3 - Idoso\n4 - Nenhum")
    when (readLine()!!.toInt()){
        1 -> println("O seu valor final é: ${(precoIngresso / precoMetade) + avaliacao}")
        2 -> println("O seu valor final é: ${(precoIngresso / precoMetade) + avaliacao}")
        3 -> println("O seu valor final é: ${(precoIngresso / precoMetade) + avaliacao}")
        else -> println("O seu valor final é: 32,00")
    }

    println("Deseja realizar a do ingresso? \n1 - Sim\n2 - Não")
    val fim = readLine()!!.toInt()

    if (fim == 1){
        println("Tenha uma boa sessão!")
    } else if(fim == 2){
        println("Até breve..")
    }
}