public class Part5 {
    public static void main(String[] args) {
        int sumI = 0;
        double numD;
        for (String s : args) {
            if(isNumeric(s)){
                numD = Double.parseDouble(s);
                if ((numD == (int) numD) && (numD >= 0)) {
                    sumI += (int) numD;
                }
            }
        }
        System.out.print(sumI);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
