package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nidorino extends NidoranM {
    public Nidorino(String name, int level){
        super(name, level);
        this.setType(Type.POISON);
        this.setStats(61, 72, 57, 55, 55, 65);

        this.setMove(new DoubleKick(), new DoubleTeam(), new Flatter());
    }
}