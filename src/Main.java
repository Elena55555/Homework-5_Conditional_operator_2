public class Main {
    public static void main(String[] args) {

        System.out.println("Домашняя работа № 5");
        System.out.println("Задание № 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание № 2 (первый способ)");

        int clientOS1 = 0;
        int clientDeviceYear = 2015;
        if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear >= 2015) {
                System.out.println(" ");
            }
        } else if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) ;
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println(" ");
        }

        System.out.println("Задание № 2 (2 способ)");

        int clientOS2 = 0;
        int clientDeviceYear1 = 2013;
        if (clientOS2 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear1 < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS2 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear1 < 2015) ;
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Задание № 2 (3 способ)");

        int clientOS3 = 0;
        int clientDeviceYear3 = 2015;
        if (clientOS3 == 0 && clientDeviceYear3 < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке. " +
                    "Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS3 == 1 && clientDeviceYear3 < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке. " +
                    "Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS3 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS  по ссылке");
        }

        System.out.println("Задание № 3 ");

        int year = 2013;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Год является високостным");
        } else if (year % 100 != 0) {
            System.out.println("Год не является  високостным");
        }

        System.out.println("Задание № 4");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день для доставки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется два дня для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется три дня для доставки");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }


    System.out.println("Задание № 5");

    int monthNumber = 12;

    switch (monthNumber) {
        case 1:
            System.out.println("Январь");
            break;
        case 2:
            System.out.println("Февраль");
            break;
        case 3:
            System.out.println("Март");
            break;
        case 4:
            System.out.println("Апрель");
            break;
        case 5:
            System.out.println("Май");
            break;
        case 6:
            System.out.println("Июнь");
            break;
        case 7:
            System.out.println("Июль");
            break;
        case 8:
            System.out.println("Август");
            break;
        case 9:
            System.out.println("Сентябрь");
            break;
        case 10:
            System.out.println("Октябрь");
            break;
        case 11:
            System.out.println("Ноябрь");
            break;
        case 12:
            System.out.println("Декабрь");
            break;
        default:
            System.out.println("Такого месяца не существует");
    }


    }



}
