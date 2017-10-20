import java.util.function.DoubleUnaryOperator;
import java.util.Scanner;
/**
 * Created by Irishka on 17.10.2017.
 */
public class Integrator {

    public static double Rectangle(Functions function, double a, double b, int t) {
        int i;
        int n = 1000000;
        double s, h;
        s = 0;
        h = (b - a) / n;
        for (i = 0; i < n; i++) {
            s += function.f(a + h * (i + 0.5), t);
        }
        s *= h;
        return s;
    }


    public static double Simpson(Functions function, double a, double b, int t) {
        double eps = 0.0001;
        double I = eps + 1, I1 = 0;
        for (int N = 2; (N <= 4) || (Math.abs(I1 - I) > eps); N *= 2) {
            double h, sum2 = 0, sum4 = 0, sum = 0;
            h = (b - a) / (2 * N);
            for (int i = 1; i <= 2 * N - 1; i += 2) {
                sum4 += function.f(a + h * i, t);
                sum2 += function.f(a + h * (i + 1), t);
            }
            sum = function.f(a, t) + 4 * sum4 + 2 * sum2 - function.f(b, t);
            I = I1;
            I1 = (h / 3) * sum;
        }
        return I1;
    }

    public static double Trapeze(Functions function, double a, double b, int t) {
        final double eps = 0.00001;
        double step = b - a;
        double sum = (function.f(a, t) + function.f(b, t)) / 2 * step;
        for (; ; ) {
            double x = a + step / 2;
            double delta = 0;
            while (x < b) {
                delta += function.f(x, t);
                x += step;
            }
            delta *= step;
            if (Math.abs(sum - delta) < eps) {
                break;
            }
            sum = (sum + delta) / 2;
            step /= 2;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Введите  цифру 0 для работы с функцией по умолчанию или число от 1 до 10 для работы с заданными функциями:");
        //int t = in.nextInt();
            Functions f = new Function();
            System.out.print(" Введите границы интегрирования: ");
            double a = in.nextDouble();
            double b = in.nextDouble();
        for (int t = 1; t <= 10; t++) {
            Integrator s = new Integrator();
            Integrator I1 = new Integrator();
            Integrator sum = new Integrator();
            if (Math.abs(s.Rectangle(f, a, b, t) - I1.Simpson(f, a, b, t)) > 0.01) System.out.println("Ошибка");
            if (Math.abs(s.Rectangle(f, a, b, t) - sum.Trapeze(f, a, b, t)) > 0.01) System.out.println("Ошибка");
            if (Math.abs(I1.Simpson(f, a, b, t) - sum.Trapeze(f, a, b, t)) > 0.001) System.out.println("Ошибка");
            else
                System.out.println("Вычисление интеграла методом (левого) прямоугольника: " + s.Rectangle(f, a, b, t));
            System.out.println("Вычисление интеграла методом Симпсона:                " + I1.Simpson(f, a, b, t));
            System.out.println("Вычисление интеграла методом Tрапеции:                " + sum.Trapeze(f, a, b, t));
        }
    }
}