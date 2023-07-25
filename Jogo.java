public class Jogo{
    String pergunta;
    String resposta;
    boolean continuar;

    public Jogo(String pergunta, String resposta, Boolean continuar){
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.continuar = continuar;
    }

    public Boolean responder(){
        if(this.pergunta == this.resposta){
            System.out.println("Acertou");
            this.continuar = true;
        }
        else{
            System.out.println("Errou");
            this.continuar = false;
        }   
        return this.continuar;
    }

    public void setPergunta(String pergunta){
        this.pergunta = pergunta;
    }

    public void setResposta(String resposta){
        this.resposta = resposta;
    }
}