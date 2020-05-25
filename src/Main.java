import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("121. LinkedList Challenge my version");

        Album album1 = new Album("Storm-bringer", "Deep Purple");
        album1.addSong("Storm-bringer", 4.6);
        album1.addSong("Love don't mean a thing", 4.22);
        album1.addSong("Holy man", 4.3);
        album1.addSong("Hold on", 5.6);
        album1.addSong("Lady double dealer", 3.21);
        album1.addSong("You can't do it right", 6.23);
        album1.addSong("High ball shooter", 4.27);
        album1.addSong("The gypsy", 4.2);
        album1.addSong("Soldier of fortune", 3.13);

        Album album2 = new Album("For those about to rock", "AC/DC");
        album2.addSong("For those about to rock", 5.44);
        album2.addSong("I put the finger on you", 3.25);
        album2.addSong("Lets go", 3.45);
        album2.addSong("Inject the venom", 3.33);
        album2.addSong("Snowballed", 4.51);
        album2.addSong("Evil walks", 3.45);
        album2.addSong("C.O.D.", 5.25);
        album2.addSong("Breaking the rules", 5.32);
        album2.addSong("Night of the long knives", 5.12);

        Playlist playlist = new Playlist("My first playlist");
        playlist.addToPlaylist(album2, 3);
        playlist.addToPlaylist(album1, "Storm-bringer");
        playlist.addToPlaylist(album2, "Night of the long knives");
        playlist.addToPlaylist(album1, "Love don't mean a thing");
        playlist.addToPlaylist(album2, 1);
        playlist.addToPlaylist(album2, 6);
        playlist.addToPlaylist(album1, 4);

        LinkedList<Song> songPlay = new LinkedList<Song>();
        songPlay = playlist.getPlaylist();

        printList(songPlay);

    }


    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }

}
