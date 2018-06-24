package miniproj.hepai.controller.test;

import miniproj.hepai.controller.CommentController;
import miniproj.hepai.model.CommentM;
import org.junit.Test;

public class CommentControllerTest {
    @Test
    public void testPostComment(){
        CommentController controller=new CommentController();
        CommentM commentM=new CommentM();
        commentM.setPosterId(3);
        commentM.setContent("不错不错，和黄子韬很有夫妻相");
        commentM.setFeedId(2);
        commentM= controller.postComment(commentM);
        System.out.println("commentM.id="+commentM.getId());
    }
}
