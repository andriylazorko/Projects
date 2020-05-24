import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private String nameOfPlaylist;
    private LinkedList<Song> playlist;

    public Playlist(String nameOfPlaylist) {
        this.nameOfPlaylist = nameOfPlaylist;
        this.playlist = new LinkedList<Song>();
    }

    public LinkedList<Song> getPlaylist() {
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
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public boolean addToPlaylist(Album albumSong, int trackNumber) {
        if (trackNumber > 0) {
            for (int i = 0; i < albumSong.getSongs().size(); i++) {
                Song checkSong=albumSong.getSongs().get(i);
                if ((trackNumber - 1) == i) {
                    this.playlist.add(checkSong);
                }
            }
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }


}
