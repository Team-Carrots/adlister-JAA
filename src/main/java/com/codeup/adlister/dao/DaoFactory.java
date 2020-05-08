package com.codeup.adlister.dao;


public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static AdImages adImagesDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

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

//    public static Ads searchAdsDao(){
//        if (searchAdsDao == null) {
//            searchAdsDao = new MySQLAdsDao(config);
//        }
//        return searchAdsDao;
//    }


//    public static Ads oneAd() {
////        if (adsDao == null) {
////            adsDao = new MySQLAdsDao(config);
////        }
////        return adsDao;
////    }
}
