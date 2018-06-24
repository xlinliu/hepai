package miniproj.hepai.controller.test;

import miniproj.hepai.beans.Feed;
import miniproj.hepai.controller.FeedConstroller;
import miniproj.hepai.model.FeedGetter;
import miniproj.hepai.model.FeedM;
import miniproj.hepai.utils.FeedGenerator;
import org.junit.Test;

import java.util.List;

public class FeedControllerTest {
    @Test
    public void testPostFeed() {
        FeedM feedM = FeedGenerator.generate();
        FeedConstroller constroller = new FeedConstroller();
        Feed feed1 = constroller.postFeed(feedM);
        System.out.println(feed1.getId());
    }

    @Test
    public void testGetFeed() {
        FeedGetter getter = new FeedGetter();
        getter.setIndex(0);
        getter.setCount(2);
        FeedConstroller constroller = new FeedConstroller();
        List<Feed> feeds = constroller.getFeed(getter);
        for (Feed feed : feeds) {
            System.out.println(feed.getDescription());
        }
    }
}
