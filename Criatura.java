public class Criatura extends Carta implements GritoDeGuerra
{

    public Criatura(String nome,int ataque, int vida, int mana, boolean efeito)
    {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
        this.mana = mana;
        this.efeito = efeito;
    }

    @Override
    public void atacar(Carta inimigo)
    {
        int dano = this.ataque;
        defender(dano, inimigo);
    }

    @Override
    public void defender(int dano, Carta inimigo)
    {
        this.vida -= inimigo.ataque;
        inimigo.vida = dano;
    }


}