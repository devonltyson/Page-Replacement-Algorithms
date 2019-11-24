public class FIFO extends ReplacementAlgorithm {

    public FIFO(int pageFrameCount) {
        super(pageFrameCount);
    }

    @Override
    // inset a page
    public void insert(int pageNum) {

    }

    @Override
    // Searches for page pageNumber in the page frame list
    public boolean search(int pageNum) {

        return false;
    }

    @Override
    public String toString() {
        return "First In First Out";
    }
}
