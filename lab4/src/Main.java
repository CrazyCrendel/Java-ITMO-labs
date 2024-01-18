import Enum.Kuro;
import Personaji.FrakenBok;
import Personaji.General;
import Personaji.Karlson;
import Personaji.Kid;
import Personaji.UncleUlius;
import Personaji.UncleUlius.into;
import TheatreAction.Kitchen;

public class Main {
    public static void main(String[] args){
        UncleUlius Ulius = new UncleUlius("Дядя Юлиус ");
        into thoughts = Ulius.new into("Мысли ");
        into hand = Ulius.new into("рука ");

        Kitchen kithen = new Kitchen("кухня ");
        Kitchen.InKitchen coffee = new Kitchen.InKitchen("кофе ");
        Kitchen.InKitchen table = new Kitchen.InKitchen("стол ");
        Kitchen.InKitchen bread = new Kitchen.InKitchen("булочки ");
        Kitchen.InKitchen milk = new Kitchen.InKitchen("стакан молока ");

        FrakenBok frakenBok = new FrakenBok("Фракен Бок ");
        Karlson kalson = new Karlson("Карлсон ", table);
        Kid kid = new Kid("Малыш ");
        General process = new General("процесс "){
            public void tell(Karlson karlson){
                System.out.print(name + kalson + "называл ");
            }
        };

    
        thoughts.absorb(kithen,table);
        frakenBok.give(coffee, Ulius);
        Ulius.get(hand, bread);
        kalson.dragged(bread, Ulius);
        Ulius.roast(hand, coffee, bread);
        Ulius.blowangry(hand);
        thoughts.absorb(kithen, table);
        kalson.eat(bread);
        kid.onlyunderstand(bread);
        kid.give(milk, kalson);
        process.tell(kalson);
        kalson.speech(Kuro.KuroBulka);
        frakenBok.know(process, kalson);
        kalson.speech(Kuro.Bulkokura);
        frakenBok.dontunderstand(Ulius, kalson);
    }
}
