import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class PatternFileLister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file pattern (e.g., '*.java', '*Test*'): ");
        String pattern = sc.nextLine();

        File currentDir = new File("."); // Current working directory

        File[] matchingFiles = currentDir.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {

                // Convert * to regex .*
                return name.matches(pattern.replace("*", ".*"));
            }
        });

        if (matchingFiles != null && matchingFiles.length > 0) {

            System.out.println("\nFiles matching pattern '" + pattern + "':");

            for (File file : matchingFiles) {

                System.out.println(
                        file.getName() +
                                (file.isDirectory()
                                        ? " [DIR]"
                                        : " (" + file.length() + " bytes)"));
            }

        } else {

            System.out.println(
                    "No files match the pattern '" + pattern + "'");
        }

        sc.close();
    }
}