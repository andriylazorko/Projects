public class Part3 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                if (i == args.length - 1) {
                    System.out.print(args[i]);
                } else {
                    System.out.print(args[i] + " ");
                }
            }
        }
    }
}
