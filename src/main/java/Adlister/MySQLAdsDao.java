package Adlister;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLAdsDao implements Ads{

    private Connection connection = null;

    public MySQLAdsDao(Config config) {

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



    public Long insert(Ad ad) {
        // make sure we have ads
        if (ads == null) {
            ads = generateAds();
        }
        // we'll assign an "id" here based on the size of the ads list
        // really the database would handle this
        ad.setId((long) ads.size());
        ads.add(ad);
        return ad.getId();
    }






    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();

            //pulls data from database
            ResultSet rs = stmt.executeQuery("SELECT * FROM Adlister.ads");

            //rs.next is like everything in a document and will take you to the next line, so once rs.next is complete it will return false which is why we use a while loop
            while(rs.next()) {
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("userId"),
                        rs.getString("title"),
                        rs.getString("description")
                )); //this will generate our objects from the database
            }
            return ads; //returns and creates our list of books we have created now

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
