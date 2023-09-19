package user.jacobandrudy.projects.day3;
import java.util.ArrayList;
import java.util.HashSet;
public class RuckSackPart2 {
    public static void main(String args[]){
        int sol = 0;
        String input = Input.createInput();
        ArrayList<ArrayList<String>> compartments = makeGroupsOfThree(input);
        for (int i = 0; i < compartments.size(); i++) {
            Character duplicate = findDuplicate(compartments.get(i));
            sol += charToInt(duplicate);
        }
        System.out.println(sol);
    }

    public static Character findDuplicate(ArrayList<String> input) {
        HashSet<Character> chars = new HashSet<Character>();
        HashSet<Character> chars2 = new HashSet<Character>();
        String first = input.get(0);
        String second = input.get(1);
        String third = input.get(2);
        for (int i = 0; i < first.length(); i++) {
            chars.add(first.charAt(i));
        }
        for (int i = 0; i < second.length(); i++) {
            chars2.add(second.charAt(i));
        }
        for (int i = 0; i < third.length(); i++) {
            if (chars.contains(third.charAt(i)) && chars2.contains(third.charAt(i))) {
                return third.charAt(i);
            }
        }
        System.out.println("error because I coded this in English on browswer github probably");
        return null;
    }

    
    public static ArrayList<ArrayList<String>> makeGroupsOfThree(String input) {
        ArrayList<ArrayList<String>> sol = new ArrayList<ArrayList<String>>();
        int last = 0;
        int current = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\n' || i == input.length() - 1) {
                current++;
                if (current % 3 == 0) {
                    sol.add(new ArrayList<String>());
                    sol.get(current / 3 - 1).add(input.substring(last, i));
                }
                last = i + 1;
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
