package models;

public class BoardGame extends Product{
    private static int idContor = 100;
    private String series;
    private String theme;
    private int minNrOfPlayers;
    private int maxNrOfPlayers;
    private int gameLength;
    private int minAge;

    public BoardGame() {
        super();
    }

    public BoardGame(String name, float price, int stock, int yearOfPublication, String publisher, String language) {
        super(idContor++, name, price, stock, yearOfPublication, publisher, language);
    }

    public BoardGame(String name, String series, String theme, float price, int stock, int yearOfPublication, String publisher, String language, int minNrOfPlayers, int maxNrOfPlayers, int gameLength, int minAge) {
        super(idContor++, name, price, stock, yearOfPublication, publisher, language);
        this.series = series;
        this.theme = theme;
        this.minNrOfPlayers = minNrOfPlayers;
        this.maxNrOfPlayers = maxNrOfPlayers;
        this.gameLength = gameLength;
        this.minAge = minAge;
    }

    @Override
    public float TVACalculator() {
        return this.getPrice() * 0.2f + this.getPrice();
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getMinNrOfPlayers() {
        return minNrOfPlayers;
    }

    public void setMinNrOfPlayers(int minNrOfPlayers) {
        this.minNrOfPlayers = minNrOfPlayers;
    }

    public int getMaxNrOfPlayers() {
        return maxNrOfPlayers;
    }

    public void setMaxNrOfPlayers(int maxNrOfPlayers) {
        this.maxNrOfPlayers = maxNrOfPlayers;
    }

    public int getGameLength() {
        return gameLength;
    }

    public void setGameLength(int gameLength) {
        this.gameLength = gameLength;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public String toString() {
        return super.toString() +
                "series='" + series + '\n' +
                "theme='" + theme + '\n' +
                "minNrOfPlayers=" + minNrOfPlayers + '\n' +
                "maxNrOfPlayers=" + maxNrOfPlayers + '\n' +
                "gameLength=" + gameLength + '\n' +
                "minAge=" + minAge + '\n';
    }
}
