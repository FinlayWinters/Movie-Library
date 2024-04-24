public class Movie
{
    private String title;
    private int runningTime;

    private  Genre genre;

    private int minutes;



    public Movie(String aTile, int aRunningTime, Genre aGenre)
    {
        this.title = aTile;
        this.runningTime = aRunningTime;
        this.genre = aGenre;
        this.minutes = aRunningTime;

    }

    public Genre getGenre()
    {
        return genre;
    }

    public String getTitle()
    {
        return title;
    }

    public int getRunningTime()
    {
        return runningTime;
    }
    public void showInfo()
    {
        String movieInfo = this.getTitle() + "," + this.getGenre() + ", running time;" + this.getRunningTime() + "minutes";
        System.out.println(title);
        System.out.println(genre);
        System.out.println(runningTime);
        System.out.println(minutes);


    }

}
