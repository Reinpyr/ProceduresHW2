public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 20; i = i + 1)
        {
            System.out.println("When n is " + i + " the sum up to n is " + sumUpTo(i));
        }
    }

    static int sumUpTo(int n) {
        return n * (n + 1) / 2;
    }
}