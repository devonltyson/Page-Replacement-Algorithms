public class OPT extends ReplacementAlgorithm {

    int[] pageFrameList;
    int elementCount;

    public OPT(int pageFrameCount) {
        super(pageFrameCount);
        this.pageFrameList = new int[pageFrameCount];
        this.elementCount = 0;
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
}
