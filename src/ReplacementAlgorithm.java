public abstract class ReplacementAlgorithm {

    protected int pageFaultCount;
    protected int elementCount;
    protected int[] pageFrameList;

    public ReplacementAlgorithm(int pageFrameCount) {
        this.pageFrameList = new int[pageFrameCount];
        this.pageFaultCount = 0;
        this.elementCount = 0;
    }

    public int getPageFaultCount() {
        return this.pageFaultCount;
    }

    public abstract void insert(int pageNum);
    public abstract boolean search(int pageNum);
}
