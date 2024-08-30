public class Main {
    public static void main(String[] args) {
        // Task #1
        {
            int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке ... .");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке ... .");
            }
            System.out.println();
        }
        // Task #2
        {
            int clientOS = 0;
            int clientDeviceYear = 2015;
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке ... .");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке ... .");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке ... .");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке ... .");
            }
            System.out.println();
        }
        // Task #3
        {
            int year = 1584;
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
            System.out.println();
        }
        // Task #4
        {
            int deliveryDistance = 95;
            if (deliveryDistance < 20) {
                System.out.println(" Потребуется дней: 1 день.");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: 2 дня.");
            }
            else if (deliveryDistance>= 60 && deliveryDistance<100){
                System.out.println("Потребуется дней: 3 дня.");
            }else {
                System.out.println("Свыше 100 км доставки нет.");
            }
            System.out.println();
        }
        // Task # 5
        {
            int monthNumber = 12;
            switch (monthNumber){
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
            System.out.println();
        }

    }
}