package com.shop.web.entity;

public class User {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column user.id
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    private Integer id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column user.user_name
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    private String userName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column user.password
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    private String password;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column user.login_time
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    private Long loginTime;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column user.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    private Byte sysflag;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column user.login_time
     *
     * @return the value of user.login_time
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public Long getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column user.login_time
     *
     * @param loginTime the value for user.login_time
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column user.sysflag
     *
     * @return the value of user.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public Byte getSysflag() {
        return sysflag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column user.sysflag
     *
     * @param sysflag the value for user.sysflag
     *
     * @abatorgenerated Sat Dec 17 22:21:48 CST 2011
     */
    public void setSysflag(Byte sysflag) {
        this.sysflag = sysflag;
    }
}