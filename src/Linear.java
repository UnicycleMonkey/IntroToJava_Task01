import java.time.LocalTime;

public class Linear {

    //Условия задач для вывода пользователю
    public static final String [] DESCRIPTIONS = new String[]{
            "1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.",
            "2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):"+
                    "(b + √(b^2+4ac))/a2 - a^3*c + b^-2",
            "3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):"+
                    "((sinx+cosy)/(cosx-siny))*tg(x*y)",
            "4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять "+
                    "местами дробную и целую части числа и вывести полученное значение числа.",
            "5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести "+
                    "данное значение длительности в часах, минутах и секундах в следующей форме:   ННч ММмин SSc. ",
            "6. Для данной области составить линейную программу, которая печатает true, если точка с координатами "+
                    "(х, у) принадлежит закрашенной области, и false — в противном случае:"
    };

    // Найти значение выражения  z=((a-3)*b/2)+c
    public static double Calculate1 (double a, double b, double c){
        return ((a-3)*b/2)+c;
    }

    //Вычислить значение по формуле (все перем. принимают действительные значения)
    public static double Calculate2 (double a, double b, double c)
    {
        if (a==0) {
            throw new RuntimeException("Division by 0");
        }
        double sum=b*b+4*a*c;   //under root
        if (sum<0){
            throw new RuntimeException("b^2+4ac < 0");
        }
        sum= Math.pow(sum, 0.5)+b;
        sum/=(2*a);
        sum-=Math.pow(a,3)*c;
        sum+=Math.pow(b,-2);
        return sum;
    }

    //Вычислить значение по формуле (все перем. принимают действительные значения)
    public static double Calculate3 (double x, double y){
        double den = Math.cos(x) - Math.sin(y);
        if ( den==0 || Math.cos(x*y)==0){
            throw new RuntimeException("Division by 0");
        }
        return ((Math.sin(x) + Math.cos(y))/den)*Math.tan(x*y);
    }

    //Дано действительное число R вида nnn.ddd (3 разряда в целой и дробной части).Поменять местами целую и дробную части, вывести число
    public static double Calculate4(double number) {
        final int SYMBOL_COUNT=3; //число переставляемых разрядов
        int integerPart = (int)number;
        if (integerPart >= Math.pow(10, SYMBOL_COUNT+1))
        {
            throw  new RuntimeException("Number should be nnn.ddd");
        }
        double fractionalPart = number-integerPart;
        return (int)(fractionalPart*Math.pow(10, SYMBOL_COUNT)) + integerPart/Math.pow(10.,SYMBOL_COUNT);
    }

    //Перевести секунды в часы:минуты:секунды
    public static LocalTime Calculate5 (Integer seconds) {
        LocalTime result = LocalTime.of(0,0, 0);
        result=result.plusSeconds(seconds);
        return result;
    }
    //Принадлежит ли точка (x,y) закрашенной области
    public static boolean Calculate6 (double x, double y){
        //Задаем закрашенные области вершинами (xl1, yl1), (xr1, yr1) и (xl2, yl2), (xr2, yr2)
        double xl1 = -2, yl1 = 4;
        double xr1 = 2, yr1 = 0;
        double xl2 = -4, yl2 = 0;
        double xr2 = 4, yr2 = -3;
        return (PointLaysInRectangle(x, y, xl1, yl1, xr1, yr1) || PointLaysInRectangle(x, y, xl2, yl2, xr2, yr2));
    }
    //Приватный статический метод, определяющий, лежит ли точка в прямоугольнике, заданном левой верхней (xl, yl) и правой нижней (xr, yr) вершинами
    private static boolean PointLaysInRectangle(double x, double y, double xl, double yl, double xr, double yr) {
        return ((x>=xl && x<=xr) && (y<=yl && y>=yr));
    }

}
