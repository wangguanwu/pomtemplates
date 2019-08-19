package com.wgw.bean;

import java.util.Date;

public class Wgwuser extends BaseWgw{
    private Integer age;
    private Integer sex;
    private Integer id;
    private String departCode;
    private Integer status;
    private Date created;
    private Date updated;
    private String firstName;
    private String secondName;

    @Override
    public String toString() {

        return "Wgwuser{" +
                "age=" + age +
                ", sex=" + sex +
                ", id=" + id +
                ", departCode='" + departCode + '\'' +
                ", status=" + status +
                ", created=" + created +
                ", updated=" + updated +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public Wgwuser() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
