package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Moltres extends Pokemon{
    public Moltres(String name, int level){
        super(name, level);
        this.setType(Type.FIRE, Type.FLYING);
        this.setStats(90, 100, 90, 125, 85, 90);

        this.setMove(new Overheat(), new WillOWisp(), new DoubleTeam(), new Rest());
    }
}
