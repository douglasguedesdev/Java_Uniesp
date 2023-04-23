import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Video {
    private String titulo;
    private String diretor;
    private String elenco;
    private String genero;
    private String sinopse;
    private int anoLancamento;
    private int classificacaoIndicativa;

    public Video(String titulo, String diretor, String elenco, String genero, String sinopse, int anoLancamento, int classficacaoIndicativa){
        this.titulo =titulo;
        this.diretor =diretor;
        this.elenco =elenco;
        this.genero =genero;
        this.sinopse =sinopse;
        this.anoLancamento =anoLancamento;
        this.classificacaoIndicativa =classificacaoIndicativa;
    }



}
