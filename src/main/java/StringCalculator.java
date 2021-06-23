
public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int num = Integer.parseInt(number.trim());
                if (num < 0 ) {
                    throw new IllegalArgumentException("Negatives Not Allowed");
                }
                else if (num >= 1000) {
                    num = 0;
                }
                else {
                    returnValue += num;
                }
            }
        }
        return returnValue;
    }
}