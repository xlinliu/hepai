package miniproj.hepai.beans;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Feed implements Comparable<Feed>{
    private Integer id;
    private Integer posterId;
    private String description;
    private String video;
    private Integer likeCount=0;
    private Long stamp;
    private Set<Comment> comments=new HashSet<>();


    public void addComment(Comment comment){

        comments.add(comment);
    }


    public Long getStamp() {
        return stamp;
    }

    public void setStamp(Long stamp) {
        this.stamp = stamp;
    }

    public Integer getPosterId() {
        return posterId;
    }

    public void setPosterId(Integer posterId) {
        this.posterId = posterId;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Feed o) {
        return o.getStamp()>stamp?-1:1;
    }
}
