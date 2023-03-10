package Adlister;

import java.util.List;

public class AdsDaoTest {
    public static void main(String[] args) {

        ListAdsDao adDao = new ListAdsDao();
        List<Ad> ads = adDao.all();
        System.out.println(ads);

        for (int i = 0; i < ads.size(); i++) {
            System.out.println(ads.get(i));
        }


        /*adDao.insert(new Ad(11,
                122,
                "airplane for sale",
                "Flown in Alaska mostly, so a little weathered, but good engine guts"
        ));
        System.out.println(adDao.all());*/
    }
}
