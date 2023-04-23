public class Serie extends Video{
    private int temporadaAtual;
    private int episodioAtual;

    public Serie(String titulo, String diretor, String elenco, String genero, String sinopse, int anoLancamento, int classificacaoIndicativa, int temporadaAtual, int episodioAtual){
        super(titulo, diretor, elenco, genero, sinopse, anoLancamento, classificacaoIndicativa);
        this.temporadaAtual = temporadaAtual;
        this.episodioAtual = episodioAtual;
    }

}
