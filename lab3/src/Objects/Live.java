package Objects;
import Enum.Actions;
//import Interface.Adjectives;
public class Live extends Obj {

    private String name;

    @Override
    public String toString(){
        return name;
    }

    public Live(String name){
        super(name);
        this.name = name;
    }

    public void doSmt(Actions Act, Obj O){
        if (Act == Actions.down){
            System.out.print(super.name + " нагнулся к " + O);
        }
        else if(Act == Actions.See){
            System.out.print("заглянул в " + O.name);
        }
    }

    public void doSmt(Actions Act){
        if (Act == Actions.notWant){
            System.out.print(super.name + " не хотела ");
        }
    }

    //public void getAdjectives(String adjective){
    //    super.name = this.name;
    //    super.name = adjective + " " + super.name;
    //}
}
