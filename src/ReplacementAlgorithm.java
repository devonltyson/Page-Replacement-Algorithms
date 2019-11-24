public abstract class ReplacementAlgorithm {

    protected int pageFrameCount;
    protected int pageFaultCount;

    public ReplacementAlgorithm(int pageFrameCount) {
        if (pageFrameCount < 0)
            throw new IllegalArgumentException();

        this.pageFrameCount = pageFrameCount;
        this.pageFaultCount = 0;
    }

    public int getPageFaultCount() {
        return this.pageFaultCount;
    }

    public abstract void insert(int pageNum);
}
