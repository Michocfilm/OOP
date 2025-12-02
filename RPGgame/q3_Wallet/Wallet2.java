// package q3_Wallet;

public class Wallet2 {
    private int coins;

    public Wallet2(int coins){
        this.coins = coins;
    }

    public int getCoins(){
        return coins;
    }

    public void setCoins(int newCoins){
        if (newCoins < 0) {
            System.out.println("Not Allow!!");
        } else {
            this.coins = newCoins;
            System.out.println(newCoins);
        }
    }
}