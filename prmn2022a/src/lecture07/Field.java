package lecture07;

import lecture07.battle.EnemyMonster;
import lecture07.battle.IBattleMonster;
import lecture07.battle.PlayerMonster;

public class Field {
    private IBattleMonster playerMonster;
    private IBattleMonster enemyMonster;

    public Field(PlayerMonster playerMonster, EnemyMonster enemyMonster){
        this.playerMonster = playerMonster;
        this.enemyMonster = enemyMonster;
    }

    private void battle(){

    }

    private boolean Turn(IBattleMonster first,IBattleMonster second){

    }

    private int commandSelectPhase(IBattleMonster command){

    }
}
