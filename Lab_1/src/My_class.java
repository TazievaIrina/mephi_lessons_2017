/**
 * Created by Irishka on 08.10.2017.
 */
public class My_class {


    public static double MinHalf(Functions function, double a, double b) {
        double x1, x2, c, e;
        e = 0.001;
        while (true) {
            c = (a + b) / 2;
            x1 = c - 0.001;
            x2 = c + 0.001;
            if (function.f(x1) >= function.f(x2))
                a = c;
            else
                b = c;
            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }

    public static double MaxHalf(Functions function, double a, double b){
        double x1, x2, c, e;
        e=0.001;
        while (true){
            c = (a + b) / 2;
            x1 = c - 0.001;
            x2 = c + 0.001;
            if (function.f(x1) <= function.f(x2))
                a = c;
            else
                b = c;
            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }

    public static double MinGold(Functions function, double a, double b) {
        double x1, x2;
        final double w = (1 + Math.sqrt(5)) / 2;
        double e = 0.001;
        while (true) {
            x1 = b - (b - a) / w;
            x2 = a + (b - a) / w;
            if (function.f(x1) >= function.f(x2))
                a = x1;
            else
                b = x2;
            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }
    public static double MaxGold(Functions function, double a, double b){
        double x1, x2;
        double e=0.001;
        final double w = (1 + Math.sqrt(5)) / 2;
        while (true){
            x1 = b - (b - a) / w;
            x2 = a + (b - a) / w;
            if (function.f(x1) <= function.f(x2))
                a = x1;
            else
                b = x2;
            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }


    public static void main(String[] args) {
        Functions fun1 = new Function1();
        double z1 = My_class.MinHalf(fun1, -2, -1);
        double n1= My_class.MinGold(fun1,-2,-1);
        double z2 = My_class.MaxHalf(fun1, 2, 4);
        double n2 = My_class.MaxGold(fun1, 2, 4);
        System.out.println("Функция 1");
        System.out.println("Минимум:");
        if (Math.abs(z1+1.57)<=0.001)
            System.out.println("Метод деления поплам "+z1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(n1+1.57)<=0.001)
            System.out.println("Метод золотого сечения "+n1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(z2-3.141)<=0.001)
            System.out.println("Метод деления пополам "+ z2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(n2-3.141)<=0.001)
            System.out.println("Метод золотого сечения "+ z2);
        else System.out.println("Ошибка в расчете вторым методом");

        Functions fun2 = new Function2();
        double a1 = My_class.MinHalf(fun2, 3, 5);
        double b1= My_class.MinGold(fun2,3,5);
        double a2 = My_class.MaxHalf(fun2, 1, 3);
        double b2 = My_class.MaxGold(fun2, 1, 3);
        System.out.println("Функция 2");
        System.out.println("Минимум:");
        if (Math.abs(a1-3.816)<=0.001)
            System.out.println("Метод деления поплам "+a1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(b1-3.816)<=0.001)
            System.out.println("Метод золотого сечения "+b1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(a2-2.175)<=0.001)
            System.out.println("Метод деления пополам "+ a2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(b2-2.175)<=0.001)
            System.out.println("Метод золотого сечения "+ b2);
        else System.out.println("Ошибка в расчете вторым методом");

        Functions fun3 = new Function3();
        double c1 = My_class.MinHalf(fun3, 0, 2);
        double d1= My_class.MinGold(fun3,0,2);
        double c2 = My_class.MaxHalf(fun3, -2, 0);
        double d2 = My_class.MaxGold(fun3, -2, 0);
        System.out.println("Функция 3");
        System.out.println("Минимум:");
        if (Math.abs(c1-1.154)<=0.001)
            System.out.println("Метод деления поплам "+c1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(d1-1.154)<=0.001)
            System.out.println("Метод золотого сечения "+d1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(c2+1.154)<=0.001)
            System.out.println("Метод деления пополам "+ c2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(d2+1.154)<=0.001)
            System.out.println("Метод золотого сечения "+ d2);
        else System.out.println("Ошибка в расчете вторым методом");

        Functions fun4 = new Function4();
        double v1 = My_class.MinHalf(fun4, -3, 0);
        double u1= My_class.MinGold(fun4,-3,0);
        double v2 = My_class.MaxHalf(fun4, 0, 3);
        double u2 = My_class.MaxGold(fun4, 0, 3);
        System.out.println("Функция 4");
        System.out.println("Минимум:");
        if (Math.abs(v1+1.57)<=0.001)
            System.out.println("Метод деления поплам "+v1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(u1+1.57)<=0.001)
            System.out.println("Метод золотого сечения "+u1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(v2-1.57)<=0.001)
            System.out.println("Метод деления пополам "+ v2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(u2-1.57)<=0.001)
            System.out.println("Метод золотого сечения "+ u2);
        else System.out.println("Ошибка в расчете вторым методом");

        Functions fun5 = new Function5();
        double l1 = My_class.MinHalf(fun5, 1, 2);
        double m1= My_class.MinGold(fun5,1,2);
        double l2 = My_class.MaxHalf(fun5, 2, 4);
        double m2 = My_class.MaxGold(fun5, 2, 4);
        System.out.println("Функция 5");
        System.out.println("Минимум:");
        if (Math.abs(l1-1.57)<=0.001)
            System.out.println("Метод деления поплам "+l1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(m1-1.57)<=0.001)
            System.out.println("Метод золотого сечения "+m1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(l2-3.141)<=0.001)
            System.out.println("Метод деления пополам "+ l2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(m2-3.141)<=0.001)
            System.out.println("Метод золотого сечения "+ m2);
        else System.out.println("Ошибка в расчете вторым методом");

        Functions fun6 = new Function6();
        double f1 = My_class.MinHalf(fun6, 2, 4);
        double k1= My_class.MinGold(fun6,2,4);
        double f2 = My_class.MaxHalf(fun6, 5, 8);
        double k2 = My_class.MaxGold(fun6, 5,8 );
        System.out.println("Функция 6");
        System.out.println("Минимум:");
        if (Math.abs(f1-3.141)<=0.001)
            System.out.println("Метод деления поплам "+f1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(k1-3.141)<=0.001)
            System.out.println("Метод золотого сечения "+k1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(f2-6.283)<=0.001)
            System.out.println("Метод деления пополам "+ f2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(k2-6.283)<=0.001)
            System.out.println("Метод золотого сечения "+ k2);
        else System.out.println("Ошибка в расчете вторым методом");

        Functions fun7 = new Function7();
        double t1 = My_class.MinHalf(fun7, 1, 2);
        double j1= My_class.MinGold(fun7,1,2);
        double t2 = My_class.MaxHalf(fun7, -1, 1);
        double j2 = My_class.MaxGold(fun7, -1,1 );
        System.out.println("Функция 7");
        System.out.println("Минимум:");
        if (Math.abs(t1-1.57)<=0.001)
            System.out.println("Метод деления поплам "+t1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(j1-1.57)<=0.001)
            System.out.println("Метод золотого сечения "+j1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(t2-0)<=0.001)
            System.out.println("Метод деления пополам "+ t2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(j2-0)<=0.001)
            System.out.println("Метод золотого сечения "+ j2);
        else System.out.println("Ошибка в расчете вторым методом");

        Functions fun8 = new Function8();
        double o1 = My_class.MinHalf(fun8, 5, 6);
        double p1= My_class.MinGold(fun8,5,6);
        double o2 = My_class.MaxHalf(fun8, 4, 5);
        double p2 = My_class.MaxGold(fun8, 4,5 );
        System.out.println("Функция 8");
        System.out.println("Минимум:");
        if (Math.abs(o1-5.668)<=0.001)
            System.out.println("Метод деления поплам "+o1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(p1-5.668)<=0.001)
            System.out.println("Метод золотого сечения "+p1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(o2-4.331)<=0.001)
            System.out.println("Метод деления пополам "+ o2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(p2-4.331)<=0.001)
            System.out.println("Метод золотого сечения "+ p2);
        else System.out.println("Ошибка в расчете вторым методом");

        Functions fun9 = new Function9();
        double w1 = My_class.MinHalf(fun9, 4, 8);
        double r1= My_class.MinGold(fun9,4,8);
        double w2 = My_class.MaxHalf(fun9, 2, 4);
        double r2 = My_class.MaxGold(fun9, 2,4 );
        System.out.println("Функция 9");
        System.out.println("Минимум:");
        if (Math.abs(w1-5.786)<=0.001)
            System.out.println("Метод деления поплам "+w1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(r1-5.786)<=0.001)
            System.out.println("Метод золотого сечения "+r1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(w2-2.88)<=0.001)
            System.out.println("Метод деления пополам "+ w2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(r2-2.88)<=0.001)
            System.out.println("Метод золотого сечения "+ r2);
        else System.out.println("Ошибка в расчете вторым методом");

        Functions fun10 = new Function10();
        double y1 = My_class.MinHalf(fun10, 0, 1);
        double e1= My_class.MinGold(fun10,0,1);
        double y2 = My_class.MaxHalf(fun10, 2, 3);
        double e2 = My_class.MaxGold(fun10, 2,3 );
        System.out.println("Функция 10");
        System.out.println("Минимум:");
        if (Math.abs(y1-0.425)<=0.001)
            System.out.println("Метод деления поплам "+e1);
        else System.out.println("Ошибка в расчете первым методом");
        if (Math.abs(e1-0.425)<=0.001)
            System.out.println("Метод золотого сечения "+y1);
        else System.out.println("Ошибка в расчете первым методом");
        System.out.println("Максимум: ");
        if (Math.abs(y2-2.349)<=0.001)
            System.out.println("Метод деления пополам "+ y2);
        else System.out.println("Ошибка в расчете вторым методом");
        if (Math.abs(e2-2.349)<=0.001)
            System.out.println("Метод золотого сечения "+ e2);
        else System.out.println("Ошибка в расчете вторым методом");
    }
}


