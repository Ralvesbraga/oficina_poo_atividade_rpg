public class Batalha {
    private Personagem p1;
    private Personagem p2;

    public Batalha(Personagem p1, Personagem p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciar() {
        System.out.println("=== Início da Batalha (melhor de 3 lutas) ===");

        int vitoriasP1 = 0;
        int vitoriasP2 = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("\n>>> Luta " + i + " <<<");
            Luta luta = new Luta(p1, p2);
            Personagem vencedor = luta.iniciar();

            if (vencedor == p1) vitoriasP1++;
            else vitoriasP2++;

            System.out.println("Placar parcial: " + p1.getNome() + " (" + vitoriasP1 + ") x (" + vitoriasP2 + ") " + p2.getNome());

            if (vitoriasP1 == 2 || vitoriasP2 == 2) break;
        }

        System.out.println("\n=== Resultado Final da Batalha ===");
        if (vitoriasP1 > vitoriasP2) {
            System.out.println("*** Vencedor da batalha: " + p1.getNome() + " ***");
        } else {
            System.out.println("*** Vencedor da batalha: " + p2.getNome() + " ***");
        }
    }
}
