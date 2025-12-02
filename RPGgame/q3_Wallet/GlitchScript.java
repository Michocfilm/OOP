// package q3_Wallet;
// import q3_Wallet.Wallet2;
public class GlitchScript {
    public static void main(String[] args) {
        q3_1();
        q3_2();
    }

    static void q3_1(){
        Wallet myWallet = new Wallet();

        myWallet.coins = -999;

        System.out.println("Hack complete.");
        System.out.println("Current coins: " + myWallet.coins);
    }

    static void q3_2(){
        Wallet2 myWallet = new Wallet2(0);

        myWallet.setCoins(-999);

        System.out.println("Current coins: " + myWallet.getCoins());

    }
}