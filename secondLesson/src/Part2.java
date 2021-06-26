public class Part2 {
    public static void main(String[] args) {
        int sum = 0;
        double numD;
        for (String s :
                args) {
            if (isNumeric(s)) {
                numD = Double.parseDouble(s);
                if (numD == (int) numD) {
                    sum += (int) numD;
                }
            }
        }
        System.out.print(sum);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}



