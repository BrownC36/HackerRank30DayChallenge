//Write your code here
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int divisor = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                divisor += i;
            }
        }
        return divisor;
    }
}
