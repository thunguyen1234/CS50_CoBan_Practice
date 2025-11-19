package Java.JavaFoundation.challenge8Exception;

public class challenge8Exception {
    public void arrayException() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        try {
            int result = numbers[10];
            System.out.println("Number at index 10 is: " + result);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
