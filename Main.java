import java.util.ArrayList;

public class Main
{
    //apagar depois
    static ArrayList<Carta> deck = new ArrayList<>();

    public static void main(String[] args)
    {
        Carta diabreteEnfurecido = new Criatura("Diabrete Enfurecido",3,1,1,true);
    }
}


/*
    private int ataque = 3;
    private int vida = 2;
    private final int mana = 1;

    @Override
    public void atacar(Carta inimigo)
    {
        int dano = this.ataque;

        defender(dano,inimigo);
    }
    @Override
    public void defender(int dano,Carta inimigo)
    {
        this.vida -= inimigo.ataque;
        inimigo.vida = dano;
    }

    public void ativarEfeito(Jogador aliado)
    {
        aliado.vida -= 3;
    }
 */