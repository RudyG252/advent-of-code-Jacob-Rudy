package user.jacobandrudy.projects.day7;
import java.util.HashMap;
import java.util.ArrayList;
public class AddDirectories {

    public static void main (String[] args) {
        int sol = 0;
        HashMap<String, Integer> directorySizes = new HashMap<String, Integer>();
        String currentDirectory = "";
        String input = Input.input();
        ArrayList<String> directories = new ArrayList<String>();
        int last = 0;
        boolean lookForFile = false;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\n') {
                if (input.charAt(last) == '$') {
                    // checks for cd
                    lookForFile = false;
                    if (input.charAt(last + 2) == 'c') {
                        if (input.substring(last + 5, last + 7) == "..") {
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
                    for (int j = 0; j < directories.size(); j++) {
                        directorySizes.put(directories.get(j), directorySizes.getOrDefault(directorySizes.get(j), 0) + Integer.parseInt(size));
                    }

                }

                last = i + 1;
            }   
        }
        directorySizes.forEach(
            (key, value)
                -> sol += value <= 100000 ? value : 0);


    }



}
