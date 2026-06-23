class Movie {
    private int movieId;
    private String title;

    void setMovieId(int id) { this.movieId = id; }
    int getMovieId() { return movieId; }
    void setTitle(String title) { this.title = title; }
    String getTitle() { return title; }

    boolean equals(Movie other) {
        return this.movieId == other.movieId;
    }

    void calculateFees(int daysLate) {
        if (daysLate > 0)
            System.out.println(title + " late fee: " + (daysLate * 2));
        else
            System.out.println(title + " has no late fee.");
    }
}

class Action extends Movie {
    void calculateFees(int daysLate) {
        if (daysLate > 0)
            System.out.println(getTitle() + " (Action) late fee: " + (daysLate * 3));
        else
            System.out.println(getTitle() + " (Action) has no late fee.");
    }
}

class Comedy extends Movie {
    void calculateFees(int daysLate) {
        if (daysLate > 0)
            System.out.println(getTitle() + " (Comedy) late fee: " + (daysLate * 2.5));
        else
            System.out.println(getTitle() + " (Comedy) has no late fee.");
    }
}

class Drama extends Movie {
    void calculateFees(int daysLate) {
        if (daysLate > 0)
            System.out.println(getTitle() + " (Drama) late fee: " + (daysLate * 2));
        else
            System.out.println(getTitle() + " (Drama) has no late fee.");
    }
}

class MovieRentalFees {
    public static void main(String[] args) {
        Action action = new Action();
        action.setMovieId(202);
        action.setTitle("Captain America");

        Comedy comedy = new Comedy();
        comedy.setMovieId(303);
        comedy.setTitle("Deadpool");

        Drama drama = new Drama();
        drama.setMovieId(101);
        drama.setTitle("Kang Dynasty");

        Movie base = new Movie();
        base.setMovieId(101);
        base.setTitle("The Avengers");

        System.out.println("Drama same ID as base? " + drama.equals(base));

        Movie[] movies = {action, comedy, drama};
        int[] daysLate = {4, 2, 5};

        for (int i = 0; i < movies.length; i++) {
            movies[i].calculateFees(daysLate[i]);
        }
    }
}
