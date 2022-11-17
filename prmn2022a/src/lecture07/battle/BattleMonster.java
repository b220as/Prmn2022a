package lecture07.battle;

import lecture07.monster.IMonster;
import lecture07.monster.Monster;

public abstract class BattleMonster implements IBattleMonster{
    protected BattleMonster(Monster monster){
    }
    public abstract void attack(int skillIndex, IMonster opponent);
    protected abstract void receiveDamage(int damage,IMonster opponent);
}
