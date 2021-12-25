public class Cycled {

    //Пользователь вводит целое положительное число, посчитать сумму чисел от 1 до этого числа
    public static int Calculate1 (int number) {
        if (number<=0) {
            throw new RuntimeException("Аргумент должен быть целым положительным числом");
        }
        int sum = 0;
        for (int i=1; i<=number; i++){
            sum+=i;
        }
        return sum;
    }

    //Вычислить значение функции на отрезке [a,b] с шагом h
    public static double[] Calculate2 (double a, double b, double h){
        if (h==0.) {
            throw new RuntimeException("Шаг не должен равняться нулю");
        }
        if ((a>b && h>0)||(a<b && h<0)){
            double t = a;
            a = b;
            b = t;
        }
        int length= (int)((b-a)/h) + 1;
        double values[] = new double[length];
        for (int i=0; i<length; i++) {
            values[i]=Calculate2Function(a);
            a+=h;
        }
        return values;
    }
    private static double Calculate2Function(double x)
    {
        if (x>2){
            return x;
        }
        else {
            return -x;
        }
    }

    //Вычислить сумму квадратов первых 100 натуральных чисел
    public static int Calculate3() {
        int sum=0;
        for(int i=1; i<=100; i++){
            sum+=i*i;
        }
        return sum;
    }

    //Вычислить произведение квадратов первых 200 чисел
    public static long Calculate4(){
        long result=1;
        for(int i=1; i<=200; i++){
            result*=i*i;
        }
        return result;
    }

}
