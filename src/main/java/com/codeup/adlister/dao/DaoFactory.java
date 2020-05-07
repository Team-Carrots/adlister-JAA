package com.codeup.adlister.dao;

import com.codeup.adlister.models.AdImage;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();
    private static AdImages adImagesDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

//    public static Ads oneAd() {
//        if (adsDao == null) {
//            adsDao = new MySQLAdsDao(config);
//        }
//        return adsDao;
//    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }

    public  static AdImages getAdImagesDao(){
        if (adImagesDao == null) {
            adImagesDao = new MySQLAdImagesDao(config);
        }
        return adImagesDao;

    }
}
