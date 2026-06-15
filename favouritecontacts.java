public class favouritecontacts {

    private String[] favourites = new String[10];
    private int count = 0;

    public void addFavorite(String name) {

        if (count < favourites.length) {
            favourites[count++] = name;
            System.out.println("Added To Favorites.");
        } else {
            System.out.println("Favorites Full.");
        }
    }

    public void displayFavorites() {

        if (count == 0) {
            System.out.println("No Favorites.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + favourites[i]);
        }
    }
}