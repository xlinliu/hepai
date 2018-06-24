package miniproj.hepai.controller;

import miniproj.hepai.beans.Comment;
import miniproj.hepai.beans.Feed;
import miniproj.hepai.model.FeedGetter;
import miniproj.hepai.dao.FeedDao;
import miniproj.hepai.model.FeedM;
import miniproj.hepai.utils.FeedGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class FeedConstroller {
    @RequestMapping(value = "getfeed", method = RequestMethod.POST)
    @ResponseBody
    public List<Feed> getFeed(@RequestBody FeedGetter getter) {

        return FeedDao.getFeedList(getter);
    }

    @RequestMapping(value = "postfeed", method = RequestMethod.POST)
    @ResponseBody
    public Feed postFeed(@RequestBody FeedM feedm) {

        Feed feed = new Feed();
        feed.setStamp(System.currentTimeMillis());
        feed.setVideo(feedm.getVideo());
        feed.setDescription(feedm.getDescription());
        feed.setPosterId(feedm.getPosterId());
        return FeedDao.save(feed);
    }

    @RequestMapping(value = "like", method = RequestMethod.POST)
    @ResponseBody
    public Feed like(@RequestBody FeedM feedM) {
        return FeedDao.addlike(feedM.getId());
    }

    @RequestMapping(value = "unlike", method = RequestMethod.POST)
    @ResponseBody
    public Feed unLike(@RequestBody FeedM feedM) {
        return FeedDao.decreaseLike(feedM.getId());
    }
}
