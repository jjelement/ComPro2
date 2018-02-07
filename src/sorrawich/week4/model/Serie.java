package sorrawich.week4.model;

import java.util.Arrays;

public class Serie extends Movie {
    private SerieEp[] serieEps;

    public Serie() {
    }

    public Serie(String name, String genre, int season, int length) {
        super(name, genre, season, length);
        this.serieEps = generateEps();
    }

    public Serie(String name, String genre, int season, int length, SerieEp[] serieEps) {
        super(name, genre, season, length);
        this.serieEps = serieEps;
    }

    private SerieEp[] generateEps() {
        SerieEp[] serieEps = new SerieEp[5];

        for(int i = 0; i < serieEps.length; i++) {
            serieEps[i] = new SerieEp("Serie EP." + (i+1), 40);
        }

        return serieEps;
    }

    public SerieEp[] getSerieEps() {
        return serieEps;
    }

    public void setSerieEps(SerieEp[] serieEps) {
        this.serieEps = serieEps;
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for(SerieEp serieEp : this.getSerieEps()) {
            totalLength += serieEp.getLength();
        }
        return totalLength;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "serieEps=" + Arrays.toString(serieEps) +
                '}';
    }
}
