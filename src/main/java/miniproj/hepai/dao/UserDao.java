package miniproj.hepai.dao;

import miniproj.hepai.beans.Feed;
import miniproj.hepai.beans.User;
import miniproj.hepai.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Set;

public class UserDao {
    public static User get(int userId) {
        Session session = HibernateUtil.getCurrentSession();
        Transaction tr = session.beginTransaction();
        User user=session.get(User.class,userId);
        tr.commit();
        return user;
    }

    public static User save(User user){
        Session session=HibernateUtil.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.save(user);
        tr.commit();
        return user;
    }

}
