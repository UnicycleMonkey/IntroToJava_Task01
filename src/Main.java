import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/*Тестовое задание первого этапа содержит 3 раздела: линейные алгоритмы, алгоритмы с ветвлением
и алгоритмы с повторением. Для каждого раздела создан собственный статический класс */
public class Main {
    public static void main(String args[]) {
        String input;
        int inp=0;
        do{
            try {
                userOutput("Тестовое задание первого этапа содержит 3 раздела: линейные алгоритмы (11-16), алгоритмы " +
                        "с ветвлением(21-25) и алгоритмы с повторением (31-38). \nВведите номер задачи или 0 для выхода");
                input = userInput();
                inp = Integer.parseInt(input);
                //переход к задаче, первый знак - раздел, второй - номер
                switch (inp) {
                    case 11: {
                        userOutput(Linear.DESCRIPTIONS[(inp%10)-1]);
                        double a,b,c;
                        userOutput("Введите а");
                        a=Double.parseDouble(userInput());
                        userOutput("Введите b");
                        b=Double.parseDouble(userInput());
                        userOutput("Введите c");
                        c=Double.parseDouble(userInput());
                        userOutput("Результат: "+Linear.Calculate1(a,b,c));
                        break;
                    }
                    case 12: {
                        userOutput(Linear.DESCRIPTIONS[(inp%10)-1]);
                        double a,b,c;
                        userOutput("Введите а");
                        a=Double.parseDouble(userInput());
                        userOutput("Введите b");
                        b=Double.parseDouble(userInput());
                        userOutput("Введите c");
                        c=Double.parseDouble(userInput());
                        userOutput("Результат: "+Linear.Calculate2(a,b,c));
                        break;
                    }
                    case 13: {
                        userOutput(Linear.DESCRIPTIONS[(inp%10)-1]);
                        double x,y;
                        userOutput("Введите x");
                        x=Double.parseDouble(userInput());
                        userOutput("Введите y");
                        y=Double.parseDouble(userInput());
                        userOutput("Результат: "+Linear.Calculate3(x,y));
                        break;
                    }
                    case 14: {
                        double r;
                        userOutput(Linear.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите R");
                        r=Double.parseDouble(userInput());
                        userOutput("Результат: "+Linear.Calculate4(r));
                        break;
                    }
                    case 15: {
                        int t;
                        userOutput(Linear.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите R");
                        t=Integer.parseInt(userInput());
                        userOutput("Результат: "+Linear.Calculate5(t));
                        break;
                    }
                    case 16: {
                        userOutput(Linear.DESCRIPTIONS[(inp%10)-1]);
                        double x,y;
                        userOutput("Введите x");
                        x=Double.parseDouble(userInput());
                        userOutput("Введите y");
                        y=Double.parseDouble(userInput());
                        userOutput("Результат: "+Linear.Calculate6(x,y));
                        break;
                    }
                    case 21: {
                        userOutput(Branched.DESCRIPTIONS[(inp%10)-1]);
                        double x,y;
                        userOutput("Введите угол альфа (в градусах!)");
                        x=Double.parseDouble(userInput());
                        userOutput("Введите угол бета (в градусах!)");
                        y=Double.parseDouble(userInput());
                        userOutput("Результат: "+Branched.Calculate1(x,y));
                        break;
                    }
                    case 22: {
                        double a,b,c,d;
                        userOutput(Branched.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите a");
                        a=Double.parseDouble(userInput());
                        userOutput("Введите b");
                        b=Double.parseDouble(userInput());
                        userOutput("Введите c");
                        c=Double.parseDouble(userInput());
                        userOutput("Введите d");
                        d=Double.parseDouble(userInput());
                        userOutput("Результат: "+Branched.Calculate2(a,b,c,d));
                        break;
                    }
                    case 23: {
                        double x1,x2,x3,y1,y2,y3;
                        userOutput(Branched.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите x1");
                        x1=Double.parseDouble(userInput());
                        userOutput("Введите y1");
                        y1=Double.parseDouble(userInput());
                        userOutput("Введите x2");
                        x2=Double.parseDouble(userInput());
                        userOutput("Введите y2");
                        y2=Double.parseDouble(userInput());
                        userOutput("Введите x3");
                        x3=Double.parseDouble(userInput());
                        userOutput("Введите y3");
                        y3=Double.parseDouble(userInput());
                        userOutput("Результат: "+Branched.Calculate3(x1,y1,x2,y2,x3,y3));
                        break;
                    }
                    case 24: {
                        double x,y,z,a,b;
                        userOutput(Branched.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите x");
                        x=Double.parseDouble(userInput());
                        userOutput("Введите y");
                        y=Double.parseDouble(userInput());
                        userOutput("Введите z");
                        z=Double.parseDouble(userInput());
                        userOutput("Введите a");
                        a=Double.parseDouble(userInput());
                        userOutput("Введите b");
                        b=Double.parseDouble(userInput());
                        userOutput("Результат: "+Branched.Calculate4(x,y,z,a,b));
                        break;
                    }
                    case 25: {
                        double x;
                        userOutput(Branched.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите x");
                        x=Double.parseDouble(userInput());
                        userOutput("Результат: "+Branched.Calculate5(x));
                        break;
                    }
                    case 31: {
                        int x;
                        userOutput(Cycled.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите x");
                        x=Integer.parseInt(userInput());
                        userOutput("Результат: "+Cycled.Calculate1(x));
                        break;
                    }
                    case 32: {
                        double a, b, h;
                        double[] resultArray;
                        String resultString = "";
                        userOutput(Cycled.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите a");
                        a=Double.parseDouble(userInput());
                        userOutput("Введите b");
                        b=Double.parseDouble(userInput());
                        userOutput("Введите h");
                        h=Double.parseDouble(userInput());
                        resultArray = Cycled.Calculate2(a, b, h);
                        for (int i=0; i<resultArray.length; i++) {
                            resultString+=resultArray[i]+"\t";
                            if(i>0 && i%10==0)
                            {
                                resultString+="\n";
                            }
                        }
                        userOutput("Результат: "+resultString);
                        break;
                    }
                    case 33: {
                        userOutput(Cycled.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Результат: "+Cycled.Calculate3());
                        break;
                    }
                    case 34: {
                        userOutput(Cycled.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Результат: "+Cycled.Calculate4());
                        break;
                    }
                    case 35: {
                        double e;
                        userOutput(Cycled.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите e");
                        e=Double.parseDouble(userInput());
                        userOutput("Результат: "+Cycled.Calculate5(e));
                        break;
                    }
                    case 36: {
                        userOutput(Cycled.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Результат: "+Cycled.Calculate6());
                        break;
                    }
                    case 37: {
                        int n, m;
                        userOutput(Cycled.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите n");
                        n=Integer.parseInt(userInput());
                        userOutput("Введите m");
                        m=Integer.parseInt(userInput());
                        userOutput("Результат: "+Cycled.Calculate7(n, m));
                        break;
                    }
                    case 38: {
                        double a, b;
                        userOutput(Cycled.DESCRIPTIONS[(inp%10)-1]);
                        userOutput("Введите a");
                        a=Double.parseDouble(userInput());
                        userOutput("Введите b");
                        b=Double.parseDouble(userInput());
                        userOutput("Результат: "+Cycled.Calculate8(a, b));
                        break;
                    }
                    case 0: {
                        userOutput("Выбрано завершение программы");
                        return;
                    }
                    default: {
                        userOutput("Задачи с таким номером не существует. Пожалуйста, повторите ввод!");
                     }

                }
            }
            catch (Exception e) {
                System.out.println("Ошибка ввода!"+e.getMessage());
            }
        } while (inp!=0);
        /* double rez1 = Linear.Calculate1(1,2,3);
        System.out.println(rez1);
        try {
            double rez2 = Linear.Calculate2(0, 2, 3);
            System.out.println(rez2);
        }
        catch (Exception e) {
            System.out.println("Wrong input! "+e.getMessage());
        }
        //double rez4 = Linear.Calculate4(123.456);
        //System.out.println(rez4);
        //System.out.println("10000 sec = "+ Linear.Calculate5(10000));
        //System.out.println("Произведение квадратов: "+ Cycled.Calculate4());
        //Locale.setDefault(new Locale("ru", "RU"));
        String str = Cycled.Calculate6();
        //byte[] bt = str.getBytes("CP866");
        System.out.printf(new Locale("ru", "RU"),"%s\n",str);
        System.out.println(Cycled.Calculate6());*/
    }

    //Реализует вывод информации для пользователя
    private static void userOutput (String str){
        System.out.println(str);
    }

    //Реализует ввод пользователем информации
    private static String userInput (){
        Scanner consoleInput = new Scanner(System.in);
        return consoleInput.nextLine();
    }


}
