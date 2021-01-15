public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the 153 lesson");
        Theatre theatre = new Theatre("Olympian",3,10);
        theatre.getSeats();

        if (theatre.reserveSeat("B01")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("B01")){
            System.out.println("Please pay");
        }else{
            System.out.println("Sorry, seat is taken");
        }
    }
}
