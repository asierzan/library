package pl.sda.library.model;

public class MovieBuilder {

    //private Creator director;
    private int duration;
    private String title;
    private String directorFirstName;
    private String directorLastName;


    public MovieBuilder title(String title) {
        this.title = title;
        return this;
    }

    public MovieBuilder duration(int duration) {
        this.duration = duration;
        return this;
    }

    public MovieBuilder directorFirstName(String directorFirstName) {
        this.directorFirstName = directorFirstName;
        return this;
    }

    public MovieBuilder directorLastName(String directorLastName) {
        this.directorLastName = directorLastName;
        return this;
    }

    public Movie build() {
        Movie movie = new Movie();
        movie.setTitle(title);
        Creator director = new Creator();
        director.setFirstName(directorFirstName);
        director.setLastName(directorLastName);
        movie.setDirector(director);
        movie.setDuration(duration);
        return movie;

    }

}
