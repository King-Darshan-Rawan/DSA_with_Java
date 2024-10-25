import java.lang.*;
import java.util.ArrayList;
public class Maximum {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int min = Integer.MIN_VALUE;
        for(int i = 0 ; i< list.size() - 1; i++){
            min =  Math.max(list.get(i), list.get(i + 1));
        }
        System.out.println(min);
    }
}
