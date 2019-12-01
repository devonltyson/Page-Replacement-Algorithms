public class FIFO extends ReplacementAlgorithm {

    public FIFO(int pageFrameCount) {
        super(pageFrameCount);
    }

    @Override
    // inset a page
    public void insert(int pageNum) {
        if(!search(pageNum)) {
            if(this.pageFrameList.size() == this.pageFrameCount) {
                this.pageFrameList.removeFirst();
            }
            this.pageFrameList.addLast(pageNum);
            this.pageFaultCount++;
        }
    }

    @Override
    public String toString() {
        return "First In First Out";
    }
}
