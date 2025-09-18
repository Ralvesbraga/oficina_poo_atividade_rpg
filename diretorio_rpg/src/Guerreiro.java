public class Guerreiro extends Personagem {
    private static final int VIDA_BASE = 120;

    public Guerreiro(String nome) {
        super(nome, "Guerreiro", VIDA_BASE, 20, 10);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = calcularDanoVariavel();
        if (alvo instanceof Assassino) {
            dano = (int)(dano * 1.5); // vantagem
        }
        System.out.println(getNome() + " golpeia com espada! (Dano: " + dano + ")");
        alvo.receberDano(dano);
    }

}
