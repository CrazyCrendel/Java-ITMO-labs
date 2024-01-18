package Objects;

import Interface.Adjectives;

public class thing extends Obj implements Adjectives{

    final String name;

    public thing(String name){
        super(name);
        this.name = name;
    }

    public void getAdjectives(String adjective){
        super.name = this.name;
        super.name = adjective + " " + super.name;
    }
    
}
