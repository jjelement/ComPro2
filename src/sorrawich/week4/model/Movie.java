package sorrawich.week4.model;

public class Movie {
    private String name;
    private String genre;
    private int season;
    private int length;

    public Movie() {
    }

    public Movie(String name, String genre, int season, int length) {
        this.name = name;
        this.genre = genre;
        this.season = season;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", season=" + season +
                ", length=" + length +
                '}';
    }
}
