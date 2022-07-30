public class SumOfDigits {
    public static void main(String[] args) {
/*        int n= 12113;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem;

            n = n/10;

    }
        System.out.println(sum);*/


        // recusive approach

        int n = -16;

        // if negative number entered.
        if (n < 0)
            n = n * (-1);
        System.out.println(digitsSum(n));

    }

    private static int digitsSum(int n) {

        if (n <= 0)
            return 0;
        return digitsSum(n / 10) + (n % 10);
    }

}
