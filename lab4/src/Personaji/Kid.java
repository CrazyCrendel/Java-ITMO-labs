package Personaji;

import Interfaces.Status;
import TheatreAction.Kitchen;

public class Kid extends General implements Status{
    String StatusKid;
    public Kid(String name){
        super(name);
    }
    public void onlyunderstand(Kitchen.InKitchen thing){
        System.out.println("Только " + name + "понимает куда " + thing.statusthing + thing);
    }
    public void give(Kitchen.InKitchen thing, Karlson karlson){
        smile();
        System.out.print(". ");
        send(thing, karlson);
        System.out.println(",чтобы " + karlson + "не " + karlson.StatusKarlson);
        karlson.StatusKarlson = "курощение булочками ";

    }
    public void smile(){
        StatusKid = "сидит и хихикает ";
        status();
    }
    public void send(Kitchen.InKitchen thing, Karlson karlson){
        System.out.print(name + "отправил " + thing + karlson.StatusInPlaceNowKarlson);
    }
    @Override
    public void status(){
        System.out.print(name + StatusKid);
    }
}
