public class Mago extends Personagem {
    private static final int VIDA_BASE = 80;

    public Mago(String nome) {
        super(nome, "Mago", VIDA_BASE, 25, 5);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = calcularDanoVariavel(); 
        if (alvo instanceof Guerreiro) {
            dano = (int)(dano * 1.5); // vantagem
        }
        System.out.println(getNome() + " lança bola de fogo! (Dano: " + dano + ")");
        alvo.receberDano(dano);
    }

}
