package org.omeraran.model;

public class Linkedin extends LinkedinLoginModel {

  private String followingList = "https://www.linkedin.com/mynetwork/network-manager/people-follow/following/";
  private String companyList = "https://www.linkedin.com/mynetwork/network-manager/company/";
  private String followerList = "https://www.linkedin.com/mynetwork/network-manager/people-follow/followers/";
  private String clickToUnfollowDataControlName = "//*[@data-control-name='entity_action_primary']";
  private String clickToUnfollowSecond = "//*[@class='artdeco-modal__confirm-dialog-btn artdeco-button artdeco-button--2 artdeco-button--primary ember-view']";
  private int followerCount = 148;

  public Linkedin() {
  }

    public String getFollowingList() {
        return followingList;
    }

    public void setFollowingList(String followingList) {
        this.followingList = followingList;
    }

    public String getFollowerList() {
        return followerList;
    }

    public String getCompanyList() {
        return companyList;
    }

    public void setCompanyList(String companyList) {
        this.companyList = companyList;
    }

    public void setFollowerList(String followerList) {
        this.followerList = followerList;
    }

    public String getClickToUnfollowDataControlName() {
        return clickToUnfollowDataControlName;
    }

    public void setClickToUnfollowDataControlName(String clickToUnfollowDataControlName) {
        this.clickToUnfollowDataControlName = clickToUnfollowDataControlName;
    }

    public String getClickToUnfollowSecond() {
        return clickToUnfollowSecond;
    }

    public void setClickToUnfollowSecond(String clickToUnfollowSecond) {
        this.clickToUnfollowSecond = clickToUnfollowSecond;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }
}
