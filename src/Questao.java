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
}


public boolean isCorreta(String resposta){
    if(resposta.equalsIgnoreCase(this.correta)){
        System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
        System.out.println("");
        return true;
    } else {
        System.out.println("Resposta Errada!");
        System.out.println("A opção correta é a letra: " + this.correta);
        System.out.println("");
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
    System.out.println("Resposta inválida! Digite opção A, B, C, D ou E. ");
    System.out.println("");
    return false;
}

public void escrevaQuestao(){
    System.out.println(this.pergunta);
    System.out.println();
    System.out.println(this.opcaoA);
    System.out.println(this.opcaoB);
    System.out.println(this.opcaoC);
    System.out.println(this.opcaoD);
    System.out.println(this.opcaoE);
    System.out.println();
}
}

Questao[] questoes = {
        new Questao("Qual é o planeta do Sistema Solar que tem o dia mais curto?", "Júpiter", "Mercúrio", "Terra", "Marte", "Netuno", "Mercúrio"),
        new Questao("Qual fenômeno ocorre quando a Terra fica entre o Sol e a Lua, projetando sua sombra sobre a Lua?", "Eclipse Solar", "Eclipse Lunar", "Solstício", "Equinácio", "Supernova", "Eclipse Lunar"),
        new Questao("Como se chama a região do espaço em que a gravidade é tão intensa que nem a luz consegue escapar?", "Nebulosa", "Estrela", "Buraco Negro", "Gigante Gasoso", "Cometa", "C"),
        new Questao("Qual é a estrela mais próxima da Terra depois do Sol?", "Sirius", "Alpha Centauri A", "Proxima Centauri", "Betelgeuse", "Vega", "C"),
        new Questao("O que define a característica cor vermelha de Marte?", "A presença de óxido de ferro", "Sua atmosfera", "Suas tempestades", "Poeira espacial", "Suas luas", "A"),
        new Questao("O que é uma supernova?", "Formação de um buraco negro", "Explosão de estrela no fim da vida", "Planeta recém-formado", "Asteroide que colide com a Terra", "Estrela que fica vermelha", "B"),
        new Questao("Qual é a maior lua do Sistema Solar e a que planeta ela pertence?", "Titã — Saturno", "Ganimedes — Júpiter", "Europa — Júpiter", "Calisto — Júpiter", "Tritão — Netuno", "B"),
        new Questao("Qual planeta possui o maior campo magnético do Sistema Solar?", "Terra", "Netuno", "Marte", "Saturno", "Júpiter", "E"),
        new Questao("O que causa as diferentes fases da Lua (Nova, Crescente, Cheia, etc.)?", " A sombra da Terra cobrindo a Lua.", " As nuvens na atmosfera da Terra.", "A quantidade de luz solar que vemos refletida na Lua, que muda conforme ela orbita a Terra.", "A poeira no espaço que bloqueia a luz da Lua.", "A Lua se movendo para mais perto ou mais longe da Terra.", "C"),
        new Questao("O que é um 'ano-luz'?", "Uma medida de tempo, equivalente a 365 dias.", "A velocidade com que a luz viaja.", "Uma medida de distância, correspondente ao que a luz percorre em um ano.", "Uma medida de quão brilhante uma estrela é.", "Uma unidade de massa para medir planetas.", "C"),
        new Questao("Um conjunto de bilhões de estrelas, poeira e gás, tudo mantido unido pela gravidade, é chamado de:", "Sistema Solar", "Constelação", "Galáxia", "Nebulosa", "Aglomerado de planetas", "C"),
        new Questao("O Sol, como a maioria das estrelas, é composto principalmente por quais dois gases?", "Oxigênio e Carbono", "Nitrogênio e Oxigênio", "Ferro e Níquel", "Hidrogênio e Hélio", "Sódio e Potássio", "D"),
        new Questao("O que é uma constelação?", "Um grupo de estrelas que está fisicamente perto no espaço.", "O nome dado a qualquer conjunto de planetas.", "Um sinônimo para galáxia.", "Uma nuvem de gás onde nascem novas estrelas.", " Uma figura imaginária formada por um padrão de estrelas no céu.", "E"),
        new Questao("A Teoria do Big Bang descreve:", "A explosão de uma estrela gigante, conhecida como supernova.", "A colisão entre a Via Láctea e Andrômeda.", "A formação do nosso Sistema Solar a partir de uma nebulosa.", "A origem do universo a partir de um estado inicial extremamente quente e denso.", "Como um buraco negro é formado.", "D"),
        new Questao("Qual planeta é o mais próximo do Sol?", "Vênus", "Mercúrio", "Marte", "Terra", "Júpiter", "B")
};

