public class Main {

    private static final int SIZE = 100;
    private static final int UPPER_BOUND = 50;
    private static int[] refString;

    public static void main(String[] args) {

        refString = createReferenceString(); // make reference String for page numbers

        System.out.println("Running algorithms... \n");
        for(int i=1; i <= 30; i++) {
            System.out.println("-- " + i + " PAGE FRAME(S) --");
            run(new FIFO(i));
            run(new LRU(i));
            run(new OPT(i));
            System.out.println();
        }
    }

    public static void run(ReplacementAlgorithm alg) {
        insertRefString(alg);
        showFaults(alg);
    }

    public static void showFaults(ReplacementAlgorithm alg) {
        System.out.println(alg.toString() + ": " + alg.getPageFaultCount());
    }

    // insert refString into algorithms
    public static void insertRefString(ReplacementAlgorithm alg) {
        for (int i = 0; i < SIZE; i++) {
            alg.insert(refString[i]);
        }
    }

    // create a reference String
    public static int[] createReferenceString() {

        java.util.Random generator = new java.util.Random();
        int[] referenceString = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            referenceString[i] = generator.nextInt(UPPER_BOUND);
        }
        return referenceString;
    }
}