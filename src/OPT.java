public class OPT extends ReplacementAlgorithm {

    public OPT(int pageFrameCount) {
        super(pageFrameCount);
    }

    @Override
    // insert a page
    public void insert(int pageNum) {

    }

    @Override
    // Searches for page pageNumber in the page frame list
    public boolean search(int pageNum) {

        return false;
    }

    @Override
    public String toString() {
        return "Optimal";
    }
}
