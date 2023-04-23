import java.util.ArrayList;

public class Usuario{
    private String nome;
    private String email;
    private String senha;
    private List<Video> favoritos;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.favoritos = new ArrayList<>();

    }

    public void adicionarFavorito(video video){
        favoritos.add(video);

    }
    public void removerFavorito(video video){
        favoritos.remove(video);

    }
}
