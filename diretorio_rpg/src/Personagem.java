import java.util.Random;

public abstract class Personagem implements Reset{
    private String nome;
    private String classe;
    private int vida;
    private int vidaBase;
    private int dano;
    private int defesa;
    private static final Random random = new Random();

    public Personagem(String nome, String classe, int vida, int dano, int defesa) {
        this.nome = nome + " [" + classe + "]";
        this.classe = classe;
        this.vida = vida;
        this.vidaBase = vida;
        this.dano = dano;
        this.defesa = defesa;
    }

    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public int getDano() { return dano; }
    public int getDefesa() { return defesa; }
    

    public int getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(int vidaBase) {
        this.vidaBase = vidaBase;
    }

    public boolean estaVivo() { return vida > 0; }

    public void receberDano(int dano) {
        int danoFinal = Math.max(dano - defesa, 0);
        vida -= danoFinal;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + danoFinal + " de dano. Vida atual: " + vida);
    }

    // +-25%
    protected int calcularDanoVariavel() {
        double variacao = 0.75 + (random.nextDouble() * 0.5);
        return (int) Math.round(dano * variacao);
    }

    public abstract void atacar(Personagem alvo);

    @Override
    public void resetar() {
        this.vida = this.getVidaBase();
        System.out.println(nome + " teve sua vida resetada para " + this.getVidaBase());
    }

    
}
