package com.auth.entity;

/**
 * Created by wang on 2017/8/14.
 */
public class Function {

    private long id;
    private String name;
    private long parentId;
    private String url;
    private int serialNum;
    private int accordion;

    @Override
    public String toString() {
        return "Function{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", url='" + url + '\'' +
                ", serialNum=" + serialNum +
                ", accordion=" + accordion +
                '}';
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getAccordion() {
        return accordion;
    }

    public void setAccordion(int accordion) {
        this.accordion = accordion;
    }


}
