public class LRU extends ReplacementAlgorithm {

    public LRU(int pageFrameCount) {
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
        return "Least Recently Used";
    }
}
