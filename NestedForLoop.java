public class NestedForLoop {

    public static void main(String[] args) {
        int a, b;

        // outer loop to handle number of rows
        // n in this case
        for (a = 1; a <= 5; a++) {

            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (b = 1; b <= 5-a+1; b++) {
                // printing stars
                System.out.print(b);
            }

            // ending line after each row to provide new line.
            System.out.println();
        }
    }
}
