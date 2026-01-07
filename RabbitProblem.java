 package dsa.problems;

public class RabbitProblem {

    // Calculate rabbit pairs using Fibonacci
    public static int rabbits(int months) {
        if (months <= 1)
            return months;

        return rabbits(months - 1) + rabbits(months - 2);
    }

    
    public static void main(String[] args) {

        int months = 6;
        int result = rabbits(months);

        System.out.println("Number of rabbit pairs after " + months + " months: " + result);
    }
}
 {
    
}
