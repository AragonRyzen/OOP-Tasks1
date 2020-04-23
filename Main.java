import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String []argc) {
    Scanner scanner = new Scanner(System.in);
        /*
        1) В Java есть единственный оператор, способный обеспечить остаток от операции
        деления. Два числа передаются в качестве параметров. Первый параметр,
        разделенный на второй параметр, будет иметь остаток, возможно, ноль. Верните
        это значение.
         */
        System.out.println(3%4);

        /*
        2) Напишите функцию, которая принимает основание и высоту треугольника и
        возвращает его площадь.
         */
        System.out.println("Введите основание и высоту");
        double a = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.println("Площадь =" + area(a,h));

        /*
        3) В этой задаче фермер просит вас сказать ему, сколько ног можно сосчитать среди
        всех его животных.
         */
        System.out.println("Введите количество chicken, cows и pigs");
        int chick = scanner.nextInt();
        int cow = scanner.nextInt();
        int pig = scanner.nextInt();
        System.out.println("Количество ног = " + legs(chick,cow,pig));

        /*
        4) Создайте функцию, которая принимает три аргумента (prob, prize, pay) и
        возвращает true, если prob * prize > pay; в противном случае возвращает false.
         */
        System.out.println("Введите prob, prize и pay");
        double prob = scanner.nextDouble();
        double prize = scanner.nextDouble();
        double pay = scanner.nextDouble();
        System.out.println(profitableGamble(prob,prize,pay));

        /*
        5) Напишите функцию, которая принимает 3 числа и возвращает, что нужно сделать с
        a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы
        получить N. Если ни одна из операций не может дать N, верните "none".
        3 числа – это N, a и b.
         */
        System.out.println("Введите a,b и N");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double N = scanner.nextDouble();
        System.out.println(check(a,b,N));

        /*
        6) Создайте функцию, которая возвращает значение ASCII переданного символа.
         */
        System.out.println("Введите символ");
        String sym = scanner.next();
        System.out.println(transfer(sym.charAt(0)));

        /*
        7) Напишите функцию, которая берет последнее число из последовательного списка
        чисел и возвращает сумму всех чисел до него и включая его.
         */
        System.out.println("Введите число");
        int ch = scanner.nextInt();
        System.out.println(Sum(ch));

        /*
        8) Создайте функцию, которая находит максимальное значение третьего ребра
        треугольника, где длины сторон являются целыми числами.
         */
        System.out.println("Введите длины сторон a и b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Максимальная длина третьей стороны = " + nextEdge(a,b));

        /*
        9)  Создайте функцию, которая принимает массив чисел и возвращает сумму его
        кубов.
         */
        System.out.println("Введите длину массива");
        int kol = scanner.nextInt();
        int[] array = new int[kol];
        for (int i = 0; i < kol; i++){
            System.out.println("Введите элемент массива");
            array[i] = scanner.nextInt();
        }
        System.out.println("Сумма кубов = "+sumOfCubes(array));

        /*
        Создайте функцию, которая будет для данного a, b, c выполнять следующие
        действия:
        – Добавьте A к себе B раз.
        – Проверьте, делится ли результат на C.
         */
        System.out.println("Введите a, b и c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(abcMath(a,b,c));
    }
//1
    public static double area(double aa, double ha){
        return (0.5*aa*ha);
}
//2
    public static int legs(int ch, int co, int pi){
        return (ch*2+co*4+pi*4);
    }
//4
    public static boolean profitableGamble(double a1, double a2, double a3){
        if (a1*a2>a3) {return true;}
        else return false;
    }
//5
    public static String check(double as, double bs, double Ns){
        if (as*bs==Ns) {return ("Умножить");}
        if (as+bs==Ns) {return ("Сложить");}
        if ((as-bs==Ns) || (bs-as==Ns)){return ("Вычесть");}
        if ((as/bs==Ns) || (bs/as==Ns)) {return ("Разделить");}
        return("none");
    }
//6
    public static int transfer(char snach){
        int ascii = (int) snach;
        return (ascii);
    }
//7
    public static int Sum(int a){
       int sum=0;
        for (int i=0; i<=a; i++){
        sum=sum+i;
        }
        return (sum);}

//8
    public static int nextEdge(int a, int b) {
        double a1 = a;
        double b1 = b;
        double sum = Math.sqrt(a1 * a1 + b1 * b1 - 2 * a1 * b1 * Math.cos(0));
        int maxI = 0;

        for (int i = 0; i < 180; i++) {
            double rez = Math.sqrt(a1 * a1 + b1 * b1 - 2 * a1 * b1 * Math.cos(i));
            if (rez > sum) {
                sum = rez;
                maxI = i;
            }
        }

        return (int) sum;
    }
//9
    public static int sumOfCubes(int[] mass) {
        int rez = 0;
        for (int num : mass) {
            rez += Math.pow(num, 3);
        }
        return rez;
    }
//10
    public static boolean abcMath(int af, int bf, int cf) {
        int rez = af;
        for (int i = 0; i < bf; i++) {
            rez += rez;

        }
        return rez % cf == 0;
    }
}
