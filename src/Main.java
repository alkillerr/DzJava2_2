public class Main {
    public static void main(String[] args) {
        //количество бонусов
        int bonus;
        //начальный счёт
        int a = 100;
        //сумма пополнения
        int b = 1100;
        //проверим условие b>1000
        if (b>1000) {
            bonus=(b/100);
        }
        else {bonus = 0;
        }
        a=bonus + a + b;
        // на экран.
        System.out.println("Начисленно бонусов: " + bonus);
        System.out.println("Текущий баланс: " + a);

    }
}
