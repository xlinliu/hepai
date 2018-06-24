package miniproj.hepai.dao;

import miniproj.hepai.beans.Feed;
import miniproj.hepai.model.FeedGetter;
import miniproj.hepai.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class FeedDao {
    public static Feed save(Feed feed) {
        Session session = HibernateUtil.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.save(feed);
        tr.commit();
        return feed;

    }

    public static Feed get(int feedId) {
        Session session = HibernateUtil.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Feed feed = session.get(Feed.class, feedId);
        tr.commit();
        return feed;
    }

    public static Feed addlike(int feedId) {
        Session session = HibernateUtil.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Feed feed = session.get(Feed.class, feedId);
        feed.setLikeCount(feed.getLikeCount() + 1);
        tr.commit();
        return feed;
    }

    public static Feed decreaseLike(int feedId) {
        Session session = HibernateUtil.getCurrentSession();
        Transaction tr = session.beginTransaction();

        Feed feed = session.get(Feed.class, feedId);
        if (feed.getLikeCount() > 0) {
            feed.setLikeCount(feed.getLikeCount() - 1);
        }
        tr.commit();
        return feed;
    }


    public static List<Feed> getFeedList(FeedGetter getter) {
        int index = getter.getIndex();
        int count = getter.getCount();

        String hql = "FROM Feed order by stamp desc";
        Session session = HibernateUtil.getCurrentSession();
        Transaction tr = session.beginTransaction();
        Query query = session.createQuery(hql);
        query.setFirstResult(index);
        query.setMaxResults(count);
        List<Feed> list =new ArrayList<>();
        int hot=1;
        list.add(session.get(Feed.class, hot));
        list.addAll(query.list());
        tr.commit();
        System.out.println("feed size:" + list.size());

        return list;
    }


}
