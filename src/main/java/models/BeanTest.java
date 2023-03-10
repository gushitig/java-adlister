package models;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        //ArrayList chaos = new ArrayList();
        ArrayList<Quote> chaos = new ArrayList<>();

        Album shred = new Album (1, "Gnarly Sam", "Shred Til Ya Dead", 2020, 50.8, "Rock");
        Album meow = new Album (2, "Feline Fanatic", "You Had Me at Meow", 2021, 80.3, "Jazz");
        Album mountains = new Album (3, "Mountain Mama", "Mountains o' Love", 2019, 10.3, "Pop");



        Author bob = new Author("Bob", "Smith");
        Author nova = new Author("Super", "Nova");
        Author neptune = new Author("Neptune", "Antonuccio");
        Author karen = new Author("Karen", "Rbf");



        Quote bas = new Quote ("Dr. Dre", "Bitches ain't shit.");
        Quote bat = new Quote ("Dad", "that's a bat! A big ass truck.");
        Quote bod = new Quote ("Dan when discussing an apocalypse", "Better off dead.");

        chaos.add(bas);
        chaos.add(bat);
        chaos.add(bod);

        for (int i = 0; i < chaos.size(); i++) {
            System.out.println(chaos.get(i));
        }



    }
}