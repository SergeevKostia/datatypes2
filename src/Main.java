// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int account = 100;

        int refill = 2200;
        int present = refill / 100;
        int bonus;
        if (refill > 1000) {
            bonus = present;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус:" + bonus);
        System.out.println("Итоговая сумма:" + (account + refill + bonus));
    }
}






