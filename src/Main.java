public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int a = 123456789;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 123;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 32123;
        System.out.println("Значение переменной c с типом short равно " + c);
        long peopleWorld = 8046949318L;
        System.out.println("Значение переменной peopleWorld с типом long равно " + peopleWorld);
        float d = 0.6666666f;
        System.out.println("Значение переменной d с типом float равно " + d);
        double f = 0.5555555555555555;
        System.out.println("Значение переменной f с типом double равно " + f);

        // Задача 2
        System.out.println("Задача 2");
        float g = 27.12f;
        System.out.println(g);
        double h = 27.12;
        System.out.println(h);
        long j = 987678965549L;
        System.out.println(j);
        byte k = 2;
        System.out.println(k);
        short l = 786;
        System.out.println(l);
        var q = false;
        System.out.println(q);
        short w = 569;
        System.out.println(w);
        short e = -159;
        System.out.println(e);
        short r = 27897;
        System.out.println(r);
        byte t = 67;
        System.out.println(t);

        // Задача 3
        System.out.println("Задача 3");
        short lpPupil = 23;
        short asPupil = 27;
        short eaPupil = 30;
        short totalSheets = 480;
        int sheetsPerPupil = totalSheets / (lpPupil + asPupil + eaPupil);
        System.out.println("На каждого ученика рассчитано " + sheetsPerPupil + " листов бумаги.");

        // Задача 4
        System.out.println("Задача 4");
        int productionCapacity = 16/2;
        int productionCapacityTwMin = productionCapacity * 20;
        System.out.println("За 20 минут машина произвела бутылок " + productionCapacityTwMin + " штук.");
        int productionCapacityDay = productionCapacity * 1440;
        System.out.println("За сутки машина произвела бутылок " + productionCapacityDay + " штук.");
        int productionCapacityThDay = productionCapacity * 1440*3;
        System.out.println("За 3 дня машина произвела бутылок " + productionCapacityThDay + " штук.");
        int productionCapacityMonth = productionCapacity * 1440*30;
        System.out.println("За 1 месяц машина произвела бутылок " + productionCapacityMonth + " штук.");

        // Задача 5
        System.out.println("Задача 5");
        short totalPotPaint = 120;
        short oneClassroomPot = 2 + 4;
        int totalClassroom = totalPotPaint / oneClassroomPot;
        System.out.println("В школе, где " + totalClassroom + " классов нужно " + totalClassroom * 2 + " банок белой краски и " + totalClassroom * 4 + " банок коричневой краски.");

        // Задача 6
        System.out.println("Задача 6");
        int bananaWeight = 5*80;
        int milkWeight = 200/100*105;
        int iceCreamWeight = 2*100;
        int eggWeight= 4*70;
        double cocktailWeight = bananaWeight + milkWeight + iceCreamWeight + eggWeight;
        System.out.println("Вес спорт-завтрака спортсмена " + cocktailWeight/1000 + " килограмм.");

        // Задача 7
        System.out.println("Задача 7");
        int weightLoss = 7*1000;
        int weightOne = 250;
        int weightTwo = 500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то он похудеет за  " + weightLoss/weightOne + " дней.");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то он похудеет за  " + weightLoss/weightTwo + " дней.");
        System.out.println("В среднем спортсмену потребуется для достижения нужного веса " + (weightLoss/weightOne + weightLoss/weightTwo)/2 + " день.");

        // Задача 8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double salaryMashaIncrease = salaryMasha * 0.1;
        double salaryDenisIncrease = salaryDenis * 0.1;
        double salaryKristinaIncrease = salaryKristina * 0.1;
        System.out.println("Маша теперь получает " + (salaryMasha + salaryMashaIncrease) + " рублей. Годовой доход вырос на " + salaryMashaIncrease +  " рублей.");
        System.out.println("Маша теперь получает " + (salaryDenis + salaryDenisIncrease) + " рублей. Годовой доход вырос на " + salaryDenisIncrease +  " рублей.");
        System.out.println("Маша теперь получает " + (salaryKristina + salaryKristinaIncrease) + " рублей. Годовой доход вырос на " + salaryKristinaIncrease +  " рублей.");

    }
}