package moves;

import ru.ifmo.se.pokemon.*;

public class Flatter extends StatusMove {
    public Flatter(){
        super(Type.DARK, 0, 100);
    }  
    @Override
    protected String describe() {
        return "использует Flatter";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.confuse();
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, 1));
    }
}