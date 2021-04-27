package Ex_5;

public class Song {
    String name;
    String author;
    String album;
    double duration;

    public Song(String name, String author, String album, double duration) {
        this.name = name;
        this.author = author;
        this.album = album;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getAlbum() {
        return album;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", album='" + album + '\'' +
                ", duration=" + duration +
                '}';
    }
}
