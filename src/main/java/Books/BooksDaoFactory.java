package Books;

public class BooksDaoFactory {
    private static Books booksDao;

    public static Books getBooksDao () {
        if(booksDao == null){
            Config config = new Config();
            //booksDao = new MySQLBooksDao(config);
        }
        return booksDao;
    }
}
