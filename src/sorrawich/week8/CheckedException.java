package sorrawich.week8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {
        try {
            int[] wordCount = textCounter("words.txt");
            System.out.println("Line count: " + wordCount[0]);
            System.out.println("Word count: " + wordCount[1]);
            System.out.println("Character count: " + wordCount[2]);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (WrongWordException e) {
            System.out.println(e);
        }
    }

    public static int[] textCounter(String fileName) throws FileNotFoundException, WrongWordException {
        Scanner sc = new Scanner(new File(fileName));
        int[] count = new int[3];
        while(sc.hasNextLine()) {
            String text = sc.nextLine();
            if(text.contains("your")) {
                throw new WrongWordException("Wrong word !");
            }
            count[0]++;
            count[1] += text.split(" ").length;
            count[2] += text.replace(" ", "").length();
        }
        return count;
    }
}
