package pers.noxcode.archivemanager.data.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author van人之雄
 * @version 1.0
 * @date 2021.09.19
 * 代表一个游戏实体
 */
@SuppressWarnings("unused")
public class Game implements Serializable {

    public static final long serialVersionUID = 1L;
    /**
     * 游戏id
     */
    private int id;
    /**
     * 游戏的正式名字
     */
    private String name;
    /**
     * 游戏的俗名
     */
    private String commonName;
    /**
     * 游戏的版本
     */
    private String version;
    /**
     * 游戏的大小
     */
    private String size;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 最后的跟新日期
     */
    private Date updateDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
