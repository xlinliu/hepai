package miniproj.hepai.controller;

import miniproj.hepai.beans.Comment;
import miniproj.hepai.beans.Feed;
import miniproj.hepai.dao.CommentDao;
import miniproj.hepai.dao.FeedDao;
import miniproj.hepai.model.CommentM;
import miniproj.hepai.model.FeedM;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController {
    @RequestMapping(value = "postcomment",method = RequestMethod.POST )
    @ResponseBody
    public CommentM postComment(@RequestBody CommentM commentM){
        Comment comment =new Comment();
        comment.setPosterId(commentM.getPosterId());
        comment.setContent(commentM.getContent());
        comment.setStamp(System.currentTimeMillis());
        int feedId=commentM.getFeedId();
        Feed feed=FeedDao.get(feedId);
        comment.setFeed(feed);
        CommentDao.save(comment);
        commentM.setId(comment.getId());
        commentM.setStamp(comment.getStamp());
        return commentM;
    }
}
