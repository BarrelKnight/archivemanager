package pers.noxcode.archivemanager.data.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author van人之雄
 * @version 1.0
 * @date 2021.09.19
 * 游戏存档实体
 */

public class Archive implements Serializable {
    public static final long serialVersionUID = 2L;
    /**
     * 存档的id
     */
    private int id;
    /**
     * 对应游戏的id
     */
    private int gameId;
    /**
     * 版本号
     */
    private String version;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 存档的大小
     */
    private String size;
    /**
     * 上传的日期
     */
    private Date update;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }
}
