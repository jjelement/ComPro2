package sorrawich.week9;

import java.util.ArrayList;

public class ManyData {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            intList.add((int)(Math.random()*10));
        }

        System.out.println("Total item: " + intList.size());

        intList.forEach((item) -> {
            System.out.print(item);
        });
    }
}
