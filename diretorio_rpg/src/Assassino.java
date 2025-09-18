public class Assassino extends Personagem {
    private static final int VIDA_BASE = 90;

    public Assassino(String nome) {
        super(nome, "Assassino", VIDA_BASE, 30, 5);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = calcularDanoVariavel(); 
        if (alvo instanceof Mago) {
            dano = (int)(dano * 1.5); // vantagem
        }
        System.out.println(getNome() + " ataca furtivamente! (Dano: " + dano + ")");
        alvo.receberDano(dano);
    }

}
