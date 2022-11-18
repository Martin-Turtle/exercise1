public class NestedLoop {
    public static void main(String[] args) {
        // nested loop = consist of outer loop and inner loop i and j, or x and y counters
        // each time the outer loop is executed, the inner loops is executed again until it false
        for (int i=0; i<3; i++) { // outer loop print the first digit
            for (int j=0; j<2; j++){ // inner loop print the second digit
                System.out.println(i + " " + j);
            }
        }
    }
}




