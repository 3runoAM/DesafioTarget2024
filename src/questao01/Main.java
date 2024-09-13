import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println(isFibonacci(0)); // Pertence a sequência fibonacci
        System.out.println(isFibonacci(1)); // Pertence a sequência fibonacci
        System.out.println(isFibonacci(2)); // Pertence a sequência fibonacci
        System.out.println(isFibonacci(3)); // Pertence a sequência fibonacci
        System.out.println(isFibonacci(4)); // Não pertence a sequência fibonacci
        System.out.println(isFibonacci(5)); // Pertence a sequência fibonacci
        System.out.println(isFibonacci(6)); // Não pertence a sequência fibonacci
    }

    public static String isFibonacci(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        if (n == firstNumber || n == secondNumber) {
            return "Pertence a sequência fibonacci";
        }
        for(int i = 0; i < n+1; i++) {
            int sum = firstNumber + secondNumber;
            secondNumber = firstNumber;
            firstNumber = sum;
            if(n == sum) {
                return "Pertence a sequência fibonacci";
            }
        }
        return "Não pertence a sequência fibonacci";
    }
}