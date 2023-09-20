package user.jacobandrudy.projects.day3;
import java.util.ArrayList;
import java.util.HashSet;
public class RuckSack {
    public static void main(String args[]){
        int sol = 0;
        String input = Input.createInput();
        ArrayList<ArrayList<String>> compartments = seperateCompartments(input);
        for (int i = 0; i < compartments.size(); i++) {
            Character duplicate = findDuplicate(compartments.get(i));
            sol += charToInt(duplicate);
        }
        System.out.println(sol);
    }

    public static Character findDuplicate(ArrayList<String> input) {
        HashSet<Character> chars = new HashSet<Character>();
        String firstHalf = input.get(0);
        String secondHalf = input.get(1);
        for (int i = 0; i < firstHalf.length(); i++) {
            chars.add(firstHalf.charAt(i));
        }
        for (int i = 0; i < secondHalf.length(); i++) {
            if (chars.contains(secondHalf.charAt(i))) {
                return secondHalf.charAt(i);
            }
        }
        System.out.println("error because I coded this in English on browswer github probably");
        return null;
    }

    
    public static ArrayList<ArrayList<String>> seperateCompartments(String input) {
        ArrayList<ArrayList<String>> sol = new ArrayList<ArrayList<String>>();
        int last = 0;
        int current = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\n') {
                // last should be the start of the compartment
                int half = (last + ((i - last + 1)/2));
                sol.add(new ArrayList<String>());
                sol.get(current).add(input.substring(last, half));
                sol.get(current).add(input.substring(half, i));
                last = i;
                current++;
            }
        }
        return sol;
    }

    public static int charToInt(Character duplicate) {
        int duplicateNumber = duplicate;
        duplicateNumber = duplicateNumber < 97 ? duplicateNumber - 64 + 26 : duplicateNumber - 96;
        return duplicateNumber;
    }
}
