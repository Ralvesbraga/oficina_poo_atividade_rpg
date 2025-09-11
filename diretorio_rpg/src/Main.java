public class Main {
    public static void main(String[] args) {
        System.out.println(":3 TESTE DO SISTEMA DE DANO VARIAVEL ");
        
        Personagem p1 = new Guerreiro("aragorn");
        Personagem p2 = new Mago("gandalf");

        Batalha batalha = new Batalha(p1, p2);
        batalha.iniciar();
    }
}
