public class Exam {
    public int findMax(int[] numbers){
        
        if (numbers.length == 0) {
            return Integer.MIN_VALUE; // or you could throw an exception
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}