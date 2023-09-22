package user.jacobandrudy.projects.day5;
import java.util.ArrayList;
import java.util.Stack;
public class SupplyStackPart2 {
    public static void main(String args[]){
        ArrayList<Stack<Character>> stacks = Input.stacks();
        String input = Input.input();
        // try without -1 if doesn't work
        int last = 0;
        int amount = 0;
        int from = 0;
        int to = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == ',') {

                amount = Integer.parseInt(input.substring(last, i));
                from = Integer.parseInt(input.charAt(i + 1) + "");
                to = Integer.parseInt(input.charAt(i+2) + "");
                System.out.println("to: " + to + " from: " + from + " amount: " + amount);
                stacks = moveFrom(stacks, from - 1, to - 1, amount);
                last = i + 4;
            }

        }
        for (int i = 0; i < stacks.size(); i++) {
            System.out.print(stacks.get(i).peek());
        }

    }

    public static ArrayList<Stack<Character>> moveFrom(ArrayList<Stack<Character>> stacks, int from, int to, int amount) {
        Stack<Character> temp = new Stack<Character>();
        for (int i = 0; i < amount; i++) {
            if(stacks.get(from).size() > 0) {
                temp.push(stacks.get(from).pop());
            }
        }
        while (temp.size() > 0) {
            stacks.get(to).push(temp.pop());
        }
        return stacks;
    }

}
