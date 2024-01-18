package Personaji;

import TheatreAction.Kitchen;

public class FrakenBok extends General{
    String StatusNowFrakenBok;
    public FrakenBok(String name){
        super(name);
    }
    public void give(Kitchen.InKitchen thing, General human){
        System.out.println(name + " подала " + thing + " " + human);
        StatusNowFrakenBok = name + " стоит у стола и молчит";
    }
    public void know(General proccess, Karlson karlson){
        System.out.println(name + "успела понять, как работает " + proccess.name + ", во время прошлых визитов " + karlson);
    }
    public void dontunderstand(UncleUlius ulius, Karlson karlson){
        System.out.println(name +"и "+ ulius+  "не поняли настоящего " + karlson.StatusKarlson);
    }
}
