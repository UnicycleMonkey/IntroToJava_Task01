public class Linear {
    public static double Calculate1 (double a, double b, double c){
        return (a-3)*b/2+c;
    }

    public static double Calculate2 (double a, double b, double c)
    {
        if (a==0) {
            throw new RuntimeException("Division by 0");
        }
        double sum=b*b-4*a*c;   //under root
        if (sum<0){
            throw new RuntimeException("b^2-4ac < 0");
        }
        sum= Math.pow(sum, 0.5)+b;
        sum/=(2*a);
        sum-=Math.pow(a,3)*c;
        sum+=Math.pow(b,-2);
        return sum;
    }

    public static double Calculate3 (double x, double y){
        double den = Math.cos(x) - Math.sin(y);
        if ( den==0 || Math.cos(x*y)==0){
            throw new RuntimeException("Division by 0");
        }
        return (Math.sin(x)- Math.cos(y))*Math.tan(x*y)/den;
    }

    public static double Calculate4(double number) {
        final int SYMBOL_COUNT=3;
        int intNumber = (int)number;
        if (intNumber>=Math.pow(10, SYMBOL_COUNT+1))
        {
            throw  new RuntimeException("Number should be nnn.ddd");
        }
        double fracNumber = number-intNumber;
        return (int)(fracNumber*Math.pow(10, SYMBOL_COUNT))+ intNumber/Math.pow(10.,SYMBOL_COUNT);
    }
}
