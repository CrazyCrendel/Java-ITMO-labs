import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class General {
    public static void main(String[] args) {
        
        Battle b = new Battle();

        b.addAlly(new Moltres("Bruks", 10));
        b.addAlly(new Doduo("James", 10));
        b.addAlly(new Dodrio("Curry", 10));
        b.addFoe(new NidoranM("Doncic", 10));
        b.addFoe(new Nidorino("Green", 10));
        b.addFoe(new Nidoking("Young", 10));

        b.go();

    }
}