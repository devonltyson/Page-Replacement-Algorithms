import java.util.LinkedList;
import java.util.ListIterator;

public class OPT extends ReplacementAlgorithm {

    public OPT(int pageFrameCount) {
        super(pageFrameCount);
    }
    Main main = new Main();
    @Override
    // insert a page
    public void insert(int pageNum) {
        if(!search(pageNum)){
            if(this.pageFrameList.size() == this.pageFrameCount) {
                int store_highest_index = 0; int temp = 0; int index_to_remove = 0;
                for(int i = 0; i < this.pageFrameList.size(); i++){
                    int sha = this.pageFrameList.get(i);
                    temp = main.toRemove(sha);
                    if(temp > store_highest_index){
                        store_highest_index = temp;
                        index_to_remove = i;
                    }
                }
                this.pageFrameList.remove(index_to_remove);
            }
            this.pageFrameList.addLast(pageNum);
            this.pageFaultCount++;
        }

        else {
            Integer num = pageNum;
            this.pageFrameList.remove(num);
            this.pageFrameList.addLast(pageNum);
        }


    }

    @Override
    public String toString() {
        return "Optimal";
    }


}
