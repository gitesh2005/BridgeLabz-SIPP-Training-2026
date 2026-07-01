package ProgrammingElements.Interfaces;

interface StreamingService {

    // Abstract method
    void showMovies();

    // Default method
    default void showSubscriptionDetails() {
        System.out.println("Streaming Service Subscription: Active");
    }
}

interface GamingService {

    // Abstract method
    void showGames();

    // Default method
    default void showSubscriptionDetails() {
        System.out.println("Gaming Service Subscription: Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    String[] movies = {
            "Avengers",
            "Inception",
            "Interstellar",
            "Avatar"
    };

    String[] games = {
            "FIFA",
            "Minecraft",
            "Call of Duty",
            "Asphalt"
    };

    @Override
    public void showMovies() {
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void showGames() {
        System.out.println("Available Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class MultiServiceSmartTV {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println();

        tv.showMovies();

        System.out.println();

        tv.showGames();
    }
}