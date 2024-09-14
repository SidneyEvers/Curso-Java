package br.com.proway.cursojava.Aula4.Palpite;

public class JogoAdvinhacao {

    //Atributos privados
    private int numeroSecreto;
    private int limiteTentativas;
    private Jogador jogador;

    //Construtor padrão
    public JogoAdvinhacao(int limiteTentativas, Jogador jogador){
        this.numeroSecreto = (int) (Math.random() * 100) + 1; //Gera um número entre 1 e 100
        this.limiteTentativas = limiteTentativas;
        this.jogador = jogador;
    }

    //Método para verificar a tentativa do jogador
    public boolean verificarTentativa(int tentativa){
        jogador.incrementarTentativas();//Incrementa tentativas do jogador

        if(tentativa == numeroSecreto){
            System.out.println("Parabéns, " + jogador.getNome() + "! Você acertou o número");
            return true;
        }else if(tentativa < numeroSecreto){
            System.out.println("Tente um número Maior");
        }else{
            System.out.println("Tente um número Menor");
        }
        if(jogador.getTentativas() >=limiteTentativas){
            System.out.println("Você atingiu o limite de tentativas! O número correto era " + numeroSecreto);
            return true; //Termina o jogo
        }
        return false;
    }

    //Método que inicia o jogo
    public void iniciarJogo(){
        System.out.println("Bem-vindo ao jogo da adivinhação, " + jogador.getNome() + "!");
        System.out.println("Você tem " + limiteTentativas + " tentativas");

        boolean acertou = false;

        while(!acertou){
            int palpite = jogador.darPalpite();//Agora o palpite vem da classe jogador
            if(palpite != -1){ //Verifica se o palpite é valido(Não é -1)
                acertou = verificarTentativa(palpite);
            }
        }
    }
}
