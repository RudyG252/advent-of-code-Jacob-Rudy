package user.jacobandrudy.projects.day7;
import java.util.HashMap;
import java.util.ArrayList;
public class DeleteDirectory {

     public static void main (String[] args) {
        int needed = 30000000;
        int totalSpace = 70000000;
        int sol = 0;
        HashMap<String, Integer> directorySizes = new HashMap<String, Integer>();
        String input = Input.espinozaInput();
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
                            String fin = "";
                            for (int l = 0; l < directories.size(); l++) {
                                fin += directories.get(l);
                            }
                            fin += input.substring(last + 5, i);
                            directories.add(fin);
                        }
                    }
                }
                else if (input.charAt(last) != 'd') {
                    String size = "";
                    for (int j = last; input.charAt(j) != ' '; j++) {
                        size += input.charAt(j) + "";
                    }
                    
                    for (int j = 0; j < directories.size(); j++) {
                        int put = directorySizes.getOrDefault(directories.get(j), 0) + Integer.parseInt(size);
                        directorySizes.put(directories.get(j), put);
                    }

                }

                last = i + 1;
            }   

        }
        int usedSpace = directorySizes.get("/");
        int emptySpace = totalSpace - usedSpace;
        int needToDelete = needed - emptySpace;
        int smallest = 2147483647;
        for (int value : directorySizes.values()) {
            if (value >= needToDelete && value < smallest) {
                smallest = value;
            }
        }
        System.out.println(smallest);
    }



}
