package com.coderpwh.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
    * 小节
    */
@TableName(value = "`section`")
public class Section {
    /**
     * ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 课程ID
     */
    @TableField(value = "course_id")
    private String courseId;

    /**
     * 大章ID
     */
    @TableField(value = "chapter_id")
    private String chapterId;

    /**
     * 视频
     */
    @TableField(value = "video")
    private String video;

    /**
     * 时长
     */
    @TableField(value = "`time`")
    private Integer time;

    /**
     * 收费|C 收费;F 免费
     */
    @TableField(value = "charge")
    private String charge;

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

    public static final String COL_TITLE = "title";

    public static final String COL_COURSE_ID = "course_id";

    public static final String COL_CHAPTER_ID = "chapter_id";

    public static final String COL_VIDEO = "video";

    public static final String COL_TIME = "time";

    public static final String COL_CHARGE = "charge";

    public static final String COL_SORT = "sort";

    public static final String COL_CREATE_AT = "create_at";

    public static final String COL_UPDATED_AT = "updated_at";

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取课程ID
     *
     * @return course_id - 课程ID
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * 设置课程ID
     *
     * @param courseId 课程ID
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * 获取大章ID
     *
     * @return chapter_id - 大章ID
     */
    public String getChapterId() {
        return chapterId;
    }

    /**
     * 设置大章ID
     *
     * @param chapterId 大章ID
     */
    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * 获取视频
     *
     * @return video - 视频
     */
    public String getVideo() {
        return video;
    }

    /**
     * 设置视频
     *
     * @param video 视频
     */
    public void setVideo(String video) {
        this.video = video;
    }

    /**
     * 获取时长
     *
     * @return time - 时长
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置时长
     *
     * @param time 时长
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 获取收费|C 收费;F 免费
     *
     * @return charge - 收费|C 收费;F 免费
     */
    public String getCharge() {
        return charge;
    }

    /**
     * 设置收费|C 收费;F 免费
     *
     * @param charge 收费|C 收费;F 免费
     */
    public void setCharge(String charge) {
        this.charge = charge;
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
        sb.append(", title=").append(title);
        sb.append(", courseId=").append(courseId);
        sb.append(", chapterId=").append(chapterId);
        sb.append(", video=").append(video);
        sb.append(", time=").append(time);
        sb.append(", charge=").append(charge);
        sb.append(", sort=").append(sort);
        sb.append(", createAt=").append(createAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append("]");
        return sb.toString();
    }
}