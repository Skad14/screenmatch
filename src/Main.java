import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Series;

public class Main {

    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        Filmes meuFilme2 = new Filmes();
        Series minhaSerie = new Series();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme2.setNome("Interestelar");
        meuFilme2.setAnoDeLancamento(2013);
        meuFilme2.setDuracaoEmMinutos(200);
        meuFilme2.setIncluidoNoPlano(true);

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTecnica();
        System.out.println("Média das avaliações: " +meuFilme.mediaDasAvaliacoes());

        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.setTemporadas(4);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.exibeFichaTecnica();
        System.out.println("Tempo para maratonar a série: " + minhaSerie.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(minhaSerie);
        System.out.println("\nTempo para maratonar filmes e séries da lista: " +calculadora.getTempoTotal());
    }
}