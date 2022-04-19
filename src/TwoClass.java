//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
//(включительно), если да - вернуть true, в противном случае - false.
//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, поло-
//жительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
//отрицательное, и false - если положительное.
//4. Написать метод, которому в качестве аргументов передаются строка и число, метод должен отпечатать в консоль
//указанную строку указанное количество раз.
//5* Написать метод, который определяет является ли год високосным, и возвращает boolean (високосный - true, не
//високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й - високосный.

public class TwoClass {

    public static void main(String[] args) {
        System.out.println(checkSum(10, 11));
        checkPositive(-7);
        System.out.println(checkNegative(-1));
        checkString("Routine", 3);
        checkYear(2026);
    }

    static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) return true;
        else return false;
    }

     static void checkPositive(int a) {
        if (a >= 0)
            System.out.println("Число " + a + "положительное");
        else
            System.out.println("Число " + a + " отрицательное");
    }

    static boolean checkNegative(int a) {
        if (a < 0) return true;
        return false;
    }

    static void checkString(String name, int a) {
                for (int i = 1; i <= a; i++) {
            System.out.println(name + "\t");

        }
    }

    static void checkYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else
            System.out.println(year + " г. високосный");
    }



}
