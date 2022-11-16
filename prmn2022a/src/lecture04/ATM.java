package lecture04;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class ATM {
    private final List<Account> accountList;

    ATM(){
        accountList = new ArrayList<>();
    }

    //アカウントの登録
    public void registerAccount(String name,String number){
        accountList.add(new Account(name,number));
        System.out.println("氏名 "+name+" 口座番号 "+number+" の口座を新規開設");
    }

    //アカウントが存在するか確認
    public boolean existsAccount(String name,String number){
        for(Account account : accountList){
            if(Objects.equals(account.name, name) && Objects.equals(account.number, number)){
                System.out.println("氏名 "+account.name+" 口座番号 "+account.number+" の口座が存在します");
                return true ;
            }
        }
        System.out.println("氏名 "+name+" 口座番号 "+number+" の口座が存在しません");
        return false;
    }

    //入金
    public void deposit(String number,long money){
        for(Account account : accountList){
            if(Objects.equals(account.number, number)){
                account.balance += money;
                System.out.println("口座番号 "+account.number+" へ "+money+" 円入金完了");
            }
        }
    }

    //引出(戻り値：残高)
    public long withdraw(String number,long money){
        for(Account account : accountList){
            if(Objects.equals(account.number, number)){
                if(account.balance >= money) {
                    account.balance -= money;
                    System.out.println("口座番号 "+account.number+" : "+money+" 円引出 : 残高 "+account.balance+" 円");
                }else{
                    System.out.println("口座番号 "+account.number+" : 残高不足で "+money+" 円引出不可 : 残高 "+account.balance+" 円");
                }
            }
            return account.balance;
        }
        System.out.println("口座番号 "+number+" の口座は存在しません");
        return 0;
    }
}
