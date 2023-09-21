package user.jacobandrudy.projects.day4;

import java.util.ArrayList;

public class PartOne {
    public static void main(String args[]) {
        isInsideRange();
    }

    public static void isInsideRange(){
        ArrayList<Boolean> sol = parseInputRow();

        for (int i = 0; i < sol.size(); i++){
            System.out.println(sol.get(i));
        }

        int size = sol.size();

        System.out.println(size);
    }

    private static ArrayList<Boolean> parseInputRow() {
        String input = Input.INPUT;

        String[] splitString = input.split("\n");
        
        ArrayList<Boolean> isPair = new ArrayList<>();
        
        for (int newLine = 0; newLine < splitString.length; newLine++) {

            String newLineString = splitString[newLine];

            int a1 = -1;
            int a2 = -1;
            int b1 = -1;
            int b2 = -1;

            int beginRange = 0;

            for (int newChar = beginRange; newChar < newLineString.length(); newChar++) {
                String substring = newLineString.substring(newChar, newChar+1);

                if (newLineString.substring(newChar, newChar+1).equals("-") ||
                        newLineString.substring(newChar, newChar+1).equals(",") ||
                        newChar == newLineString.length() - 1) {
                    
                    if (a1 == -1) {
                        a1 = Integer.parseInt(splitString[newLine].substring(beginRange, newChar));
                    }else if (a2 == -1) {
                        a2 = Integer.parseInt(splitString[newLine].substring(beginRange, newChar));
                    }else if (b1 == -1) {
                        b1 = Integer.parseInt(splitString[newLine].substring(beginRange, newChar));
                    }else if (b2 == -1) {
                        b2 = Integer.parseInt(splitString[newLine].substring(beginRange, newChar+1));
                    }
                    
                    beginRange = newChar + 1;
                }
            }
            isPair = isOverlap(a1, a2, b1, b2, true);
        }
        return isPair;
    }

    private static ArrayList<Boolean> isOverlap(int a1, int a2, int b1, int b2, boolean isFullyContained) {
        ArrayList<Boolean> isPair = new ArrayList<>();

        if (isFullyContained) {
            if ((b1 <= a1 && a2 <= b2)
                || (a1 <= b1 && b2 <= a2)) {
                System.out.println(a1+"-"+a2+" and "+b1+"-"+b2+" are overlapping");
                isPair.add(true);
            }
        } 

        if ((b1 <= a1 && a2 <= b2)
                || (a1 <= b1 && b2 <= a2)) {
            isPair.add(true);
        }
        return false;
    }
}
