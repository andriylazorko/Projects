import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private String nameOfPlaylist;
    private LinkedList<Song> playlist;

    public Playlist(String nameOfPlaylist) {
        this.nameOfPlaylist = nameOfPlaylist;
        this.playlist = new LinkedList<Song>();
    }

    public LinkedList<Song> getSong() {
        return playlist;
    }

    private Song findSong(Album albumSong, String title) {

        for (Song checkSong : albumSong.getSongs()) {
            if (checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(Album albumSong, String title) {
        Song checkSong = findSong(albumSong, title);
        if (checkSong != null) {
            this.playlist.add(checkSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public boolean addToPlaylist(Album albumSong, int trackNumber) {
        if ((trackNumber > 0) && (trackNumber <= albumSong.getSongs().size())) {
            int index = trackNumber - 1;
            this.playlist.add(albumSong.getSongs().get(index));
            return true;
        } else {
            System.out.println("This album does not have a track " + trackNumber);
        }
        return false;
    }

    public boolean playingPlaylistForward(LinkedList<Song> playlist,
                                          ListIterator<Song> iterator) {
        if (iterator.hasNext()) {
            System.out.println("Now playing: " + iterator.next().toString());
            return true;
        } else if(iterator.hasPrevious()) {
            System.out.println("We have reached the end of the playlist.");
        }
        return false;
    }

    public boolean playingPlaylistBackwards(LinkedList<Song> playlist,
                                            ListIterator<Song> iterator) {
        if (iterator.hasPrevious()) {
            System.out.println("Now playing: " + iterator.previous().toString());
            return true;
        }else{
            System.out.println("We are at the start of the playlist");
        }
        return false;
    }

    public boolean removeSongFromPlaylist(LinkedList<Song> playlist,
                                          ListIterator<Song> iterator) {
        if (playlist.size() > 0) {
            iterator.remove();
            if (iterator.hasNext()) {
                System.out.println("Now playing: " + iterator.next());
            } else if (iterator.hasPrevious()) {
                System.out.println("Now playing: " + iterator.previous());
            } else {
                System.out.println("your playlist is empty.");
            }
            return true;
        }
        return false;
    }

    public void printPlaylist(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("Songs of the " + nameOfPlaylist + ": ");
        System.out.println("=============================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("=============================");
    }

    public void printPlaylistMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");
    }


}

