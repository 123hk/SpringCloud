package com.demo.atom.api.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 平台用户表
 */
public class PlatformUser extends BaseModel{

    /**主键*/
    private String keyID;
    /**用户名*/
    private String userName;
    /**用户密码*/
    private String userPass;
    /**真实姓名*/
    private String trueName;
    /**最近登录IP*/
    private String loginIP;
    /**最近登录时间*/
    private Date loginTime;
    /**登录次数*/
    private int loginTimes;
    /**是否禁用*/
    private boolean isDisable;
    /**添加人*/
    private String addUser;
    /**添加时间*/
    private Date addTime;
    /**更新人*/
    private String modifyUser;
    /**更新时间*/
    private Timestamp modifyTime;

    public PlatformUser() {
    }

    public PlatformUser(String keyID, String userName, String userPass, String trueName, String loginIP, Date loginTime, int loginTimes, boolean isDisable, String addUser, Date addTime, String modifyUser, Timestamp modifyTime) {
        this.keyID = keyID;
        this.userName = userName;
        this.userPass = userPass;
        this.trueName = trueName;
        this.loginIP = loginIP;
        this.loginTime = loginTime;
        this.loginTimes = loginTimes;
        this.isDisable = isDisable;
        this.addUser = addUser;
        this.addTime = addTime;
        this.modifyUser = modifyUser;
        this.modifyTime = modifyTime;
    }

    public String getKeyID() {
        return keyID;
    }

    public void setKeyID(String keyID) {
        this.keyID = keyID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getLoginIP() {
        return loginIP;
    }

    public void setLoginIP(String loginIP) {
        this.loginIP = loginIP;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public int getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    public boolean getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(boolean isDisable) {
        this.isDisable = isDisable;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

}
