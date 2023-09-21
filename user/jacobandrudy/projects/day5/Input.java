package user.jacobandrudy.projects.day5;
import java.util.ArrayList;
import java.util.Stack;

public class Input {
    
    public static ArrayList<Stack<Character>> stacks(){
        String input = stackInput();
        int currentStack = 8;
        ArrayList<Stack<Character>> stacks = new ArrayList<Stack<Character>>();
        for (int i = 0; i < 9; i++) {
            stacks.add(new Stack<Character>());
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ']') {
                stacks.get(currentStack).push(input.charAt(i - 1));
                currentStack--;
                if (currentStack < 0) {
                    currentStack = 8;
                }
            }
            else if (input.charAt(i) == 'N') {
                currentStack--;
            }  
        }
        System.out.println(stacks.get(0).pop());
        return stacks;
    }







    public static String stackInput() {
        String input = "[G]  N   N   N   N  [D] [R]  N   N \n" + //
                       "[W]  N   N  [V]  N  [C] [T] [M]  N \n" + //
                       "[L]  N   N  [P] [Z] [Q] [F] [V]  N \n" + //
                       "[J]  N   N  [S] [D] [J] [M] [T] [V]\n" + //
                       "[B]  N  [M] [H] [L] [Z] [J] [B] [S]\n" + //
                       "[R] [C] [T] [C] [T] [R] [D] [R] [D]\n" + //
                       "[T] [W] [Z] [T] [P] [B] [B] [H] [P]\n" + //
                       "[D] [S] [R] [D] [G] [F] [S] [L] [Q]\n" + //
                       " 1   2   3   4   5   6   7   8   9 ";
        return input;

    }
    public static String input() {
        String input = "1,35\n" + //
                "5,54\n" + //
                "6,73\n" + //
                "6,13\n" + //
                "1,19\n" + //
                "1,14\n" + //
                "3,69\n" + //
                "2,75\n" + //
                "1,57\n" + //
                "1,72\n" + //
                "2,25\n" + //
                "2,63\n" + //
                "6,89\n" + //
                "7,39\n" + //
                "1,87\n" + //
                "8,97\n" + //
                "5,48\n" + //
                "1,62\n" + //
                "2,84\n" + //
                "9,91\n" + //
                "2,85\n" + //
                "1,85\n" + //
                "5,92\n" + //
                "1,68\n" + //
                "5,17\n" + //
                "1,82\n" + //
                "2,17\n" + //
                "1,26\n" + //
                "4,54\n" + //
                "2,14\n" + //
                "13,78\n" + //
                "3,86\n" + //
                "2,68\n" + //
                "10,35\n" + //
                "2,76\n" + //
                "3,56\n" + //
                "10,81\n" + //
                "1,86\n" + //
                "6,24\n" + //
                "1,58\n" + //
                "5,63\n" + //
                "2,86\n" + //
                "1,79\n" + //
                "2,27\n" + //
                "3,51\n" + //
                "2,72\n" + //
                "6,63\n" + //
                "7,56\n" + //
                "5,32\n" + //
                "10,18\n" + //
                "2,13\n" + //
                "8,37\n" + //
                "9,48\n" + //
                "1,92\n" + //
                "2,78\n" + //
                "4,69\n" + //
                "1,49\n" + //
                "5,74\n" + //
                "3,65\n" + //
                "1,15\n" + //
                "14,48\n" + //
                "3,97\n" + //
                "4,59\n" + //
                "2,41\n" + //
                "27,86\n" + //
                "2,72\n" + //
                "2,74\n" + //
                "4,29\n" + //
                "7,84\n" + //
                "10,41\n" + //
                "18,65\n" + //
                "6,92\n" + //
                "1,95\n" + //
                "11,26\n" + //
                "2,54\n" + //
                "1,28\n" + //
                "2,49\n" + //
                "2,83\n" + //
                "1,68\n" + //
                "4,97\n" + //
                "4,78\n" + //
                "7,51\n" + //
                "4,63\n" + //
                "2,37\n" + //
                "6,53\n" + //
                "2,82\n" + //
                "14,62\n" + //
                "3,81\n" + //
                "15,23\n" + //
                "1,61\n" + //
                "14,32\n" + //
                "2,25\n" + //
                "1,93\n" + //
                "13,13\n" + //
                "4,26\n" + //
                "10,13\n" + //
                "2,69\n" + //
                "6,29\n" + //
                "6,52\n" + //
                "2,68\n" + //
                "7,95\n" + //
                "1,58\n" + //
                "2,76\n" + //
                "34,36\n" + //
                "19,62\n" + //
                "12,69\n" + //
                "3,63\n" + //
                "2,32\n" + //
                "1,65\n" + //
                "17,28\n" + //
                "2,32\n" + //
                "8,94\n" + //
                "7,52\n" + //
                "5,41\n" + //
                "4,16\n" + //
                "1,16\n" + //
                "6,68\n" + //
                "2,84\n" + //
                "17,86\n" + //
                "2,45\n" + //
                "17,69\n" + //
                "22,97\n" + //
                "1,52\n" + //
                "20,27\n" + //
                "29,79\n" + //
                "1,47\n" + //
                "3,83\n" + //
                "1,85\n" + //
                "3,82\n" + //
                "2,24\n" + //
                "27,97\n" + //
                "2,32\n" + //
                "1,52\n" + //
                "18,75\n" + //
                "1,32\n" + //
                "1,56\n" + //
                "18,53\n" + //
                "1,63\n" + //
                "2,95\n" + //
                "10,35\n" + //
                "4,36\n" + //
                "1,71\n" + //
                "1,51\n" + //
                "6,76\n" + //
                "1,62\n" + //
                "4,48\n" + //
                "5,54\n" + //
                "1,38\n" + //
                "2,18\n" + //
                "2,25\n" + //
                "3,38\n" + //
                "6,82\n" + //
                "1,39\n" + //
                "1,63\n" + //
                "6,28\n" + //
                "7,84\n" + //
                "8,52\n" + //
                "5,46\n" + //
                "2,83\n" + //
                "2,39\n" + //
                "1,39\n" + //
                "2,71\n" + //
                "2,12\n" + //
                "12,24\n" + //
                "1,97\n" + //
                "1,62\n" + //
                "9,79\n" + //
                "1,82\n" + //
                "9,98\n" + //
                "6,78\n" + //
                "4,41\n" + //
                "6,25\n" + //
                "1,49\n" + //
                "3,19\n" + //
                "6,45\n" + //
                "5,89\n" + //
                "8,46\n" + //
                "3,98\n" + //
                "1,93\n" + //
                "3,83\n" + //
                "5,92\n" + //
                "3,26\n" + //
                "3,69\n" + //
                "3,62\n" + //
                "4,26\n" + //
                "6,97\n" + //
                "1,18\n" + //
                "8,85\n" + //
                "20,53\n" + //
                "2,28\n" + //
                "6,71\n" + //
                "10,63\n" + //
                "4,67\n" + //
                "4,19\n" + //
                "2,12\n" + //
                "3,69\n" + //
                "5,83\n" + //
                "3,79\n" + //
                "17,32\n" + //
                "1,62\n" + //
                "2,69\n" + //
                "1,64\n" + //
                "12,92\n" + //
                "1,47\n" + //
                "8,38\n" + //
                "8,89\n" + //
                "7,92\n" + //
                "1,97\n" + //
                "18,29\n" + //
                "1,72\n" + //
                "2,71\n" + //
                "1,12\n" + //
                "4,27\n" + //
                "15,93\n" + //
                "1,91\n" + //
                "2,18\n" + //
                "6,24\n" + //
                "8,21\n" + //
                "2,85\n" + //
                "2,93\n" + //
                "4,41\n" + //
                "2,58\n" + //
                "2,89\n" + //
                "14,31\n" + //
                "2,97\n" + //
                "2,43\n" + //
                "1,29\n" + //
                "5,79\n" + //
                "21,19\n" + //
                "2,16\n" + //
                "3,24\n" + //
                "1,73\n" + //
                "19,95\n" + //
                "1,27\n" + //
                "1,72\n" + //
                "3,42\n" + //
                "19,57\n" + //
                "2,25\n" + //
                "1,53\n" + //
                "1,34\n" + //
                "8,94\n" + //
                "1,63\n" + //
                "1,26\n" + //
                "1,21\n" + //
                "8,73\n" + //
                "5,47\n" + //
                "2,64\n" + //
                "1,59\n" + //
                "1,16\n" + //
                "1,12\n" + //
                "2,47\n" + //
                "1,42\n" + //
                "2,49\n" + //
                "1,68\n" + //
                "1,15\n" + //
                "1,86\n" + //
                "1,14\n" + //
                "25,31\n" + //
                "1,42\n" + //
                "2,36\n" + //
                "3,19\n" + //
                "6,98\n" + //
                "1,63\n" + //
                "1,29\n" + //
                "15,76\n" + //
                "2,26\n" + //
                "1,38\n" + //
                "1,14\n" + //
                "6,84\n" + //
                "1,38\n" + //
                "1,85\n" + //
                "2,52\n" + //
                "8,67\n" + //
                "1,87\n" + //
                "1,94\n" + //
                "9,45\n" + //
                "19,13\n" + //
                "9,35\n" + //
                "6,72\n" + //
                "2,17\n" + //
                "7,24\n" + //
                "7,56\n" + //
                "5,43\n" + //
                "3,58\n" + //
                "1,24\n" + //
                "2,48\n" + //
                "14,61\n" + //
                "6,56\n" + //
                "1,52\n" + //
                "7,16\n" + //
                "1,24\n" + //
                "4,64\n" + //
                "1,54\n" + //
                "2,19\n" + //
                "2,94\n" + //
                "2,18\n" + //
                "9,36\n" + //
                "3,74\n" + //
                "4,86\n" + //
                "3,76\n" + //
                "1,72\n" + //
                "1,75\n" + //
                "3,84\n" + //
                "26,61\n" + //
                "8,12\n" + //
                "1,64\n" + //
                "5,27\n" + //
                "2,24\n" + //
                "10,47\n" + //
                "1,61\n" + //
                "22,12\n" + //
                "1,61\n" + //
                "6,47\n" + //
                "1,51\n" + //
                "1,12\n" + //
                "21,72\n" + //
                "38,23\n" + //
                "8,26\n" + //
                "2,48\n" + //
                "2,82\n" + //
                "1,13\n" + //
                "1,28\n" + //
                "1,25\n" + //
                "6,64\n" + //
                "2,42\n" + //
                "2,26\n" + //
                "1,82\n" + //
                "28,31\n" + //
                "11,12\n" + //
                "8,17\n" + //
                "4,64\n" + //
                "8,31\n" + //
                "8,25\n" + //
                "6,54\n" + //
                "2,54\n" + //
                "8,34\n" + //
                "22,41\n" + //
                "2,35\n" + //
                "33,15\n" + //
                "26,56\n" + //
                "4,57\n" + //
                "2,27\n" + //
                "2,72\n" + //
                "2,78\n" + //
                "2,83\n" + //
                "6,13\n" + //
                "5,51\n" + //
                "1,57\n" + //
                "7,75\n" + //
                "4,56\n" + //
                "5,18\n" + //
                "4,24\n" + //
                "2,74\n" + //
                "2,73\n" + //
                "5,46\n" + //
                "1,82\n" + //
                "1,24\n" + //
                "10,36\n" + //
                "44,69\n" + //
                "2,57\n" + //
                "1,58\n" + //
                "41,91\n" + //
                "1,64\n" + //
                "2,81\n" + //
                "1,73\n" + //
                "1,38\n" + //
                "2,98\n" + //
                "29,19\n" + //
                "2,15\n" + //
                "2,83\n" + //
                "1,35\n" + //
                "2,59\n" + //
                "1,57\n" + //
                "25,92\n" + //
                "10,21\n" + //
                "1,78\n" + //
                "2,41\n" + //
                "2,89\n" + //
                "1,86\n" + //
                "4,24\n" + //
                "4,25\n" + //
                "1,65\n" + //
                "1,27\n" + //
                "2,41\n" + //
                "18,13\n" + //
                "8,94\n" + //
                "15,39\n" + //
                "3,48\n" + //
                "4,58\n" + //
                "4,24\n" + //
                "10,94\n" + //
                "4,85\n" + //
                "2,72\n" + //
                "11,49\n" + //
                "12,49\n" + //
                "2,57\n" + //
                "4,24\n" + //
                "5,81\n" + //
                "1,56\n" + //
                "1,46\n" + //
                "1,39\n" + //
                "1,57\n" + //
                "4,16\n" + //
                "6,15\n" + //
                "6,59\n" + //
                "3,76\n" + //
                "9,65\n" + //
                "8,52\n" + //
                "7,23\n" + //
                "1,31\n" + //
                "7,35\n" + //
                "2,41\n" + //
                "1,26\n" + //
                "2,13\n" + //
                "8,59\n" + //
                "3,13\n" + //
                "1,61\n" + //
                "2,41\n" + //
                "1,52\n" + //
                "2,16\n" + //
                "2,63\n" + //
                "2,32\n" + //
                "2,24\n" + //
                "1,26\n" + //
                "3,39\n" + //
                "2,48\n" + //
                "3,31\n" + //
                "4,17\n" + //
                "2,84\n" + //
                "7,96\n" + //
                "1,14\n" + //
                "11,97\n" + //
                "3,93\n" + //
                "14,95\n" + //
                "6,65\n" + //
                "4,59\n" + //
                "10,76\n" + //
                "1,37\n" + //
                "2,41\n" + //
                "4,79\n" + //
                "9,61\n" + //
                "3,65\n" + //
                "15,91\n" + //
                "1,47\n" + //
                "4,97\n" + //
                "12,51\n" + //
                "3,73\n" + //
                "4,72\n" + //
                "1,93\n" + //
                "22,12\n" + //
                "21,26\n" + //
                "3,19\n" + //
                "1,37\n" + //
                "1,73\n" + //
                "1,32\n" + //
                "8,14\n" + //
                "1,92\n" + //
                "7,48\n" + //
                "3,39\n" + //
                "3,35\n" + //
                "4,23\n" + //
                "1,13\n" + //
                "4,85\n" + //
                "2,83\n" + //
                "5,32\n" + //
                "6,53\n" + //
                "2,58\n" + //
                "2,17\n" + //
                "2,74\n" + //
                "15,69\n" + //
                "8,31\n" + //
                "3,59\n" + //
                "2,49\n" + //
                "8,13\n" + //
                "8,98\n" + //
                "1,14\n" + //
                "3,59\n" + //
                "4,81\n" + //
                "1,39\n" + //
                "2,43\n" + //
                "2,86\n" + //
                "3,87\n" + //
                "8,25\n" + //
                "3,52\n" + //
                "4,34\n" + //
                "3,61\n" + //
                "2,59\n" + //
                "4,41\n" + //
                "2,56\n" + //
                "1,54\n" + //
                "2,21\n" + //
                "4,39\n" + //
                "1,73\n" + //
                "2,74\n" + //
                "2,47\n" + //
                "1,67\n" + //
                "1,28\n" + //
                "2,39\n" + //
                "14,18\n" + //
                "1,62\n" + //
                "2,71\n" + //
                "3,83\n" + //
                "6,85\n";
        return input;
    }
}
