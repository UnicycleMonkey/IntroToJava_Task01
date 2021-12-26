import java.lang.reflect.Array;
import java.math.BigInteger;

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
    public static String Calculate4(){
        //Произведение квадратов равно квадрату произведения: a^2*b^2 = a*a*b*b = (a*b)*(a*b) = (a*b)^2
        BigInteger result = new BigInteger("1"); //Примитивные типы ожидаемо переполняются

        //Находим произведение нат. чисел от 1 до 200 включительно
        for(int i=1; i<=200; i++){
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        //Не забываем возвести в квадрат!
        result=result.pow(2);
        //Хрен его знает, как ЭТО проверять
        return result.toString();
    }

    //Вычислить сумму всех членов ряда, больших или равных указанного значения е
    public static double Calculate5(double e){
        double sum = 0;
        int i = 1;
        double an=Calculate5an(i);
        while (an>=e){
            sum+=an;
            an=Calculate5an(++i);
        }
        return sum;
    }
    //Вычисление n-ного члена ряда для задания 5
    private static double Calculate5an(int n)
    {
        return (1./Math.pow(2,n) +1./Math.pow(3,n));
    }

    //Вывести на экран соответствИЙ(?) между символами и их численными обозначениями в памяти компьютера
    public static String Calculate6(){
        //Думаю, 256 символов и их ASCII-кодами должно хватить
        String result="";
        for (int i=0; i<256; i++)
        {
            char c= (char)(i);
                result += i + " - " + c + ";   ";
        }
        return result;
    }

    //Для каждого натурального числа в промежутке от m до n (водятся с клавиатуры), вывести их делители (кроме 1 и себя)
    public static String Calculate7(int m, int n){
        if (m<1||n<1||n<m){
            throw new RuntimeException("Неверно введены значения m, n");
        }
        String result="";
        for (int i=m; i<n; i++){
            result+=i+": "+Calculate7GetDividers(i)+"\n";
        }
        return result;
    }

    private static String Calculate7GetDividers(int number){
        String result ="";
        for (int i=2; i<number; i++) {
            if (number%i==0){
                result+=i+" ";
            }
        }
        return result;
    }

    //Даны два числа. Определить цифры, входящие в запись обоих чисел
    public static String Calculate8 (double number1, double number2){
        //Не уверен, что прям хорошая реализация, но я ж должен показать, что умею в foreach
        final char[] DIGITS= {'0','1','2','3','4','5','6','7','8','9'};
        String str1 = String.valueOf(number1);
        String str2 = String.valueOf(number2);
        String result="";
        for (char digit: DIGITS
             ) {
            if(str1.indexOf(digit)>0 && str2.indexOf(digit)>0){
                result+=digit+" ";
            }
        }
        return result;
    }
}
