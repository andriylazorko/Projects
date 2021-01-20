import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the 153 lesson");
        Theatre theatre = new Theatre("Olympian", 26, 10);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
//        if (theatre.reserveSeat("A02")) {
//            System.out.println("Please pay for " + theatre.seats.get(1).getSeatNumber());
//        }else{
//            System.out.println("Seat is already reserved");
//        }

        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("printing theatre.seats");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min set number is " + minSeat.getSeatNumber());
        System.out.println("Max set number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy ");
        printList(seatCopy);


        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
        Collections.copy(newList,theatre.seats);


        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for " + theatre.seats.get(1).getSeatNumber());
        } else {
            System.out.println("Seat is already reserved");
        }


    }

    public static void printList(List<Theatre.Seat> list) {
        long enums = 0;
        for (Theatre.Seat seat : list) {
            enums++;
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println("enum seat = " + enums);
        System.out.println("========================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
}
