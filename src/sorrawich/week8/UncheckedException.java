package sorrawich.week8;

public class UncheckedException {
    public static void main(String[] args) {
        try {
            double avg = avg(new int[]{1, 2, 3});
            System.out.println("average: " + avg);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
        }
        System.out.println();
    }

    public static double avg(int[] nums) throws ArrayIndexOutOfBoundsException  {
        double sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum/nums.length;

    }
}
