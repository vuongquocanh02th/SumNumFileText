import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.err.print("File not found or content has error!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input file path: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        ReadFileExample reader = new ReadFileExample();
        reader.readFileText(path);
    }
}
