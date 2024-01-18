package TheatreAction;

public class Kitchen {
    String Place;
    public Kitchen(String Place){
        this.Place = Place;
    }
    public static class InKitchen {
        String Thing;
        public String statusthing;
        public InKitchen(String Thing){
            this.Thing = Thing;
        }
        @Override
        public String toString() {
        return Thing;
    }
    }
    @Override
    public String toString(){
        return Place;
    }
}