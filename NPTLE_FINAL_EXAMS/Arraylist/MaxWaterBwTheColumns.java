
import java.util.ArrayList;

public class MaxWaterBwTheColumns {
    public static void main(String [] args){
        int max = 0;
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        for(int i = 0; i< list.size(); i++){
            for(int j = i + 1; j< list.size(); j++){
                int width = j - i;
                int elev = list.get(i) - list.get(j);
                if(elev > 0){
                    int height = Math.max(i,j) - elev;
                    int volume = height * width;
                    max = Math.max(max, volume); 
                }
                else{
                    continue;
                }
            }
        }
        System.out.println(max);
    }
}