package org.omeraran.model;

public class LinkedinLoginModel {

    private String loginUsernameId = "username";
    private String loginPasswordId = "password";
    private String loginUsername="xxx@gmail.com";
    private String loginPassword="password";
    private String signInUrl = "https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fmynetwork%2Fnetwork-manager%2Fpeople-follow%2Ffollowers%2F&fromSignIn=true&trk=cold_join_sign_in";
    private String loginClick = "//*[@class='btn__primary--large from__button--floating']";

    public LinkedinLoginModel() {
    }

    public String getLoginUsernameId() {
        return loginUsernameId;
    }

    public void setLoginUsernameId(String loginUsernameId) {
        this.loginUsernameId = loginUsernameId;
    }

    public String getLoginPasswordId() {
        return loginPasswordId;
    }

    public void setLoginPasswordId(String loginPasswordId) {
        this.loginPasswordId = loginPasswordId;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getSignInUrl() {
        return signInUrl;
    }

    public void setSignInUrl(String signInUrl) {
        this.signInUrl = signInUrl;
    }

    public String getLoginClick() {
        return loginClick;
    }

    public void setLoginClick(String loginClick) {
        this.loginClick = loginClick;
    }
}
