public class UserInterface
{
    private InputReader reader;

    private MovieLibrary Library;

    public UserInterface()
    {
        this.reader = new InputReader();
    }

    public void showMainMenu()
    {
        boolean quit = false;

        while (quit == false)
        {
            System.out.println("please select an option");
            System.out.println("1. add a new movie");
            System.out.println("2 show all movies");
            System.out.println("3 show movie count");
            System.out.println("0 Quit");

            String userInput = reader.getInput();

            switch (userInput)
            {
                case "1":
                    addMovie();
                    break;
                case "2":
                    this.listMovies();
                    break;
                case "3":
                    this.showMovieCount();
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                    System.out.println("That was not a valid choice");


            }
        }
    }
    public void addMovie() {
        System.out.println("Please enter the title of the movie: ");
        String title = reader.getInput();

        System.out.println("Please enter the running time of the movie: ");
        String userInput = reader.getInput();
        int runningTime = 0;

        try {
            runningTime = Integer.parseInt(userInput);
        } catch (NumberFormatException exception) {
            System.err.println("The input could not be parse to an int");
            return;
        }

        Genre aGenre;

        System.out.println("Please choose from the following;");
        System.out.println("1. Comedy:");
        System.out.println("2. Thriller:");
        System.out.println("3. Horror:");

        userInput = reader.getInput();

        int genreNumber = -1;

        try {
            runningTime = Integer.parseInt(userInput);
        } catch (NumberFormatException exception) {
            System.err.println("The input could not be parse to an int");
            return;
        }

        if (genreNumber < 1 || genreNumber > 6) {
            System.err.println("That was not a valid option");
            return;
        }

        Genre genre = Genre.COMEDY;

        switch (genreNumber) {
            case 1:
                genre = Genre.COMEDY;
                break;
            case 2:
                genre = Genre.HORROR;
                break;
            case 3:
                genre = Genre.THRILLER;
                break;
        }

        Movie m = new Movie(title, runningTime, genre);
        this.Library.addMovie(m);
    }

    public void listMovies()
    {
        this.Library.showMovies();
    }

    public void showMovieCount()
    {
        int count = this.Library.movieCount();

        System.out.println(count);
    }


    }







