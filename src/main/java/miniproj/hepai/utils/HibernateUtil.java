package miniproj.hepai.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final Configuration  CONFIG;
    private static final SessionFactory FACTORY;
    //初始化配置文件以及连接池
    static {
        CONFIG=new Configuration().configure();
        FACTORY=CONFIG.buildSessionFactory();
    }
    //获取Session
    public static Session openSession(){
        return FACTORY.openSession();
    }
    public static Session getCurrentSession(){
        return FACTORY.getCurrentSession();

    }
}
