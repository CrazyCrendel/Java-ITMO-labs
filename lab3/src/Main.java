//Фрекен Бок никак не хотела показаться толстокожей, 
//потому она поспешила подтвердить, что ведьмы встречаются куда чаще, чем предполагаешь. А если как следует подумать, то станет ясно, что бывают и домовые.

import Objects.Live;
import Objects.thing;
import Enum.Actions;

public class Main{
    public static void main( String[] args){
        Live he = new Live("Он");
        Live fb = new Live("Фрекен Бок");
        
        thing eyes = new thing("глаза");

        he.doSmt(Actions.down, fb);
        System.out.print(" и ");
        eyes.getAdjectives("её");
        he.doSmt(Actions.See, eyes);
        System.out.print(". ");
        fb.doSmt(Actions.notWant);



    }
}   