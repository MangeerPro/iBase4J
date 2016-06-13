package org.ibase4j.model.generator;

import java.io.Serializable;
import java.util.Date;

public class TaskScheduler implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.id_
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.group_id
     *
     * @mbggenerated
     */
    private Integer groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.task_name
     *
     * @mbggenerated
     */
    private String taskName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.task_type
     *
     * @mbggenerated
     */
    private String taskType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.task_desc
     *
     * @mbggenerated
     */
    private String taskDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.task_cron
     *
     * @mbggenerated
     */
    private String taskCron;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.task_previous_fire_time
     *
     * @mbggenerated
     */
    private Date taskPreviousFireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.task_next_fire_time
     *
     * @mbggenerated
     */
    private Date taskNextFireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.enable_
     *
     * @mbggenerated
     */
    private Integer enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.create_by
     *
     * @mbggenerated
     */
    private Integer createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_scheduler.update_by
     *
     * @mbggenerated
     */
    private Integer updateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_scheduler
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.id_
     *
     * @return the value of task_scheduler.id_
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.id_
     *
     * @param id the value for task_scheduler.id_
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.group_id
     *
     * @return the value of task_scheduler.group_id
     *
     * @mbggenerated
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.group_id
     *
     * @param groupId the value for task_scheduler.group_id
     *
     * @mbggenerated
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.task_name
     *
     * @return the value of task_scheduler.task_name
     *
     * @mbggenerated
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.task_name
     *
     * @param taskName the value for task_scheduler.task_name
     *
     * @mbggenerated
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.task_type
     *
     * @return the value of task_scheduler.task_type
     *
     * @mbggenerated
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.task_type
     *
     * @param taskType the value for task_scheduler.task_type
     *
     * @mbggenerated
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.task_desc
     *
     * @return the value of task_scheduler.task_desc
     *
     * @mbggenerated
     */
    public String getTaskDesc() {
        return taskDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.task_desc
     *
     * @param taskDesc the value for task_scheduler.task_desc
     *
     * @mbggenerated
     */
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc == null ? null : taskDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.task_cron
     *
     * @return the value of task_scheduler.task_cron
     *
     * @mbggenerated
     */
    public String getTaskCron() {
        return taskCron;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.task_cron
     *
     * @param taskCron the value for task_scheduler.task_cron
     *
     * @mbggenerated
     */
    public void setTaskCron(String taskCron) {
        this.taskCron = taskCron == null ? null : taskCron.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.task_previous_fire_time
     *
     * @return the value of task_scheduler.task_previous_fire_time
     *
     * @mbggenerated
     */
    public Date getTaskPreviousFireTime() {
        return taskPreviousFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.task_previous_fire_time
     *
     * @param taskPreviousFireTime the value for task_scheduler.task_previous_fire_time
     *
     * @mbggenerated
     */
    public void setTaskPreviousFireTime(Date taskPreviousFireTime) {
        this.taskPreviousFireTime = taskPreviousFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.task_next_fire_time
     *
     * @return the value of task_scheduler.task_next_fire_time
     *
     * @mbggenerated
     */
    public Date getTaskNextFireTime() {
        return taskNextFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.task_next_fire_time
     *
     * @param taskNextFireTime the value for task_scheduler.task_next_fire_time
     *
     * @mbggenerated
     */
    public void setTaskNextFireTime(Date taskNextFireTime) {
        this.taskNextFireTime = taskNextFireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.enable_
     *
     * @return the value of task_scheduler.enable_
     *
     * @mbggenerated
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.enable_
     *
     * @param enable the value for task_scheduler.enable_
     *
     * @mbggenerated
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.create_time
     *
     * @return the value of task_scheduler.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.create_time
     *
     * @param createTime the value for task_scheduler.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.create_by
     *
     * @return the value of task_scheduler.create_by
     *
     * @mbggenerated
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.create_by
     *
     * @param createBy the value for task_scheduler.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.update_time
     *
     * @return the value of task_scheduler.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.update_time
     *
     * @param updateTime the value for task_scheduler.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_scheduler.update_by
     *
     * @return the value of task_scheduler.update_by
     *
     * @mbggenerated
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_scheduler.update_by
     *
     * @param updateBy the value for task_scheduler.update_by
     *
     * @mbggenerated
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_scheduler
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupId=").append(groupId);
        sb.append(", taskName=").append(taskName);
        sb.append(", taskType=").append(taskType);
        sb.append(", taskDesc=").append(taskDesc);
        sb.append(", taskCron=").append(taskCron);
        sb.append(", taskPreviousFireTime=").append(taskPreviousFireTime);
        sb.append(", taskNextFireTime=").append(taskNextFireTime);
        sb.append(", enable=").append(enable);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_scheduler
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TaskScheduler other = (TaskScheduler) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getTaskName() == null ? other.getTaskName() == null : this.getTaskName().equals(other.getTaskName()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getTaskDesc() == null ? other.getTaskDesc() == null : this.getTaskDesc().equals(other.getTaskDesc()))
            && (this.getTaskCron() == null ? other.getTaskCron() == null : this.getTaskCron().equals(other.getTaskCron()))
            && (this.getTaskPreviousFireTime() == null ? other.getTaskPreviousFireTime() == null : this.getTaskPreviousFireTime().equals(other.getTaskPreviousFireTime()))
            && (this.getTaskNextFireTime() == null ? other.getTaskNextFireTime() == null : this.getTaskNextFireTime().equals(other.getTaskNextFireTime()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_scheduler
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getTaskDesc() == null) ? 0 : getTaskDesc().hashCode());
        result = prime * result + ((getTaskCron() == null) ? 0 : getTaskCron().hashCode());
        result = prime * result + ((getTaskPreviousFireTime() == null) ? 0 : getTaskPreviousFireTime().hashCode());
        result = prime * result + ((getTaskNextFireTime() == null) ? 0 : getTaskNextFireTime().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        return result;
    }
}