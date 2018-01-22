package org.maker.pojo;

import java.io.Serializable;

public class Picthemes  implements Serializable {
    private Integer picthemeid;

    private Integer picgroupid;

    private Integer pictypeid;

    public Integer getPicthemeid() {
        return picthemeid;
    }

    public void setPicthemeid(Integer picthemeid) {
        this.picthemeid = picthemeid;
    }

    public Integer getPicgroupid() {
        return picgroupid;
    }

    public void setPicgroupid(Integer picgroupid) {
        this.picgroupid = picgroupid;
    }

    public Integer getPictypeid() {
        return pictypeid;
    }

    public void setPictypeid(Integer pictypeid) {
        this.pictypeid = pictypeid;
    }
}