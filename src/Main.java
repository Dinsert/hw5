public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        if (clientOS < 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (clientOS < 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int year = 2021;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        int deliveryDistance = 95;
        int dayDelivery = 0;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance < 20) {
            dayDelivery = 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            dayDelivery = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            dayDelivery = 3;
        }
        System.out.println("Потребуется дней " + dayDelivery);



            int monthNumber = 10;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Программа не выполняется");
        }
    }
}