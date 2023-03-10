package models;


import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        //ArrayList chaos = new ArrayList();
        ArrayList<Quote> quotes = new ArrayList<>();

        Album shred = new Album ();
        shred.setId(1);
        shred.setArtist("Gnarly Sam");
        shred.setRecordName("Shred Til Ya Dead");
        shred.setReleaseDate(2020);
        shred.setSales(50.8);
        shred.setGenre("Rock");

        Album meow = new Album ();
        meow.setId(2);
        meow.setArtist("Feline Fanatic");
        meow.setRecordName("You Had Me at Meow");
        meow.setReleaseDate(2021);
        meow.setSales(80.3);
        meow.setGenre("Jazz");

        Album mountains = new Album ();
        mountains.setId(3);
        mountains.setArtist("Mountain Mama");
        mountains.setRecordName("Mountains o' Love");
        mountains.setReleaseDate(2019);
        mountains.setSales(10.3);
        mountains.setGenre("Pop");


        Author bob = new Author(1, "Bob", "Smith");
        Author nova = new Author(2, "Super", "Nova");
        Author neptune = new Author(3, "Neptune", "Antonuccio");
        Author karen = new Author(4, "Karen", "Rbf");



        Quote bas = new Quote (1, "Dr. Dre", "Bitches ain't shit.");
        Quote bat = new Quote (2, "Dad", "that's a bat! A big ass truck.");
        Quote bod = new Quote (3, "Dan when discussing an apocalypse", "Better off dead.");

        quotes.add(bas);
        quotes.add(bat);
        quotes.add(bod);

        System.out.println(quotes);

        for (int i = 0; i < quotes.size(); i++) {
            System.out.println(quotes.get(i));
        }


    }

}