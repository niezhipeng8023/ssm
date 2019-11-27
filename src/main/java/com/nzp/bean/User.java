package com.nzp.bean;

import java.util.Date;
import java.util.Objects;

public class User {
    private Integer id;

    private String username;

    private String usercode;

    private String password;

    private String phone;

    private String mark;

    private Integer status;

    private Date lastlogin;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", usercode='" + usercode + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", mark='" + mark + '\'' +
                ", status=" + status +
                ", lastlogin=" + lastlogin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(usercode, user.usercode) &&
                Objects.equals(password, user.password) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(mark, user.mark) &&
                Objects.equals(status, user.status) &&
                Objects.equals(lastlogin, user.lastlogin);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, usercode, password, phone, mark, status, lastlogin);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

}