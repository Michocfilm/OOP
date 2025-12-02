// package q3_Wallet;

public class Wallet {
    public int coins;

    public Wallet(){  
    }
    public Wallet(int coins){
        this.coins = coins;
    }
    public void setCoins(int newCoins){
        this.coins = newCoins;
        System.out.println(newCoins);
    }
}