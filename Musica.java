public class Musica extends Audio {
    private String compositor;
    private String estilo;

    public Musica(String nome, float duracao, String anoLancamento, String compositor, String estilo) {
        super(nome, duracao, anoLancamento);
        this.compositor = compositor;
        this.estilo = estilo;
    }

    public String getCompositor() {
        return compositor;
    }

    public String getEstilo() {
        return estilo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Compositor: " + compositor + ", Estilo: " + estilo;
    }
}