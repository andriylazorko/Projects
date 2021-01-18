public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the 153 lesson");
        Theatre theatre = new Theatre("Olympian",26,129999);
//        theatre.getSeats();

        if (theatre.reserveSeat("w123999")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("H99993")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("A9993")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("B119993")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }
        if (theatre.reserveSeat("H9193")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        } if (theatre.reserveSeat("H9993")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }
    }
}
