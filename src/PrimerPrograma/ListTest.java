package PrimerPrograma;

import java.util.ArrayList;
import java.util.List;

class ListTest {
    public static void main(String[] args) {
        List<Integer> postingList = new ArrayList<>();
        
        int [] nums = {1,2,1,4,3,6,2};
        
        for (Integer num : nums) {
            postingList.add(num);
        }
        
        System.out.print(postingList);
    }
}