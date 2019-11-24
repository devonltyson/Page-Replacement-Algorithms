public class Main {

    private static final int SIZE = 100;
    private static final int UPPER_BOUND = 50;

    public static void main(String[] args) {

        int[] refString = createReferenceString(); // make reference String for page numbers
        int pageFrameCount = Integer.parseInt(args[0]); // get page frame count from command line arg

        // create replacement algorithms
        ReplacementAlgorithm fifo = new FIFO(pageFrameCount);
        ReplacementAlgorithm lru = new LRU(pageFrameCount);
        ReplacementAlgorithm opt = new OPT(pageFrameCount);

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