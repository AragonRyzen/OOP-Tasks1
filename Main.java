import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String []argc) {
    Scanner scanner = new Scanner(System.in);
        /*
        1) � Java ���� ������������ ��������, ��������� ���������� ������� �� ��������
        �������. ��� ����� ���������� � �������� ����������. ������ ��������,
        ����������� �� ������ ��������, ����� ����� �������, ��������, ����. �������
        ��� ��������.
         */
        System.out.println(3%4);

        /*
        2) �������� �������, ������� ��������� ��������� � ������ ������������ �
        ���������� ��� �������.
         */
        System.out.println("������� ��������� � ������");
        double a = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.println("������� =" + area(a,h));

        /*
        3) � ���� ������ ������ ������ ��� ������� ���, ������� ��� ����� ��������� �����
        ���� ��� ��������.
         */
        System.out.println("������� ���������� chicken, cows � pigs");
        int chick = scanner.nextInt();
        int cow = scanner.nextInt();
        int pig = scanner.nextInt();
        System.out.println("���������� ��� = " + legs(chick,cow,pig));

        /*
        4) �������� �������, ������� ��������� ��� ��������� (prob, prize, pay) �
        ���������� true, ���� prob * prize > pay; � ��������� ������ ���������� false.
         */
        System.out.println("������� prob, prize � pay");
        double prob = scanner.nextDouble();
        double prize = scanner.nextDouble();
        double pay = scanner.nextDouble();
        System.out.println(profitableGamble(prob,prize,pay));

        /*
        5) �������� �������, ������� ��������� 3 ����� � ����������, ��� ����� ������� �
        a � b: ��� ������ ���� �������, ��������, �������� ��� ���������, �����
        �������� N. ���� �� ���� �� �������� �� ����� ���� N, ������� "none".
        3 ����� � ��� N, a � b.
         */
        System.out.println("������� a,b � N");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double N = scanner.nextDouble();
        System.out.println(check(a,b,N));

        /*
        6) �������� �������, ������� ���������� �������� ASCII ����������� �������.
         */
        System.out.println("������� ������");
        String sym = scanner.next();
        System.out.println(transfer(sym.charAt(0)));

        /*
        7) �������� �������, ������� ����� ��������� ����� �� ����������������� ������
        ����� � ���������� ����� ���� ����� �� ���� � ������� ���.
         */
        System.out.println("������� �����");
        int ch = scanner.nextInt();
        System.out.println(Sum(ch));

        /*
        8) �������� �������, ������� ������� ������������ �������� �������� �����
        ������������, ��� ����� ������ �������� ������ �������.
         */
        System.out.println("������� ����� ������ a � b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("������������ ����� ������� ������� = " + nextEdge(a,b));

        /*
        9)  �������� �������, ������� ��������� ������ ����� � ���������� ����� ���
        �����.
         */
        System.out.println("������� ����� �������");
        int kol = scanner.nextInt();
        int[] array = new int[kol];
        for (int i = 0; i < kol; i++){
            System.out.println("������� ������� �������");
            array[i] = scanner.nextInt();
        }
        System.out.println("����� ����� = "+sumOfCubes(array));

        /*
        �������� �������, ������� ����� ��� ������� a, b, c ��������� ���������
        ��������:
        � �������� A � ���� B ���.
        � ���������, ������� �� ��������� �� C.
         */
        System.out.println("������� a, b � c");
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
        if (as*bs==Ns) {return ("��������");}
        if (as+bs==Ns) {return ("�������");}
        if ((as-bs==Ns) || (bs-as==Ns)){return ("�������");}
        if ((as/bs==Ns) || (bs/as==Ns)) {return ("���������");}
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
