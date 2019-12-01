public class FIFO extends ReplacementAlgorithm {

    public int pageFrameCount;

    public FIFO(int pageFrameCount) {
        super();
        this.pageFrameCount = pageFrameCount;
    }

    @Override
    // inset a page
    public void insert(int pageNum) {
        if(!search(pageNum)) {
            if(this.pageFrameList.size() == this.pageFrameCount) {
                this.pageFrameList.removeFirst();
            }
            this.pageFrameList.addLast(pageNum);
            pageFaultCount++;
        }
    }

    @Override
    public String toString() {
        return "First In First Out";
    }
}
