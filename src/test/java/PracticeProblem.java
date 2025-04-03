import java.io.*;

public class PracticeProblem {
    public static String getName(int line, String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            for (int i = 1; i < line; i++) {
                if (reader.readLine() == null) return "";
            }
            String currentLine = reader.readLine();
            if (currentLine != null) {
                String[] data = currentLine.split(" ");
                return data.length >= 2 ? data[0] + " " + data[1] : "";
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
        return "";
    }

    public static int getAge(int line, String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            for (int i = 1; i < line; i++) {
                if (reader.readLine() == null) return -1;
            }
            String currentLine = reader.readLine();
            if (currentLine != null) {
                String[] data = currentLine.split(" ");
                return data.length >= 3 ? Integer.parseInt(data[2]) : -1;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
        return -1;
    }

    public static int getNumber(int line, String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            for (int i = 1; i < line; i++) {
                if (reader.readLine() == null) return -1;
            }
            String currentLine = reader.readLine();
            if (currentLine != null) {
                String[] data = currentLine.split(" ");
                return data.length >= 4 ? Integer.parseInt(data[3]) : -1;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
        return -1;
    }

    public static void fileAppend(String output, String filename) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename, true));
            writer.write(output);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error while writing to the file.");
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error closing the writer.");
            }
        }
    }
}
