public abstract class Audio {
    private String nome;
    private float duracao;
    private String anoLancamento;

    public Audio(String nome, float duracao, String anoLancamento) {
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public float getDuracao() {
        return duracao;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Duração: " + duracao + " min, Ano: " + anoLancamento;
    }
}