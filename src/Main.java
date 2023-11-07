import br.com.alura.screenmatch.models.Movie;

public class Main {

    public static void main(String[] args) {
        Movie meuFilme = new Movie();

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Média de avaliações do filme: " +meuFilme.mediaDasAvaliacoes());
    }
}