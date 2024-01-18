package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Dodrio extends Doduo {
    public Dodrio(String name, int level){
        super(name, level);

        this.setType(Type.NORMAL, Type.FLYING);
        this.setStats(60, 110, 70, 60, 60, 110);
        
        this.setMove(new WorkUp(), new Groul(), new Peck(), new TriAttack());
    }
}