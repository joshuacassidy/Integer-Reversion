public class ReverseInt {

    public int reverse(int input) {
        return reverseHelper(input, 0);
    }

    private int reverseHelper(int input, int output) {
        if (input == 0) {
            return output;
        } else {
            return reverseHelper(input/10, (output*10) + input%10);
        }
    }

}
