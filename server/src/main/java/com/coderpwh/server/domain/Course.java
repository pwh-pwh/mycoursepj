package com.coderpwh.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
    * 课程表
    */
@TableName(value = "course")
public class Course {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 概述
     */
    @TableField(value = "summary")
    private String summary;

    /**
     * 时长|单位秒
     */
    @TableField(value = "`time`")
    private Integer time;

    /**
     * 价格（元）
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 封面
     */
    @TableField(value = "image")
    private String image;

    /**
     * 级别|ONE(1,初级),TWO(2,中级),THREE(3,高级）
     */
    @TableField(value = "`level`")
    private String level;

    /**
     * 收费|CHGRGE(C,收费),FREE(F,免费）
     */
    @TableField(value = "charge")
    private String charge;

    /**
     * 状态|PUBLISH(P,发布），DRAFT（D,草稿)
     */
    @TableField(value = "`status`")
    private String status;

    /**
     * 报名数
     */
    @TableField(value = "enroll")
    private Integer enroll;

    /**
     * 顺序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 创建时间
     */
    @TableField(value = "create_at")
    private Date createAt;

    /**
     * 修改时间
     */
    @TableField(value = "updated_at")
    private Date updatedAt;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_SUMMARY = "summary";

    public static final String COL_TIME = "time";

    public static final String COL_PRICE = "price";

    public static final String COL_IMAGE = "image";

    public static final String COL_LEVEL = "level";

    public static final String COL_CHARGE = "charge";

    public static final String COL_STATUS = "status";

    public static final String COL_ENROLL = "enroll";

    public static final String COL_SORT = "sort";

    public static final String COL_CREATE_AT = "create_at";

    public static final String COL_UPDATED_AT = "updated_at";

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取概述
     *
     * @return summary - 概述
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置概述
     *
     * @param summary 概述
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取时长|单位秒
     *
     * @return time - 时长|单位秒
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置时长|单位秒
     *
     * @param time 时长|单位秒
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 获取价格（元）
     *
     * @return price - 价格（元）
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格（元）
     *
     * @param price 价格（元）
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取封面
     *
     * @return image - 封面
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置封面
     *
     * @param image 封面
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取级别|ONE(1,初级),TWO(2,中级),THREE(3,高级）
     *
     * @return level - 级别|ONE(1,初级),TWO(2,中级),THREE(3,高级）
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置级别|ONE(1,初级),TWO(2,中级),THREE(3,高级）
     *
     * @param level 级别|ONE(1,初级),TWO(2,中级),THREE(3,高级）
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取收费|CHGRGE(C,收费),FREE(F,免费）
     *
     * @return charge - 收费|CHGRGE(C,收费),FREE(F,免费）
     */
    public String getCharge() {
        return charge;
    }

    /**
     * 设置收费|CHGRGE(C,收费),FREE(F,免费）
     *
     * @param charge 收费|CHGRGE(C,收费),FREE(F,免费）
     */
    public void setCharge(String charge) {
        this.charge = charge;
    }

    /**
     * 获取状态|PUBLISH(P,发布），DRAFT（D,草稿)
     *
     * @return status - 状态|PUBLISH(P,发布），DRAFT（D,草稿)
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态|PUBLISH(P,发布），DRAFT（D,草稿)
     *
     * @param status 状态|PUBLISH(P,发布），DRAFT（D,草稿)
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取报名数
     *
     * @return enroll - 报名数
     */
    public Integer getEnroll() {
        return enroll;
    }

    /**
     * 设置报名数
     *
     * @param enroll 报名数
     */
    public void setEnroll(Integer enroll) {
        this.enroll = enroll;
    }

    /**
     * 获取顺序
     *
     * @return sort - 顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置顺序
     *
     * @param sort 顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取创建时间
     *
     * @return create_at - 创建时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置创建时间
     *
     * @param createAt 创建时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取修改时间
     *
     * @return updated_at - 修改时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt 修改时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", summary=").append(summary);
        sb.append(", time=").append(time);
        sb.append(", price=").append(price);
        sb.append(", image=").append(image);
        sb.append(", level=").append(level);
        sb.append(", charge=").append(charge);
        sb.append(", status=").append(status);
        sb.append(", enroll=").append(enroll);
        sb.append(", sort=").append(sort);
        sb.append(", createAt=").append(createAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append("]");
        return sb.toString();
    }
}