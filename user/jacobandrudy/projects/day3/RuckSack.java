package user.jacobandrudy.projects.day3;
import java.util.ArrayList;
public class RuckSack {
    public static void main(String args[]){
        String input = Input.createInput();
        ArrayList<ArrayList<String>> compartments = seperateCompartments(input);
        
    }

    public static ArrayList<ArrayList<String>> seperateCompartments(String input) {
        ArrayList<ArrayList<String>> sol = new ArrayList<ArrayList<String>>();
        int last = 0;
        int current = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\n' || i == input.length() - 1) {
                // last should be the start of the compartment
                int half = (last + ((i - last + 1)/2));
                sol.add(new ArrayList<String>());
                if (current <= 9) {
                    // System.out.println(half);
                }
                // half + 1 because end of substring is exclusive
                sol.get(current).add(input.substring(last, half));
                sol.get(current).add(input.substring(half, i));
                last = i;
                current++;
            }
        }
        System.out.println(sol.get(0).get(0).length());
        System.out.println(sol.get(0).get(1).length());
        System.out.println();
        return sol;
    }
}
