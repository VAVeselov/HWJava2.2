public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int priceBonuce = 100;
        int popolnenie = 300;
        int balance;
        if (popolnenie > 1000) {
            balance = amount + popolnenie + popolnenie / priceBonuce;

        } else {
            balance = amount + popolnenie;
        }
        System.out.println(balance);

    }
}
