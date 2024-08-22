public class AudioNovela extends Audio {
    private String sinopse;
    private String[] atores;
    private String diretor;
    private String genero;

    public AudioNovela(String nome, float duracao, String anoLancamento, String sinopse, String[] atores, String diretor, String genero) {
        super(nome, duracao, anoLancamento);
        this.sinopse = sinopse;
        this.atores = atores;
        this.diretor = diretor;
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String[] getAtores() {
        return atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        String atoresStr = String.join(", ", atores);
        return super.toString() + ", Sinopse: " + sinopse + ", Atores: " + atoresStr + ", Diretor: " + diretor + ", Gênero: " + genero;
    }
}
