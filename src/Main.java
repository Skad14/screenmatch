import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Series;

public class Main {

    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(8);
        System.out.println("Média das avaliações: " +meuFilme.mediaDasAvaliacoes());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Filmes meuFilme2 = new Filmes();
        meuFilme2.setNome("Interestelar");
        meuFilme2.setAnoDeLancamento(2013);
        meuFilme2.setDuracaoEmMinutos(200);
        meuFilme2.setIncluidoNoPlano(true);
        meuFilme2.exibeFichaTecnica();
        filtro.filtra(meuFilme2);

        Series minhaSerie = new Series();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.setAtiva(true);
        minhaSerie.setTemporadas(4);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(45);
        minhaSerie.exibeFichaTecnica();

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSeries(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(minhaSerie);

        System.out.println("\nTempo para maratonar filmes e séries da lista: " +calculadora.getTempoTotal());
    }
}