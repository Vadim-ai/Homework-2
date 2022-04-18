public class Main {
    public static void main(String[] args) {

       /* int weightCat = 10; //вес в кг
        double weightHumster = 3.5;
        byte weightBird = 1;
        short myWeight = 91;
        float weightWhale = 10_000f;
        char agePutin = 63; //годы
        long whenMyCourseIsOver = 10; //месяцы */


        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double weightOfTwoBoxers = firstBoxer + secondBoxer;

        System.out.println("Общий вес двух бойцов - " + weightOfTwoBoxers + "кг." );

        double difference = secondBoxer - firstBoxer;

                System.out.println("Разница в весе составляет - " + difference + "кг");

         double oneBanan = 0.08;
         double oneMilk = 0.105;
         double iceCream = 0.1;
         double oneEgg = 0.07;

         double recepiForSportsmens = (oneBanan * 5) + (oneMilk * 2) + (iceCream * 2) + (oneEgg * 4);
         System.out.println("Вес завтрака - " + recepiForSportsmens + " кг");

         double overWeightOfSportsman = 7.0; // кг
         double stepOfWeightFirst = 0.2; // кг
         double stepOfWeightSecond = 0.5; // кг

        double qtyDays1 = overWeightOfSportsman/stepOfWeightFirst;
        double qtyDays2 = overWeightOfSportsman/stepOfWeightSecond;
        double middleQtyDays = overWeightOfSportsman/((stepOfWeightSecond + stepOfWeightFirst)/2);

        System.out.println("Чтобы похудеть на - " + overWeightOfSportsman + " кг," + "спортсмену потребуется - " + qtyDays1 + " дней." );
        System.out.println("Чтобы похудеть на - " + overWeightOfSportsman + " кг," + "спортсмену потребуется - " + qtyDays2 + " дней." );
        System.out.println("В среднем ему потребуется - " + middleQtyDays + " дней.");
        // я не понял где использовать %, а если так:
        qtyDays1 = 35.0; // дней из консоли
        qtyDays2 = 14.0;
        double middle2 = (qtyDays1 + qtyDays2)/2;
                System.out.println("В среднем ему потребуется - " + middle2 + " дня.");

        double salaryMasha = 67_760.0;
        double salaryDenis = 83_690.0;
        double salaryKristina = 76_230.0;

        double salaryBeforeBonusMasha = (salaryMasha) * 12; //обычная зп за год
        double salaryBeforeBonusDenis = (salaryDenis) * 12;
        double salaryBeforeBonusKristina = (salaryKristina) * 12;

        double newSalaryMasha = salaryMasha * 1.1; // новая зп за месяц
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;

        double salaryAfterBonusMasha = (salaryMasha * 1.1) * 12; // зп после бонуса за год
        double salaryAfterBonusDenis = (salaryDenis * 1.1) * 12;
        double salaryAfterBonusKristina = (salaryKristina * 1.1) * 12;

        double differenceBetweenSalaryMasha = salaryAfterBonusMasha - salaryBeforeBonusMasha; // разница между зп
        double differenceBetweenSalaryDenis = salaryAfterBonusDenis - salaryBeforeBonusDenis;
        double differenceBetweenSalaryKristina = salaryAfterBonusKristina - salaryBeforeBonusKristina;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceBetweenSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceBetweenSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceBetweenSalaryKristina + " рублей.");
    }
}