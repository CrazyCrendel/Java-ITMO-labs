package moves;

import ru.ifmo.se.pokemon.*;

public class TriAttack extends SpecialMove {
    public TriAttack(){
        super(Type.NORMAL, 80, 100);
    }  
    @Override
    protected String describe() {
        return "использует Tri Attack";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.0672).condition(Status.FREEZE));
        p.addEffect(new Effect().chance(0.0672).condition(Status.BURN));
        p.addEffect(new Effect().chance(0.0672).condition(Status.PARALYZE));
    }
}