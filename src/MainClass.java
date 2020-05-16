public class MainClass {
    public static void main(String[] args) {
        //задание №2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        char g;
        boolean h;
        calc();
        summ();
        plusMinus();
        minus();
        hello("Костя");
        leapYear(444);
    }

    //задание №3 Написать метод вычисляющий выражение a * (b + (c / d)) и
    // возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static void calc() {
        double a, b, c, d, result;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        result = a * (b + (c / d));
        System.out.println(result);
    }

    //задание №4 Написать метод, принимающий на вход два числа, и проверяющий
    // что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static void summ() {
        int a, b;
        a = 5;
        b = 16;
        boolean result = (a + b >= 10 && a + b <= 20);
        System.out.println(result);
    }

    //задание №5 Написать метод, которому в качестве параметра передается целое число, метод должен
    // напечатать в консоль положительное ли число передали, или отрицательное;
    // Замечание: ноль считаем положительным числом.

    public static void plusMinus() {
        int a;
        a = 0;
        if (a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
    // если число отрицательное;

    public static boolean minus() {
        int a;
        a = 0;
        boolean result = (a < 0);
        System.out.println(result);
        return result;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен
    // вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
