package coms.example.epicchatagram.model;

import java.util.HashMap;

public class FollowDTO {
    private int followerCount;
    private HashMap<String, Boolean> followers;
    private int followingCount;
    private HashMap<String, Boolean> followings;

    public FollowDTO(int followerCount, HashMap<String, Boolean> followers, int followingCount, HashMap<String, Boolean> followings) {
        this.followerCount = followerCount;
        this.followers = followers;
        this.followingCount = followingCount;
        this.followings = followings;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public HashMap<String, Boolean> getFollowers() {
        return followers;
    }

    public void setFollowers(HashMap<String, Boolean> followers) {
        this.followers = followers;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public HashMap<String, Boolean> getFollowings() {
        return followings;
    }

    public void setFollowings(HashMap<String, Boolean> followings) {
        this.followings = followings;
    }
}
