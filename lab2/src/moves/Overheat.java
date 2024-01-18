package moves;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove{
    public Overheat(){
        super(Type.FIRE, 130, 90);
    }  
    @Override
    protected String describe() {
        return "использует Overheat";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }
}
