public class LRU extends ReplacementAlgorithm {

    public int pageFrameCount;

    public LRU(int pageFrameCount) {
        super();
        this.pageFrameCount = pageFrameCount;
    }

    @Override
    // insert a page
    public void insert(int pageNum) {
        if(!search(pageNum)) {
            if(this.pageFrameList.size() == this.pageFrameCount) {
                this.pageFrameList.removeFirst();
            }
            this.pageFrameList.addLast(pageNum);
            pageFaultCount++;
        } else {
            // change positions in the list since this page was recently used
            Integer num = pageNum;
            this.pageFrameList.remove(num);
            this.pageFrameList.addLast(pageNum);
        }
    }

    @Override
    public String toString() {
        return "Least Recently Used";
    }
}
