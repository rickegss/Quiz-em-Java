import java.util.ArrayList;

public class Interface {
    int acertos = 0;
    int erros = 0;

    public void exibeCabecalho() {
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║   Questionário Astronômico    ║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.println("Autor: Ricardo Gomes da Silva");
        System.out.println("Feito em java");
        System.out.println("---------------------------------");
        System.out.println(" ");
    }

    int numero_questao = 1;
    public void formataQuestao(Questao[] questoes, Interface quiz) {
        for (Questao questao : questoes) {
            questao.escrevaQuestao(numero_questao);
            String resp = questao.leiaResposta();
            boolean resultado = questao.isCorreta(resp);
            quiz.contaAcertos(resultado);
            numero_questao++;
        }
    }

    public double[] contaAcertos(boolean resultado) {
        if (resultado) {
            acertos ++;
        } else {
            erros++;
        }
        return new double[]{acertos, erros};
    }

    public void exibeEstats(Questao[] questoes) {
        int total = questoes.length;
        double porcentagem = ((double) acertos / total ) * 100;

        System.out.println(" --- Fim do Questionário! --- ");
        System.out.println(" ");
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║ Estatísticas:                  ║");
        System.out.println("║                                ║");
        System.out.printf("║ Porcentagem de sucesso: %.1f%% ║\n", porcentagem);
        System.out.printf("║ Acertos: %d                    ║\n", acertos);
        System.out.printf("║ Erros: %d                      ║\n", erros);
        System.out.println("╚═══════════════════════════════╝");
        System.out.println(" ");
        System.out.println("Obrigado por responder! Fique a vontade para tentar novamente.");
    }
}
