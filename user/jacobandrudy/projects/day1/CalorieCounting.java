package user.jacobandrudy.projects.day1;

import java.util.ArrayList;

public class CalorieCounting {

    public static void main(String args[]) {
        System.out.println(getLargestCalories(createInput(Input.INPUT)));
        System.out.println(getTopThreeTotal(createInput(Input.INPUT)));
    }

    public static int getLargestCalories(ArrayList<Integer> input) {
        int sol = 0;
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) > sol) {
                sol = input.get(i);
            }
        }
        return sol;
    }

    public static int getTopThreeTotal(ArrayList<Integer> input) {
        int first = 0;
        int second = 0;
        int third = 0;
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) > first) {
                third = second;
                second = first;
                first = input.get(i);
            } else if (input.get(i) > second) {
                third = second;
                second = input.get(i);
            } else if (input.get(i) > third) {
                third = input.get(i);
            }
        }
        return first + second + third;
    }

    public static ArrayList<Integer> createInput(String input) {
        ArrayList<Integer> sol = new ArrayList<>();
        int firstCal = 0;

        int calPerPerson = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\n' && input.charAt(i+1) == '\n') {
                calPerPerson += Integer.parseInt(input.substring(firstCal, i));

                sol.add(calPerPerson);
                calPerPerson = 0;
                i += 2;
                firstCal = i;

            } else if (input.substring(i, i + 1).equals("\n")) {

                calPerPerson += Integer.parseInt(input.substring(firstCal, i));
                firstCal = i + 1;
            }
        }
        return sol;
    }
}
