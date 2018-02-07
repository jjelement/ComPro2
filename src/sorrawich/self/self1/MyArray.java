package sorrawich.self.self1;

public class MyArray {
    public static int[] findMinMax(int[] scores) {
        int min = scores[0];
        int max = scores[0];

        for(int score : scores) {
            if(score < 0 || score > 100)
                return null;

            min = score < min ? score : min;
            max = score > max ? score : max;
        }
        return new int[]{min, max};
    }
}
