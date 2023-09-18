package user.jacobandrudy.projects.day3;
import java.util.ArrayList;
public class RuckSack {
    public static void main(String args[]){
        String input = Input.createInput();
        
    }

    public static ArrayList<ArrayList<String>> seperateCompartments(String input) {
        ArrayList<ArrayList<String>> sol = new ArrayList<ArrayList<String>>();
        int last = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\n') {
                int half = (last + ((i - last)/2));
                sol.add(new ArrayList<String>());
                
            }
        }
        return sol;
    }
}
