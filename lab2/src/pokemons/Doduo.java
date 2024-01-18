package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Doduo extends Pokemon {
    public Doduo(String name, int level){
        super(name, level);

        this.setType(Type.NORMAL, Type.FLYING);
        this.setStats(35, 85, 45, 35, 35, 75);
        this.setMove(new WorkUp(), new Groul(), new Peck());
    }
}