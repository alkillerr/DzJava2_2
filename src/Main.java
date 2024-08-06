public class Main {
    public static void main(String[] args) {
        //количество бонусов
        int bonus;
        //начальный счёт
        int balance = 100;
        //сумма пополнения
        int amount = 1100;
        //проверим условие b>1000
        if (amount > 1000) {
            bonus = (amount / 100);
        } else {
            bonus = 0;
        }
        balance = bonus + balance + amount;
        // на экран.
        System.out.println("Начисленно бонусов: " + bonus);
        System.out.println("Текущий баланс: " + balance);

    }
}
