import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player Lazer = new Player("Lazer",100,100);
        System.out.println(Lazer.toString());
        saveObject(Lazer);

        Lazer.setHitPoints(95);
        System.out.println(Lazer.toString());
        Lazer.setWeapon("MelytaGun");
        saveObject(Lazer);
//        loadObject(Lazer);
        System.out.println(Lazer.toString());

        ISaveable werewolf = new Monster("Werewolf",200,100);
//        werewolf.getStrength();
        System.out.println("Strength = "+ ((Monster) werewolf).getStrength());
        System.out.println("==="+werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<String>();
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");
        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter e String: ");
                    String stringInput = scanner.nextLine();
                    values.add(stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
         for(int i=0; i<objectToSave.write().size(); i++){
             System.out.println("Saving "+objectToSave.write().get(i)+
                     " to storage device");
         }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
