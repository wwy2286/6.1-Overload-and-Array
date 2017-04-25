/**
 * Created by William Yu on 4/24/2017.
 */
public class Calculator {
    public static double getSum (double [] num)
    {
        double sum=0.0;
        for (int i =0; i<num.length;i++){
            sum+=num[i];
        }
        return sum;
    }
    public static int getSum (int [] num)
    {

            int sum=0;
            for (int i =0; i<num.length;i++){
                sum+=num[i];
            }
            return sum;

    }

    public static double getProduct(double [] num){
        double product=1;
        for (int i =0; i<num.length;i++){
            product*=num[i];
        }
        return product;
    }
    public static int getProduct (int [] num){
        int product=1;
        for (int i =0; i<num.length;i++){
            product*=num[i];
        }
        return product;
    }
    public static double getAverage(double [] num){
        double sum=0.0;
        for (int i =0; i<num.length;i++){
            sum+=num[i];
        }
        return (sum/num.length);
    }
    public static int getAverage(int [] num){
        int sum=0;
        for (int i =0; i<num.length;i++){
            sum+=num[i];
        }
        return (sum/num.length);
    }
    public static int getFactorial(int initialValue){
        int result = 1;
        while (initialValue>0){
            result*=initialValue;
            initialValue--;
        }
        return result;
    }
}
