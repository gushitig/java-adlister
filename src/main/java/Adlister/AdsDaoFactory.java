package Adlister;



public class AdsDaoFactory {
    private static Ads adsDao;


    public static Ads getAdsDao() {
        Config config = new Config();
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}