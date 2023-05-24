
import java.util.HashMap;


public class Main  {
    public static void main(String[] args) {
        Main main = new Main();
        HashMap<Integer,String> myFavoriteColours = new HashMap<>();

        HashMap<Integer,String> myFriendsFavoriteColours = new HashMap<>();

        myFavoriteColours.put(1, "Red");
        myFavoriteColours.put(2, "Green");
        myFavoriteColours.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColours);
        myFriendsFavoriteColours.put(4, "White");
        myFriendsFavoriteColours.put(5, "Blue");
        myFriendsFavoriteColours.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColours);
        OurFavoriteColours ourFavoriteColours = new OurFavoriteColours();
        HashMap<Integer, String> ourFavoriteColoursx = new HashMap<>();
        ourFavoriteColours.copy(myFavoriteColours,ourFavoriteColoursx);
        ourFavoriteColours.copy(myFriendsFavoriteColours,ourFavoriteColoursx);
        System.out.println("Value new map ");
        ourFavoriteColours.listx(ourFavoriteColoursx);




    }
}