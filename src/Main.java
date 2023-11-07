import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Series;

public class Main {

    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        Series minhaSerie = new Series();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme");
        System.out.println("Média de avaliações do filme: " +meuFilme.mediaDasAvaliacoes());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.setTemporadas(4);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.exibeFichaTecnica();
        System.out.println("Tempo total da série: " + minhaSerie.getDuracaoEmMinutos() + " minutos");

    }
}