import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit=new LinkedList<>();
        addInOder(placeToVisit,"Kyiv");
        addInOder(placeToVisit,"Lviv");
        addInOder(placeToVisit,"Kharkiv");
        addInOder(placeToVisit,"Poltava");
        addInOder(placeToVisit,"NewYork");
        addInOder(placeToVisit,"Hollywood");
        addInOder(placeToVisit,"Rome");
        addInOder(placeToVisit,"Tokyo");
        printList(placeToVisit);
        addInOder(placeToVisit, "Amsterdam New");
        addInOder(placeToVisit,"Lviv");
        printList(placeToVisit);

    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("+++++++++++++++++");
    }
    private static boolean addInOder(LinkedList<String>linkedList,
                                     String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison==0){
                System.out.println(newCity+" is already included as a" +
                        " destination");
                return false;
            } else if(comparison>0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison<0){}

        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner =new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
        }
    }

}
