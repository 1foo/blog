package ink.ifoo.blog.pojo;

public class Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.gmt_create
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.gmt_modified
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.creator
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private Integer creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.comment_count
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.view_count
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private Integer viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.like_count
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.tag
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private String tag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.body
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    private String body;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.gmt_create
     *
     * @return the value of article.gmt_create
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.gmt_create
     *
     * @param gmtCreate the value for article.gmt_create
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.gmt_modified
     *
     * @return the value of article.gmt_modified
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.gmt_modified
     *
     * @param gmtModified the value for article.gmt_modified
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.creator
     *
     * @return the value of article.creator
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.creator
     *
     * @param creator the value for article.creator
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.comment_count
     *
     * @return the value of article.comment_count
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.comment_count
     *
     * @param commentCount the value for article.comment_count
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.view_count
     *
     * @return the value of article.view_count
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.view_count
     *
     * @param viewCount the value for article.view_count
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.like_count
     *
     * @return the value of article.like_count
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.like_count
     *
     * @param likeCount the value for article.like_count
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.tag
     *
     * @return the value of article.tag
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.tag
     *
     * @param tag the value for article.tag
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.body
     *
     * @return the value of article.body
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.body
     *
     * @param body the value for article.body
     *
     * @mbg.generated Mon Sep 16 16:41:44 CST 2019
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}