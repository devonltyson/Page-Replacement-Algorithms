public class FIFO extends ReplacementAlgorithm {

    int[] pageFrameList;
    int elementCount;

    public FIFO(int pageFrameCount) {
        super(pageFrameCount);
        this.pageFrameList = new int[pageFrameCount];
        this.elementCount = 0;
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
}
