package moves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE, 100, 70);
    }  
    @Override
    protected String describe() {
        return "использует Blizzard";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.1).condition(Status.FREEZE));
    }
}

