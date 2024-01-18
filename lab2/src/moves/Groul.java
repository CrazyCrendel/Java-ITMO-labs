package moves;

import ru.ifmo.se.pokemon.*;

public class Groul extends StatusMove {
    public Groul(){
        super(Type.NORMAL, 0, 100);
    }  
    @Override
    protected String describe() {
        return "использует Groul";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
}    

