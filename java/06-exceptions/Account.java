public class Account{
    int balance;
    Account(){
        balance = 500;
    }
    ///new=false,old=true
    int deposit(int amount,boolean currencyType) throws DemonetizationException{
        if(amount>5000&&currencyType){
            throw new DemonetizationException(amount);
        }else{
            balance+=amount;
        }
        return balance;
    }


    ///returns how much could be withdrawn
    int withdraw(int amount){
        int withdrawable = (balance - amount)>500?(balance-amount):(balance-500);
        balance-=withdrawable;
        return withdrawable;
    }

    int getBalance(){return balance;}



}