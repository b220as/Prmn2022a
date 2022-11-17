package lecture07.battle;

import lecture07.monster.IMonster;
import lecture07.monster.Monster;

public class EnemyMonster extends BattleMonster{

    public EnemyMonster(Monster monster) {
        super(monster);
    }

    @Override
    public int skillSelect() {
        return 0;
    }

    @Override
    public void attackOutput() {

    }

    @Override
    public void remainHpOutput() {

    }

    @Override
    public void skillListOutput() {

    }

    @Override
    public void winOutput() {

    }

    @Override
    public void loseOutput() {

    }
}
