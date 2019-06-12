package com.example.dealears_realm;

import io.realm.Realm;
import io.realm.RealmResults;

public class Realm_Helper {

    public static boolean savedealears(Dealears_Model dealearsModel) {
        Realm realm = Realm.getDefaultInstance();

        try {
            realm.beginTransaction();
            realm.insertOrUpdate(dealearsModel);
            realm.commitTransaction();
        } catch (Exception e) {
            return false;
        }
        return true;

    }


    public void deleteDealer(Dealears_Model dealearsModel) {

        Realm realm = Realm.getDefaultInstance();
        RealmResults<Dealears_Model> dealears_models = realm.where(Dealears_Model.class).equalTo("d_phone", dealearsModel.getD_phone()).findAll();
        if (dealears_models != null && dealears_models.size() > 0) {
            dealears_models.clear();
        }
    }


    public RealmResults<Dealears_Model> getAllDealers(){
        Realm realm = Realm.getDefaultInstance();

        RealmResults<Dealears_Model> alldelers = realm.where(Dealears_Model.class).findAll();
        return alldelers;
    }
}
