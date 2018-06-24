package miniproj.hepai.model;

import miniproj.hepai.beans.Feed;

public class CommentM implements Comparable<CommentM> {
    private Integer id;
    private Integer posterId;
    private String content;
    private Integer feedId;
    private Long stamp;





    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPosterId() {
        return posterId;
    }

    public void setPosterId(Integer posterId) {
        this.posterId = posterId;
    }


    public Long getStamp() {
        return stamp;
    }

    public void setStamp(Long stamp) {
        this.stamp = stamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getFeedId() {
        return feedId;
    }

    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    @Override
    public int compareTo(CommentM o) {
        return o.getStamp()>stamp?-1:1;
    }
}
