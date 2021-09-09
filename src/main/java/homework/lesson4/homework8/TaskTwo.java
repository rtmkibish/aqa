package homework.lesson4.homework8;

public class TaskTwo {
    public static void main(String[] args) {
        getTribonachiSequence(20);
    }

    private static void getTribonachiSequence(int sequenceLength) {
        int[] result = new int[sequenceLength];

        for (int i = 0; i < sequenceLength; i++) {
            if (i == 0) {
                result[i] = 0;
            } else if (i < 3) {
                result[i] = 1;
            } else {
                result[i] = result[i - 1] + result[i - 2] + result[i - 3];
            }
            System.out.print(result[i] + ", ");
        }
        System.out.println(result);
    }
}
