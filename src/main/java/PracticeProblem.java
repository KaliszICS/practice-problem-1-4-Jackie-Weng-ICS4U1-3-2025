import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PracticeProblem {

    public static String getName(int line, String file) {
        try {
            File newFile = new File(file);
            Scanner scanner = new Scanner(newFile);
            int count = 1;
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (count == line) {
                    String[] words = nextLine.split(" ");
                    scanner.close();
                    if (words.length >= 2) {
                        return words[0] + " " + words[1];
                    }
                }
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            return "File Not Found";
        } catch (Exception e) {
            return "Error reading File";
        }
        return "";
    }

    public static int getNumber(int line, String file) {
        try {
            File newFile = new File(file);
            Scanner scanner = new Scanner(newFile);
            int count = 1;
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (count == line) {
                    String[] studentNumber = nextLine.split("\\s+");
                    scanner.close();
                    if (studentNumber.length >= 4) {
                        return Integer.parseInt(studentNumber[3]);
                    }
                }
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            return -1;
        } catch (Exception e) {
            return -1;
        }
        return -1;
    }

    public static int getAge(int line, String file) {
        try {
            File newFile = new File(file);
            Scanner scanner = new Scanner(newFile);
            int count = 1;
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (count == line) {
                    String[] ageParts = nextLine.split("\\s+");
                    scanner.close();
                    if (ageParts.length >= 3) {
                        return Integer.parseInt(ageParts[2]);
                    }
                }
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            return -1;
        } catch (Exception e) {
            return -1;
        }
        return -1;
    }

    public static void fileAppend(String output, String filename) {
        try (PrintWriter newWriter = new PrintWriter(new FileWriter(filename, true))) {
            newWriter.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        String filename = "students.txt";
        // Example usage:
        System.out.println(getName(2, filename));   // Expected output: Eric Lan (if file contents match)
        System.out.println(getAge(3, filename));      // Expected output: 17 (if file contents match)
        System.out.println(getNumber(1, filename));   // Expected output: 123456789 (if file contents match)
        
        fileAppend("New student record", filename);
    }
}