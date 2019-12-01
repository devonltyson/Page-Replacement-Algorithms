public class LRU extends ReplacementAlgorithm {

    public int pageFrameCount;

    public LRU(int pageFrameCount) {
        super();
        this.pageFrameCount = pageFrameCount;
    }

    @Override
    // insert a page
    public void insert(int pageNum) {

    }

    @Override
    public String toString() {
        return "Least Recently Used";
    }
}
