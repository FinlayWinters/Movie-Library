// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {  UserInterface ui = new UserInterface();
        ui.showMainMenu();
      /*  Movie m = new Movie("The Blair witch project", 82, Genre.HORROR);
        Movie m2 = new Movie("ELF" , 96, Genre.COMEDY);
        Movie m3 = new Movie("Poltergeist", 114, Genre.HORROR);

        MovieLibrary Library = new MovieLibrary();
        Library.addMovie(m);
        Library.addMovie(m2);
        Library.addMovie(m3);

        int size = Library.movieCount();
        System.out.println(size);

        Library.showMovies();




    }
}