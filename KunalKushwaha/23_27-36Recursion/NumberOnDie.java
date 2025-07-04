
import java.util.ArrayList;

public class NumberOnDie {
    public static void main(String[] args) {
        dice("",4);

        System.out.println(retDice("", 4));

        diceFace("", 4, 6);
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);   
        }
    }

    static void diceFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);   
        }
    }

    static ArrayList<String> retDice(String p, int target){
        if(target == 0){
            // System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(retDice(p + i, target - i));   
        }

        return list;
    }
}
