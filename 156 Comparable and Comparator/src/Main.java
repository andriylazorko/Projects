import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to the 153 lesson");
        Theatre theatre = new Theatre("Olympian", 6, 13);

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        }else{
            System.out.println("Seat is already reserved");
        }

        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        }else{
            System.out.println("Seat is already reserved");
        }


        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        }else{
            System.out.println("Seat is already reserved");
        }

        List<Theatre.Seat> reversSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reversSeats);
        printList(reversSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13));
        priceSeats.add(theatre.new Seat("A00",13));
        Collections.sort(priceSeats,Theatre.PRICE_ORDER);
        printList(priceSeats);

    }



//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list,i,j);
//                }
//            }
//        }
//    }

    public static void printList(List<Theatre.Seat>list){
        for(Theatre.Seat seat : list){
            System.out.print(" "+seat.getSeatNumber()+":"+seat.getPrice());
        }
        System.out.println();
        System.out.println("=============================================================");
    }
}
