package lecture04;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    List<Account> accountList;

    public ATM() {
        this.accountList = new ArrayList<Account>();
    }

    public void registerAccount(String name, String number) {
        Account ac = new Account(name, number);
        if (existAccount(name, number)) {
            System.out.println("名前:" + name + " 口座番号:" + number + "は存在します");
        } else {
            accountList.add(ac);
            System.out.println(name + "さんのアカウントを、口座番号:" + number + "で登録しました");
        }
    }

    public boolean existAccount(String name, String number) {
        for (Account account : accountList) {
            if (account.getName().equals(name) && account.getNumber().equals(number)) {
                System.out.println("名前:" + name + " 口座番号:" + number + "は存在します");
                return true;
            }
        }
        System.out.println("名前:" + name + " 口座番号:" + number + "は存在しません");
        return false;
    }

    public void deposit(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber().equals(number)) {
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号: " + number + " に " + money + " 円入金しました");
            }
        }
    }

    public long withdraw(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber().equals(number) && account.getBalance() >= money) {
                account.setBalance(account.getBalance() - money);
                System.out.println("口座番号: " + number + " から" + money + " 円引き出しました。　残高:" + account.getBalance() + "　円");
                return account.getBalance();
            } else {
                System.out.println("口座番号:" + number + " から" + money + " 円引き出せませんでした。　残高:" + account.getBalance() + "　円");
            }
        }
        return accountList.get(0).getBalance();

    }

}



