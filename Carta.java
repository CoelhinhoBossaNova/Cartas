public abstract class Carta
{
    protected String nome;
    protected int ataque;
    protected int vida;
    protected int mana;
    protected boolean efeito;

    public abstract void atacar(Carta inimigo);
    public abstract void defender(int dano, Carta inimigo);
}
