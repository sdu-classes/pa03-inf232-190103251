import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String filename = in.next();
        readFile(filename);
    }

    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner in = new Scanner(file);
        int lineCounter=0;
        String lines[] = new String[1000];
        String s = "";
        while(in.hasNextLine()){
            s=in.nextLine();
            lines[lineCounter] = s;
            lineCounter++;
        }
        for (int i = 0; i < lineCounter; i++) {
            System.out.println(lines[i]);
        }
        System.out.println(lineCounter+ " lines");
    }
}