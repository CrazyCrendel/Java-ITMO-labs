package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }  
    @Override
    protected String describe() {
        return "использует Rest";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().turns(2).condition(Status.SLEEP));
        p.restore();
    }
}
