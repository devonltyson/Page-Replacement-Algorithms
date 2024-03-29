import java.util.LinkedList;

public abstract class ReplacementAlgorithm {

    protected int pageFaultCount, pageFrameCount;
    protected LinkedList<Integer> pageFrameList;

    public ReplacementAlgorithm(int pageFrameCount) {
        this.pageFrameCount = pageFrameCount;
        this.pageFrameList = new LinkedList<>();
    }

    // get number of faults incurred
    public int getPageFaultCount() {
        return this.pageFaultCount;
    }

    // search for page in the page frame list
    public boolean search(int pageNum) {
        if(this.pageFrameList.contains(pageNum)) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void insert(int pageNum);
}
