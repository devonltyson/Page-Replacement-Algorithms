import java.util.LinkedList;

public abstract class ReplacementAlgorithm {

    protected int pageFaultCount;
    protected LinkedList<Integer> pageFrameList;

    public ReplacementAlgorithm() {
        this.pageFrameList = new LinkedList<>();
    }

    public int getPageFaultCount() {
        return this.pageFaultCount;
    }

    // Searches for page pageNumber in the page frame list
    public boolean search(int pageNum) {
        if(this.pageFrameList.contains(pageNum)) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void insert(int pageNum);
}
