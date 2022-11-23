package TestSP;

public interface Visitor {
    void visitMediaPlayer(MediaPlayer mediaplayer);
    void visitPlaylist(Playlist playlist);
    void visitVideoclip(Videoclip videoclip);
    void visitGif(Gif gif);
    void visitMelodie(Melodie melodie);

    void pringSizes();
}
