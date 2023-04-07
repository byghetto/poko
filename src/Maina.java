public class Maina {
    public static void main(String[] args) {
        System.out.println("Циклы 5-8 задание");
        task1();

    }

    public static void task1() {
        System.out.println("Задание 5");
 int newYears = 1260;
 for (int i = 0; i < 27; i = i + 6){
     newYears = newYears + newYears ;
     System.out.println("Месяц " + i + " Накопления " + newYears);
 }
        System.out.println("Задание 6");
        int deposit = 15000;
        int month = 0;
        double percent = 1.07;
        for (int q = 6; q < 120; q = q + q) {
            month = month + month;
            deposit = (int) (deposit * percent);
            System.out.println("Месяц " + q + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("Задание 7");
 int friday = 0;
 for (int y = 6; y < 31; y = y + 6){
     System.out.println("Сегодня пятница, " + y + "-е число !");
 }
        System.out.println("Задание 8");

        
}



    }