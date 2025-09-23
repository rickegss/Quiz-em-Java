import java.util.Scanner;

public class Questao {
    String pergunta, opcaoA, opcaoB, opcaoC, opcaoD, opcaoE, correta;

    public Questao(String pergunta, String a, String b, String c, String d, String e, String correta) {
        this.pergunta = pergunta;
        this.opcaoA = a;
        this.opcaoB = b;
        this.opcaoC = c;
        this.opcaoD = d;
        this.opcaoE = e;
        this.correta = correta;
    }



    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("✅ Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println(" ");
            return true;
        } else {
            System.out.println("❌ Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println(" ");
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.println("❌ Resposta inválida! Digite opção A, B, C, D ou E. ");
        System.out.println(" ");
        return false;
    }

    public void escrevaQuestao(int numero_questao){
        System.out.println(numero_questao + " - " + this.pergunta);
        System.out.println();
        System.out.println("A) " + this.opcaoA);
        System.out.println("B) " + this.opcaoB);
        System.out.println("C) " + this.opcaoC);
        System.out.println("D) " + this.opcaoD);
        System.out.println("E) " + this.opcaoE);
        System.out.println();
    }

}
