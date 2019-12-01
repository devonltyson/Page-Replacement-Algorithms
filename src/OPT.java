public class OPT extends ReplacementAlgorithm {

    public int pageFrameCount;

    public OPT(int pageFrameCount) {
        super();
        this.pageFrameCount = pageFrameCount;
    }

    @Override
    // insert a page
    public void insert(int pageNum) {

    }

    @Override
    public String toString() {
        return "Optimal";
    }
}
