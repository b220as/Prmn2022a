package lecture07.monster;

import lecture07.skill.Ember;
import lecture07.skill.Scratch;
import lecture07.skill.Tackle;

import java.util.Arrays;

public class Monkey extends Monster{

    public Monkey(){
        super("Monkey",44,14,11,31,Arrays.asList(new Scratch(),new Tackle(),new Ember()));
    }

}
