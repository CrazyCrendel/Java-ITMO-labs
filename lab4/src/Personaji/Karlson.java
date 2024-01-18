package Personaji;

import Interfaces.Status;
import TheatreAction.Kitchen;
import Enum.Kuro;
public class Karlson extends General implements Status{
    String StatusBodyPartKarlson;
    String StatusInPlaceNowKarlson;
    String StatusKarlson;
    public Karlson(String name, Kitchen.InKitchen thing){
        super(name);
        StatusInPlaceNowKarlson = "под " + thing;
    }
    public void dragged(Kitchen.InKitchen thing, UncleUlius uncleUlius){
        class minihand{
            final String mh = "Маленькая пухлая ручка ";
        void appear(){
            System.out.print(mh + "показалась " + "из " + StatusInPlaceNowKarlson);
        }
        void pull(){
            System.out.print("и потянула к себе " + thing + ".");
        }
        }  
        minihand KarlsonHand = new minihand();
        KarlsonHand.appear();
        KarlsonHand.pull();
        uncleUlius.canttake(thing);
    }
    public void eat(Kitchen.InKitchen thing){
        StatusKarlson = "ест в сухомятку " + thing;
        status();
        System.out.print(". ");
        thing.statusthing = "исчезают ";
        System.out.println(thing + thing.statusthing);
    }
    public void speech(Kuro citata){
        if (citata == Kuro.KuroBulka){
            System.out.println(" '' " + "курощение булочками" + " '' ");
        }else if (citata == Kuro.Bulkokura){
            System.out.println(name + "теперь устроил " + "новое дьявольское '' " + "булочное курощение " + " '' ");
        }
    }
    @Override
    public void status(){
        System.out.print(name + StatusKarlson);
    }
    @Override
    public String toString(){
        return name;
    }
}
