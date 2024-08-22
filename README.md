O projeto se baseia em uma biblioteca de audios, onde serão adicionados músicas e audio novelas. 
Utilizei uma classe audio para ter os atributos principais como nome e duração. A mesma existe apenas para poder estender as classes Musica e AudioNovela.
Nas classes Musica e AudioNovela, entram os atributos unicos, genero da musica, genero do da AudioNovela, atores, diretor, etc...

O programa consiste em um loop com o menu de opções, podendo adicionar, listar, salvar ou exportar audios de um arquivo.
Usei listas encadeadas para salvar os audios. abrimos ou salvamos um arquivo com os audios, o programa irá questionar o nome do arquivo. Então tratamos com exceção para evitar erros e desligar o programa do nada, tendo algum erro, volta para o loop.

Todas as classes tem seus atributos private, sendo assim, são acessados por encapsulamento. 
