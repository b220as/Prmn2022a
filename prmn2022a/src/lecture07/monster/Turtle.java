package lecture07.monster;

import lecture07.skill.*;

import java.util.Arrays;
import java.util.List;

public class Turtle extends Monster{
    public Turtle(){
        super("Turtle",55,17,16,15, Arrays.asList(new Tackle(),new RazorLeaf()));
    }

}
