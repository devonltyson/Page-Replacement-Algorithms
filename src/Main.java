public class Main {

    private static final int SIZE = 100;
    private static final int UPPER_BOUND = 50;
    private static int[] refString;

    public static void main(String[] args) {

        refString = createReferenceString(); // make reference String for page numbers
        int pageFrameCount = Integer.parseInt(args[0]); // get page frame count from command line arg

        // create replacement algorithms and insert reference strings
        ReplacementAlgorithm fifo = new FIFO(pageFrameCount);
        insertRefString(fifo);

        ReplacementAlgorithm lru = new LRU(pageFrameCount);
        insertRefString(lru);

        ReplacementAlgorithm opt = new OPT(pageFrameCount);
        insertRefString(opt);
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