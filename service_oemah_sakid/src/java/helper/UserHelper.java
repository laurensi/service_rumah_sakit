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
import pojos.User;

/**
 *
 * @author Ren
 */
public class UserHelper {

    public UserHelper() {
    }

    public User cariUser(String email) {
        //create session
        Session session = MyRSKUHibernateUtil.getSessionFactory().openSession();
        Transaction tx =session.beginTransaction();
        //create String Query
        String query = "from User u where u.email=:email";
        Query q = session.createQuery(query);
        q.setParameter("email", email);
        //siapkan list, hasil pencarian
        List<User> list = q.list();
        //tutup sesion
        session.close();
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public User login(String email, String password) {
        Session session = MyRSKUHibernateUtil.getSessionFactory().openSession();
        String q = "From User a where a.email=:email AND a.password =:password";

        Query query = session.createQuery(q);
        query.setParameter("email", email);
        query.setParameter("password", password);

        return (User) query.uniqueResult();
    }
}
