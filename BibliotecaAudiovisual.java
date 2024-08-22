import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaAudiovisual {
    private List<Audio> audios;

    public BibliotecaAudiovisual() {
        audios = new ArrayList<>();
    }

    public void adicionarAudio(Audio audio) {
        audios.add(audio);
    }

    public void listarAudios() {
        if (audios.isEmpty()) {
            System.out.println("Nenhum áudio na biblioteca.");
        } else {
            for (Audio audio : audios) {
                System.out.println(audio);
            }
        }
    }

    public void salvarAudios(String arquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivo))) {
            for (Audio audio : audios) {
                writer.println(audioToString(audio));
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar a biblioteca: " + e.getMessage());
        }
    }

    public void carregarAudios(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        if (arquivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    Audio audio = stringToAudio(linha);
                    if (audio != null) {
                        audios.add(audio);
                        System.out.println("Áudios carregados com sucesso.");
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao carregar a biblioteca: " + e.getMessage());
            }
        } else {
            System.out.println("Arquivo não encontrado.");
        }
    }

    private String audioToString(Audio audio) {
        if (audio instanceof Musica) {
            Musica musica = (Musica) audio;
            return "Musica|" + musica.getNome() + "|" + musica.getDuracao() + "|" + musica.getAnoLancamento() + "|" + musica.getCompositor() + "|" + musica.getEstilo();
        } else if (audio instanceof AudioNovela) {
            AudioNovela audioNovela = (AudioNovela) audio;
            String atores = String.join(",", audioNovela.getAtores());
            return "AudioNovela|" + audioNovela.getNome() + "|" + audioNovela.getDuracao() + "|" + audioNovela.getAnoLancamento() + "|" + audioNovela.getSinopse() + "|" + atores + "|" + audioNovela.getDiretor() + "|" + audioNovela.getGenero();
        }
        return "";
    }

    private Audio stringToAudio(String str) {
        String[] partes = str.split("\\|");
        if (partes.length < 4) {
            return null;
        }
        String tipo = partes[0];
        String nome = partes[1];
        float duracao = Float.parseFloat(partes[2]);
        String anoLancamento = partes[3];
        
        if (tipo.equals("Musica")) {
            String compositor = partes[4];
            String estilo = partes[5];
            return new Musica(nome, duracao, anoLancamento, compositor, estilo);
        } else if (tipo.equals("AudioNovela")) {
            String sinopse = partes[4];
            String[] atores = partes[5].split(",");
            String diretor = partes[6];
            String genero = partes[7];
            return new AudioNovela(nome, duracao, anoLancamento, sinopse, atores, diretor, genero);
        }
        return null;
    }
}