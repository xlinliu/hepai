package miniproj.hepai.utils;

import miniproj.hepai.beans.Comment;
import miniproj.hepai.beans.Feed;
import miniproj.hepai.model.FeedM;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FeedGenerator {
    public static FeedM generate(){
        FeedM feed=new FeedM();
//        CommentM comment=new CommentM();
//        comment.setContent("评论1：很不错，我也想拍！");
//        comment.setPosterId(2);
//        comment.setFeed(feed);
//        feed.addComment(comment);
//        CommentM comment1=new CommentM();
//        comment1.setPosterId(1);
//        comment1.setContent("评论2：好有夫妻相哦！");
//        comment1.setFeed(feed);
//        feed.addComment(comment1);

        feed.setDescription("我是吴亦凡，大家来找我合拍吧");
        feed.setPosterId(1);
        feed.setVideo("7447398156640200148");

        Long stamp=System.currentTimeMillis();
        feed.setStamp(stamp);
        return feed;
    }
}
