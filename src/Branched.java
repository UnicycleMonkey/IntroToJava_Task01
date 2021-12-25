public class Branched {

    //Даны 2 угла в градусах. Определить, существует ли треугольник с ними; если да, прямоугольный ли он
    public static String Calculate1(double alpha, double beta){
        String result= "Треугольник (alpha = " + alpha+"; beta = "+beta+ ") ";
        if (IsTriangle(alpha, beta))
        {
            result+= "существует";
            result+= IsRectangularTriangle(alpha, beta)? "; треугольник прямоугольный":"; треугольник не прямоугольный";
        }
        else
        {
            result+= "не существует";
        }
        return result;
    }

    //Проверка на существование треугольника
    private static boolean IsTriangle(double alpha, double beta){
        return (alpha>0 && beta>0 && (alpha+beta<180));
    }

    //Проверка на прямоугольность треугольника
    private static boolean IsRectangularTriangle(double alpha, double beta){
        return (alpha+beta==90);
    }

    //Найти макс(мин(a,b),мин(c,d))
    public static double Calculate2 (double a, double b, double c, double d)
    {
        //IDEa предлагает использовать Math.min и Math.max соответственно
        double min1 = (a<b)? a: b;
        double min2 = (c<d)? c: d;
        return (min1>min2)? min1: min2;
    }

    //Даны три точки (x1,y1), (x2,y2) и (x3,y3). Определить, лежат ли они на одной прямой
    public static boolean Calculate3 (double x1,double y1,double x2,double y2,double x3,double y3){
        //Уравнение прямой: y=kx+a; k=(y1-y2)/(x1-x2). При x1==x2 график - вертикальная линия
        double a, k;
        if (x1==x2){
            return x2==x3;
        }
        k=(y1-y2)/(x1-x2);
        a= y1-k*x1;
        return ((k*x3+a)==y3);
    }

    //Даны габариты кирпича x,y,z и отверстия A и B. Определить, пролезет ли кирпич в отверстие
    public static boolean Calculate4 (double x, double y, double z, double a, double b){
        //Проверяем, чтобы все размеры были строго положительными
        if(x<=0||y<=0||z<=0||a<=0||b<=0){
            throw new RuntimeException("Габариты должны быть положительным числом");
        }
        //определяем пару минимальных габаритов
        double min1, min2;
        if (x<y){
            min1=x;
            if (y<z){
                min2=y;
            }
            else{
                min2=z;
            }
        }
        else {
            min1=y;
            if (x<z){
                min2=x;
            }
            else{
                min2=z;
            }
        }
        boolean result=false;

        //Проверка на тривиальный случай, когда входит без перекоса
        if ((min1<=a && min2<=b)||(min1<=b && min2<=a)){
            result=true;
        } else {
            //Проверка, влезает ли с перекосом
            /*
            Предположим, мы хотим расположить в прямоугольном отверстии АхВ деталь прямоугольного сечения PxQ (P>A, Q<B).
            Назовем alpha угол между стороной А и диагональю отверстия, вдоль которой вписана деталь; beta - угол
            между стороной детали P и отверстия А. Тогда справедливы неравенства:
            0 < beta < alpha
            P * cos beta < A
            P * sin beta + Q * cos beta <= B
            разделив  третье на второе имеем
            sin beta / cos beta + Q/P <= B/A
            tg beta <= B/A - Q/P
            .....

            Не работает, пока оставлю так, вдруг завтра раскурю
             */
        }
        return result;
    }

    //Вычислить значение функции в зависимости от х
    public static double Calculate5 (double x){
        double result;
        if (x<=3){
            result=x*x-3*x+9;
        }
        else{
            result = 1/(Math.pow(x,3)+6);
        }
        return result;
    }
}
