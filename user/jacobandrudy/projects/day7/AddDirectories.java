package user.jacobandrudy.projects.day7;
import java.util.HashMap;
import java.util.ArrayList;
public class AddDirectories {

     public static void main (String[] args) {
        int sol = 0;
        HashMap<String, Integer> directorySizes = new HashMap<String, Integer>();
        String input = Input.input();
        ArrayList<String> directories = new ArrayList<String>();
        int last = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\n') {
                if (input.charAt(last) == '$') {
                    // checks for cd
                    if (input.charAt(last + 2) == 'c') {
                        if (input.substring(last + 5, last + 7).equals("..")) {
                            directories.remove(directories.size() - 1);
                        }
                        else {
                            directories.add(input.substring(last + 5, i));
                        }
                    }
                }
                else if (input.charAt(last) != 'd') {
                    String size = "";
                    for (int j = last; input.charAt(j) != ' '; j++) {
                        size += input.charAt(j) + "";
                    }
                    for (int l = 0; l < directories.size(); l++) {
                        System.out.print(directories.get(l) + "/");
                    
                    }
                    System.out.println();
                    
                    for (int j = 0; j < directories.size(); j++) {
                        int put = directorySizes.getOrDefault(directorySizes.get(directories.get(j)), 0) + Integer.parseInt(size);
                        directorySizes.put(directories.get(j), put);
                    }
                    System.out.println(directorySizes.get(directories.get(0)));

                }

                last = i + 1;
            }   

        }
        System.out.println(directories.size());
        for (int value : directorySizes.values()) {
            if (value <= 100000) {
                sol += value;
            }
        }
        System.out.println(sol);
    }



}
