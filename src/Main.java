public class Main {
    public static void main(String[] args) {

        int amount = 291; // денег изначально на счёте
        int incomingAmount = 1198; // клиент положил на счет
        int bonus = 100; // со скольки рублей начисляется 1 бонусный рубль
        int bonusReceived; // сколько получено бонусных рублей за пополнение

        if (incomingAmount >= 1000) {
            bonusReceived = incomingAmount / bonus;
            System.out.println("Получено " + bonusReceived + " бонусных руб.");
            System.out.println("Текущая сумма на счёте: " + (amount + incomingAmount + bonusReceived) + " руб.");
        } else {
            System.out.println("Сумма пополнения менее 1 000 руб., бонус не начисляется.");
            System.out.println("Текущая сумма на счёте: " + (amount + incomingAmount) + " руб.");
        }

    }
}