package user.jacobandrudy.projects.day3;
import java.util.ArrayList;
public class RuckSack {
    public static void main(String args[]){
        String input = Input.createInput();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '\n' && input.charAt(i) != '\r') {
                System.out.print(input.charAt(i));
            }
        }
    }

    public static ArrayList<ArrayList<String>> seperateCompartments(String input) {
        ArrayList<ArrayList<String>> sol = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\n') {
                return sol;
            }
        }
        return sol;
    }
}
