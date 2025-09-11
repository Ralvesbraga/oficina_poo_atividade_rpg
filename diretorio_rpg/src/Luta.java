public class Luta {
    private Personagem p1;
    private Personagem p2;
    private int roundsP1 = 0;
    private int roundsP2 = 0;

    public Luta(Personagem p1, Personagem p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Personagem iniciar() {
        System.out.println("\n=== Iniciando Luta entre " + p1.getNome() + " e " + p2.getNome() + " ===");

        while (roundsP1 < 2 && roundsP2 < 2) {
            resetarPersonagens();

            System.out.println("\n--- Novo Round ---");
            while (p1.estaVivo() && p2.estaVivo()) {
                p1.atacar(p2);
                if (!p2.estaVivo()) break;
                p2.atacar(p1);
            }

            if (p1.estaVivo()) {
                roundsP1++;
                System.out.println(p1.getNome() + " venceu o round!");
            } else {
                roundsP2++;
                System.out.println(p2.getNome() + " venceu o round!");
            }
            System.out.println("Placar: " + p1.getNome() + " (" + roundsP1 + ") x (" + roundsP2 + ") " + p2.getNome());
        }

        Personagem vencedor = roundsP1 == 2 ? p1 : p2;
        System.out.println("\n=== Vencedor da Luta: " + vencedor.getNome() + " ===");
        return vencedor;
    }

    private void resetarPersonagens() {
        this.p1.resetar();
        this.p2.resetar();
    }
}
