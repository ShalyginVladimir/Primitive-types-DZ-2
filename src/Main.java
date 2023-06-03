public class Main {
    public static void main(String[] args) {
        int check = 500;
        int refill = 1300;

        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;
        }

        int finalScore = check + refill + bonus;

        System.out.println("Итоговый счет:" + finalScore);
        System.out.println("Бонус:" + bonus);
    }
}
