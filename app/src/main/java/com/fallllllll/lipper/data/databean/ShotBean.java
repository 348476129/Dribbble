package com.fallllllll.lipper.data.databean;

import com.fallllllll.lipper.data.local.user.LipperUser;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fallllllll on 2017/3/8.
 * GitHub :  https://github.com/348476129/Lipper
 */

public class ShotBean implements Serializable{


    /**
     * id : 3332372
     * title : Running On Empty
     * description : <p>(Watch x2) My submission for <a href="http://www.projectexhibita.com/" rel="nofollow noreferrer">Exhibit .A</a> - an online gallery platform. Glad to be among very talented artists.
     <br />See the video with sound <a href="https://vimeo.com/206365849" rel="nofollow noreferrer">HERE</a></p>

     <p>Follow me on:
     <br /><a href="https://www.facebook.com/Eran-Mendel-Illustrator-animator-771165769578080/?ref=aymt_homepage_panel" rel="nofollow noreferrer">Facebook</a> | <a href="https://vimeo.com/eranmendel" rel="nofollow noreferrer">Vimeo</a> | <a href="http://eranmendel.com/" rel="nofollow noreferrer">Site</a> | <a href="https://www.instagram.com/eranmendel/" rel="nofollow noreferrer">Instagram</a> </p>
     * width : 400
     * height : 300
     * images : {"hidpi":"https://d13yacurqjgara.cloudfront.net/users/244516/screenshots/3332372/running_on_empty_eran_mendel_dribbble_gif.gif","normal":"https://d13yacurqjgara.cloudfront.net/users/244516/screenshots/3332372/running_on_empty_eran_mendel_dribbble_gif_1x.gif","teaser":"https://d13yacurqjgara.cloudfront.net/users/244516/screenshots/3332372/running_on_empty_eran_mendel_dribbble_gif_teaser.gif"}
     * views_count : 9786
     * likes_count : 1025
     * comments_count : 68
     * attachments_count : 0
     * rebounds_count : 1
     * buckets_count : 98
     * created_at : 2017-03-02T07:25:05Z
     * updated_at : 2017-03-06T06:53:53Z
     * html_url : https://dribbble.com/shots/3332372-Running-On-Empty
     * attachments_url : https://api.dribbble.com/v1/shots/3332372/attachments
     * buckets_url : https://api.dribbble.com/v1/shots/3332372/buckets
     * comments_url : https://api.dribbble.com/v1/shots/3332372/comments
     * likes_url : https://api.dribbble.com/v1/shots/3332372/likes
     * projects_url : https://api.dribbble.com/v1/shots/3332372/projects
     * rebounds_url : https://api.dribbble.com/v1/shots/3332372/rebounds
     * animated : true
     * tags : ["bicycle","bike","character","gif","loop","running","sport","swim","tv"]
     * user : {"id":244516,"name":"Eran Mendel","username":"eranmendel","html_url":"https://dribbble.com/eranmendel","avatar_url":"https://d13yacurqjgara.cloudfront.net/users/244516/avatars/normal/profile_photo.jpg?1373124977","bio":"Animation director and designer\nContact me about new projects at : eranmendel@gmail.com\n <a href=\"http://www.eranmendel.com/\" rel=\"nofollow noreferrer\">eranmendel.com<\/a>","location":"Israel","links":{"web":"http://www.eranmendel.com/"},"buckets_count":4,"comments_received_count":1617,"followers_count":7859,"followings_count":271,"likes_count":767,"likes_received_count":30170,"projects_count":2,"rebounds_received_count":43,"shots_count":124,"teams_count":0,"can_upload_shot":true,"type":"Player","pro":true,"buckets_url":"https://api.dribbble.com/v1/users/244516/buckets","followers_url":"https://api.dribbble.com/v1/users/244516/followers","following_url":"https://api.dribbble.com/v1/users/244516/following","likes_url":"https://api.dribbble.com/v1/users/244516/likes","projects_url":"https://api.dribbble.com/v1/users/244516/projects","shots_url":"https://api.dribbble.com/v1/users/244516/shots","teams_url":"https://api.dribbble.com/v1/users/244516/teams","created_at":"2012-11-29T21:42:50Z","updated_at":"2017-03-08T02:00:49Z"}
     * team : null
     * rebound_source_url : https://api.dribbble.com/v1/shots/3303596
     */

    private String id;
    private String title;
    private String description;
    private String width;
    private String height;
    private ImagesBean images;
    private String views_count;
    private String likes_count;
    private String comments_count;
    private String attachments_count;
    private String rebounds_count;
    private String buckets_count;
    private String created_at;
    private String updated_at;
    private String html_url;
    private String attachments_url;
    private String buckets_url;
    private String comments_url;
    private String likes_url;
    private String projects_url;
    private String rebounds_url;
    private boolean animated;
    private LipperUser user;
    private TeamBean team;
    private String rebound_source_url;
    private List<String> tags;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getViews_count() {
        return views_count;
    }

    public void setViews_count(String views_count) {
        this.views_count = views_count;
    }

    public String getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(String likes_count) {
        this.likes_count = likes_count;
    }

    public String getComments_count() {
        return comments_count;
    }

    public void setComments_count(String comments_count) {
        this.comments_count = comments_count;
    }

    public String getAttachments_count() {
        return attachments_count;
    }

    public void setAttachments_count(String attachments_count) {
        this.attachments_count = attachments_count;
    }

    public String getRebounds_count() {
        return rebounds_count;
    }

    public void setRebounds_count(String rebounds_count) {
        this.rebounds_count = rebounds_count;
    }

    public String getBuckets_count() {
        return buckets_count;
    }

    public void setBuckets_count(String buckets_count) {
        this.buckets_count = buckets_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getAttachments_url() {
        return attachments_url;
    }

    public void setAttachments_url(String attachments_url) {
        this.attachments_url = attachments_url;
    }

    public String getBuckets_url() {
        return buckets_url;
    }

    public void setBuckets_url(String buckets_url) {
        this.buckets_url = buckets_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getLikes_url() {
        return likes_url;
    }

    public void setLikes_url(String likes_url) {
        this.likes_url = likes_url;
    }

    public String getProjects_url() {
        return projects_url;
    }

    public void setProjects_url(String projects_url) {
        this.projects_url = projects_url;
    }

    public String getRebounds_url() {
        return rebounds_url;
    }

    public void setRebounds_url(String rebounds_url) {
        this.rebounds_url = rebounds_url;
    }

    public boolean isAnimated() {
        return animated;
    }

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    public LipperUser getUser() {
        return user;
    }

    public void setUser(LipperUser user) {
        this.user = user;
    }

    public TeamBean getTeam() {
        return team;
    }

    public void setTeam(TeamBean team) {
        this.team = team;
    }

    public String getRebound_source_url() {
        return rebound_source_url;
    }

    public void setRebound_source_url(String rebound_source_url) {
        this.rebound_source_url = rebound_source_url;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

}
