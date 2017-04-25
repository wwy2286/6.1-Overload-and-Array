/**
 * Created by William Yu on 4/24/2017.
 */
public class CalculatorDriver {
    public static void main(String[]args){
        double [] num = new double [3];
        num[0] = 2;
        num[1] = 3;
        num[2] = 7;
        System.out.println(Calculator.getSum(num));
        System.out.println(Calculator.getProduct(num));
        System.out.println(Calculator.getAverage(num));
        System.out.println(Calculator.getFactorial(5));
    }
}
