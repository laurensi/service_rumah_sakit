/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import newUtil.MyRSKUHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Klinik;


/**
 *
 * @author Ren
 */
public class KlinikHelper {

    public KlinikHelper() {
    }
public List<Klinik> getKlinik(){
         Session session = MyRSKUHibernateUtil.getSessionFactory().openSession();
        String query = "From Klinik";
        Query q = session.createQuery(query);
        List<Klinik> list = q.list();
        return list;
    }
public void addKlinik(String idKlinik,String nama, String spesialis){
     Session session = MyRSKUHibernateUtil.getSessionFactory().openSession();
     Transaction transaction = session.beginTransaction();
     Klinik klinik = new Klinik(idKlinik,nama,spesialis);
     session.saveOrUpdate(klinik);
     transaction.commit();
     session.close();
     
    }
}
