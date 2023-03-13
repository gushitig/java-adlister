package Books;

import java.sql.*;

import Books.Books;
import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class MySQLBooksDao implements Books {

    private Connection connection = null;

    public MySQLBooksDao (Config config) {

        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("error connection to database", e);
        }



    }


    @Override
    public List<Book> all() {
        List<Book> books = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();

            //pulls data from database
            ResultSet rs = stmt.executeQuery("SELECT * FROM books_example.books");

            //rs.next is like everything in a document and will take you to the next line, so once rs.next is complete it will return false which is why we use a while loop
            while(rs.next()) {
                books.add(new Book(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("author")
                )); //this will generate our objects from the database
            }
            return books; //returns and creates our list of books we have created now

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }





}
