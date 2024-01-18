package Personaji;
import Interfaces.Status;
import TheatreAction.Kitchen;

public class UncleUlius extends General implements Status{
    String StatusEmotionsNowUncleUlius;
    String StatusInPlaceNowUncleUlius;
    String StatusHisBodyPart;
    public UncleUlius(String name){
        super(name);
    }
    public class into{
        private String NameBodyPart;
        public into(String NameBodyPart){
            this.NameBodyPart = NameBodyPart;
        }
        public void absorb(Kitchen place, Kitchen.InKitchen thing){
            StatusEmotionsNowUncleUlius = NameBodyPart + "поглотили";
            System.out.println(NameBodyPart + "поглотили" + " " + name);
            status();
            where(place, thing);
        }
        @Override
        public String toString() {
        return NameBodyPart;
    }
    }
    public void get(into bodypart, Kitchen.InKitchen thing){
        StatusHisBodyPart = "протянул ";
        needto(thing);
        bodypartstatus(bodypart);
        if (StatusEmotionsNowUncleUlius.equals("Мысли поглотили")){
            System.out.println("не глядя ");
        }
    }
    public void needto(Kitchen.InKitchen thing){
        System.out.print(name + "хочет ");
        take();
        System.out.print(thing + ". ");
    }
    public void take(){
            System.out.print("взять ");
    }
    public void canttake(Kitchen.InKitchen thing){
        System.out.println(name + "не смог взять " + thing);
    }
    public void roast(into bodypart, Kitchen.InKitchen thing, Kitchen.InKitchen thing1){
        if (StatusEmotionsNowUncleUlius.equals("Мысли поглотили")){
            System.out.print(StatusEmotionsNowUncleUlius +" "+ name);
            System.out.print(". ");
            StatusHisBodyPart = "в " + thing;
            bodypartstatus(bodypart);
            StatusEmotionsNowUncleUlius = "очнулся ";
            System.out.print(". ");
            understand(thing1);
            status();
            bodypart.NameBodyPart = "обоженная рука";
        }
    }
    public void blowangry(into bodypart){
        StatusHisBodyPart = "поднёс к лицу ";
        bodypartstatus(bodypart);
        System.out.print(" и подул на " + bodypart);
        System.out.print(". ");
        StatusEmotionsNowUncleUlius = "разозлился ";
        status();
    }
    public void understand(Kitchen.InKitchen thing1){
        System.out.print(name + "понял, что ");
        canttake(thing1);
    }
    public void bodypartstatus(into bodypart){
        System.out.print(name + StatusHisBodyPart + bodypart);
    }

    @Override
    public void status(){
        if (StatusEmotionsNowUncleUlius.equals("Мысли поглотили")){
            System.out.print(name + "не говорил и не слушал. ");
        }else if(StatusEmotionsNowUncleUlius.equals("очнулся ")){
            System.out.println(name + "очнулся ");
        }else{
            System.out.println(name + StatusEmotionsNowUncleUlius);
        }
    }
    public void where(Kitchen place, Kitchen.InKitchen thing){
        StatusInPlaceNowUncleUlius = name + "на " + place + "за " + thing;
        System.out.println(StatusInPlaceNowUncleUlius + ". ");
    }
    @Override
    public String toString() {
        return name;
    }
}