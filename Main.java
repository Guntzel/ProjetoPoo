import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo;
        BibliotecaAudiovisual biblioteca = new BibliotecaAudiovisual();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar música");
            System.out.println("2. Adicionar audiovela");
            System.out.println("3. Listar todos os áudios");
            System.out.println("4. Salvar áudios");
            System.out.println("5. Carregar áudios");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da música: ");
                    String nomeMusica = scanner.nextLine();
                    System.out.print("Digite a duração da música (em minutos): ");
                    float duracaoMusica = scanner.nextFloat();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o ano de lançamento da música: ");
                    String anoMusica = scanner.nextLine();
                    System.out.print("Digite o compositor da música: ");
                    String compositor = scanner.nextLine();
                    System.out.print("Digite o estilo da música: ");
                    String estilo = scanner.nextLine();
                    Musica musica = new Musica(nomeMusica, duracaoMusica, anoMusica, compositor, estilo);
                    biblioteca.adicionarAudio(musica);
                    break;

                case 2:
                    System.out.print("Digite o nome da audiovela: ");
                    String nomeAudioNovela = scanner.nextLine();
                    System.out.print("Digite a duração da audiovela (em minutos): ");
                    float duracaoAudioNovela = scanner.nextFloat();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o ano de lançamento da audiovela: ");
                    String anoAudioNovela = scanner.nextLine();
                    System.out.print("Digite a sinopse da audiovela: ");
                    String sinopse = scanner.nextLine();
                    System.out.print("Digite os atores da audiovela (separados por vírgula): ");
                    String[] atores = scanner.nextLine().split(",\\s*");
                    System.out.print("Digite o nome do diretor da audiovela: ");
                    String diretor = scanner.nextLine();
                    System.out.print("Digite o gênero da audiovela: ");
                    String genero = scanner.nextLine();
                    AudioNovela audioNovela = new AudioNovela(nomeAudioNovela, duracaoAudioNovela, anoAudioNovela, sinopse, atores, diretor, genero);
                    biblioteca.adicionarAudio(audioNovela);
                    break;

                case 3:
                    biblioteca.listarAudios();
                    break;

                case 4:
                    System.out.print("Digite o nome do arquivo para salvar: ");
                    nomeArquivo = scanner.nextLine();
                    biblioteca.salvarAudios(nomeArquivo);
                    System.out.println("Áudios salvos com sucesso.");
                    break;

                case 5:
                    System.out.print("Digite o nome do arquivo para carregar: ");
                    nomeArquivo = scanner.nextLine();
                    biblioteca.carregarAudios(nomeArquivo);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
