package program;

public class Loops {
    public static void main(String[] args) {
        int sumOfNumbers = 0;

        for(int i = 1; i<=6; ++i){
            System.out.println("Num is " + i + ", sum is " + (sumOfNumbers += i));
        }
        System.out.println("---------------------------------");
        System.out.println("Sum of numbers is " + sumOfNumbers);
    }
}
