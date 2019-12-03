import java.util.ArrayList;
import java.util.Arrays;

public class OPT extends ReplacementAlgorithm {

    public OPT(int pageFrameCount) {
        super(pageFrameCount);
    }

    @Override
    // insert a page
    public void insert(int pageNum) {
        if(!search(pageNum)){
            int store_highest_index = 0; int temp = 0; int index_to_remove = 0;
            if(this.pageFrameList.size() == this.pageFrameCount) {
                for(int i = 0; i < this.pageFrameList.size(); i++){
                    int sha = this.pageFrameList.get(i);
                    for(int x = pageFrameList.size(); x < Main.createReferenceString().length; x++){
                        if(Main.refString[x] == sha){
                           temp = x;
                           if(temp > store_highest_index){
                               index_to_remove = i;
                               store_highest_index = temp;
                           }
                        }
                        break;
                    }
                }
                //System.out.println("removing index "+ index_to_remove);
                this.pageFrameList.remove(index_to_remove);
            }
            this.pageFrameList.add(index_to_remove, pageNum);
            this.pageFaultCount++;
        }

        else {
            Integer num = pageNum;
            int index = this.pageFrameList.indexOf(num);
            this.pageFrameList.remove(num);
            this.pageFrameList.add(index, pageNum);
        }
    }

    @Override
    public String toString() {
        return "Optimal";
    }


}