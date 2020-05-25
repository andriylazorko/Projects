import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

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

        LinkedList<Song> myPlaylist = new LinkedList<Song>();
        myPlaylist = playlist.getSong();
//        playlist.printPlaylist(myPlaylist);
        playlist.printPlaylistMenu();

        ListIterator<Song> listIterator = myPlaylist.listIterator();

        boolean quit = false;
        boolean flag = true;

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (flag) {
                        playlist.playingPlaylistForward(myPlaylist, listIterator);
                    } else {
                        flag = changeFlag(listIterator, flag);
                        playlist.playingPlaylistForward(myPlaylist, listIterator);
                    }
                    break;
                case 2:
                    if (!flag) {
                        playlist.playingPlaylistBackwards(myPlaylist, listIterator);
                    } else {
                        flag = changeFlag(listIterator, flag);
                        playlist.playingPlaylistBackwards(myPlaylist, listIterator);
                    }
                    break;
                case 3:
                    if (flag) {
                        playlist.playingPlaylistBackwards(myPlaylist, listIterator);
                        flag = false;
                    } else {
                        playlist.playingPlaylistForward(myPlaylist, listIterator);
                        flag = true;
                    }
                    break;
                case 4:
                    playlist.printPlaylist(myPlaylist);
                    break;
                case 5:
                    playlist.printPlaylistMenu();
                    break;
                case 6:
                    playlist.removeSongFromPlaylist(myPlaylist,listIterator);
                    break;
            }
        }
    }

    private static boolean changeFlag(ListIterator<Song> listIterator, boolean flag) {
        if (!flag) {
            if (listIterator.hasNext()) {
                listIterator.next();
            }
            flag = true;
            return flag;
        } else {
            if (listIterator.hasPrevious()) {
                listIterator.previous();
            }
            flag = false;
            return flag;
        }
    }
}
