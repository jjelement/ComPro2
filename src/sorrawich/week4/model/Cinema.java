package sorrawich.week4.model;

import java.util.Arrays;

public class Cinema extends Movie {

    private Theater[] theaters;

    public Cinema() {
    }

    public Cinema(String name, String genre, int season, int length) {
        super(name, genre, season, length);
        this.theaters = generateTheaters();
    }

    public Cinema(String name, String genre, int season, int length, Theater[] theaters) {
        super(name, genre, season, length);
        this.theaters = theaters;
    }

    private Theater[] generateTheaters() {
        Theater[] theaters = new Theater[5];

        for(int i = 0; i < theaters.length; i++) {
            theaters[i] = new Theater("Theater " + (i+1));
        }

        return theaters;
    }

    public Theater[] getTheaters() {
        return theaters;
    }

    public void setTheaters(Theater[] theaters) {
        this.theaters = theaters;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "theaters=" + Arrays.toString(theaters) +
                '}';
    }
}
