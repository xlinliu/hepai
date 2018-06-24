package miniproj.hepai.dao;

import miniproj.hepai.beans.Comment;
import miniproj.hepai.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CommentDao {
    public static Comment save(Comment comment){
        Session session=HibernateUtil.getCurrentSession();
        Transaction tr=session.beginTransaction();
        session.save(comment);
        tr.commit();
        return comment;
    }
}
