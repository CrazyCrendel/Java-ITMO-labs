package moves;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove{
    public WillOWisp(){
        super(Type.FIRE, 0, 85);
    }  
    @Override
    protected String describe() {
        return "использует Will-O-Wisp";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.burn(p);
        p.addEffect(new Effect().stat(Stat.ATTACK, -((int) p.getStat(Stat.ATTACK) / 2)));
    }
}
