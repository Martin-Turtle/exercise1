
public class ThreeDigitCodes {
    public static void main(String[] args) {
        // nested loop = consist of outer loop and inner loop i and j, or x and y counters
        // each time the outer loop is executed, the inner loops is executed again until it false
        int total = 0;
        // outer loop print the first digit
        for (int j = 1; j <= 4; j++) {
            for (int k = 1; k <= 4; k++) {
                System.out.println(1 + " " + j);
                { // Statements
                    if ((j != 1) && (k != 1) && (k != j)) {
                        System.out.println(1 + "" + j + "" + k);
                        total += 1;
                    }
                }
            }
        }
        System.out.println("There were " + total + " unique combinations.");
        // outer loop print the first digit
        for (int j = 1; j <= 4; j++) {
            for (int k = 1; k <= 4; k++) {
                System.out.println(2 + " " + j);
                { // Statements
                    if ((j != 2) && (k != 2) && (k != j)) {
                        System.out.println(2 + "" + j + "" + k);
                        total += 1;
                    }
                }
            }
        }
        System.out.println("There were " + total + " unique combinations.");
        // outer loop print the first digit
        for (int j = 1; j <= 4; j++) {
            for (int k = 1; k <= 4; k++) {
                System.out.println(3 + " " + j);
                { // Statements
                    if ((j != 3) && (k != 3) && (k != j)) {
                        System.out.println(3 + "" + j + "" + k);
                        total += 1;
                    }
                }
            }
        }
        System.out.println("There were " + total + " unique combinations.");
        // outer loop print the first digit
        for (int j = 1; j <= 4; j++) {
            for (int k = 1; k <= 4; k++) {
                System.out.println(4 + " " + j);
                { // Statements
                    if ((j != 4) && (k != 4) && (k != j)) {
                        System.out.println(4 + "" + j + "" + k);
                        total ++;
                    }
                }
            }
        }
        System.out.println("There were " + total + " unique combinations.");
    }
}
