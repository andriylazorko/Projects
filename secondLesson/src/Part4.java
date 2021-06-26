public class Part4 {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        double numD;
        if ((isNumeric(args[0])) && (isNumeric(args[1]))) {

            numD = Double.parseDouble(args[0]);
            if ((numD == (int) numD) && (numD >= 0)) {
                number1 = (int) numD;

                numD = Double.parseDouble(args[1]);
                if ((numD == (int) numD) && (numD >= 0)) {
                    number2 = (int) numD;

                    if (number1 < number2) {
                        int number = number1;
                        number1 = number2;
                        number2 = number;
                    }
                    int res;
                    do {
                        res = number1 % number2;
                        number1 = number2;
                        number2 = res;
                    } while (res != 0);
                    System.out.print(number1);

                }
            }
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
