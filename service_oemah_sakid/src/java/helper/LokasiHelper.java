/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import newUtil.MyRSKUHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Location;

public class LokasiHelper {

    public LokasiHelper() {

    }

    public List<Location> getLocation(){
         Session session = MyRSKUHibernateUtil.getSessionFactory().openSession();
        String query = "From Location";
        Query q = session.createQuery(query);
        List<Location> list = q.list();
        return list;
    }
    public void addNewLocation(double lat,double lng, String name){
     Session session = MyRSKUHibernateUtil.getSessionFactory().openSession();
     Transaction transaction = session.beginTransaction();
     Location location = new Location(lat,lng,name);
     session.saveOrUpdate(location);
     transaction.commit();
     session.close();
     
    }

}


