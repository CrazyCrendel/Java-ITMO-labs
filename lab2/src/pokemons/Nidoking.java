package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nidoking extends Nidorino {
    public Nidoking(String name, int level){
        super(name, level);
        super.setType(Type.POISON, Type.GROUND);
        super.setStats(81, 102, 77, 85, 75, 85);

        super.setMove(new DoubleKick(), new DoubleTeam(), new Flatter(), new Blizzard());
    }
}