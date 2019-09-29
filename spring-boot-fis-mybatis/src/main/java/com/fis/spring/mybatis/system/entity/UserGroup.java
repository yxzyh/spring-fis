package com.fis.spring.mybatis.system.entity;

public class UserGroup {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 组uuid
     */
    private String group_id;

    /**
     * 组别名字
     */
    private String group_name;

    /**
     * base_userinfo 关联的id字段
     */
    private Integer user_id;

    /**
     * 公司id字段
     */
    private Integer company_id;

    /**
     * 创建时间
     */
    private Integer create_time;

    /**
     * 创建人id
     */
    private Integer create_user;

    /**
     * 修改时间
     */
    private Integer update_time;

    /**
     * 修改人id
     */
    private Integer update_user;

    /**
     * 自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 组uuid
     */
    public String getGroup_id() {
        return group_id;
    }

    /**
     * 组uuid
     */
    public void setGroup_id(String group_id) {
        this.group_id = group_id == null ? null : group_id.trim();
    }

    /**
     * 组别名字
     */
    public String getGroup_name() {
        return group_name;
    }

    /**
     * 组别名字
     */
    public void setGroup_name(String group_name) {
        this.group_name = group_name == null ? null : group_name.trim();
    }

    /**
     * base_userinfo 关联的id字段
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * base_userinfo 关联的id字段
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * 公司id字段
     */
    public Integer getCompany_id() {
        return company_id;
    }

    /**
     * 公司id字段
     */
    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    /**
     * 创建时间
     */
    public Integer getCreate_time() {
        return create_time;
    }

    /**
     * 创建时间
     */
    public void setCreate_time(Integer create_time) {
        this.create_time = create_time;
    }

    /**
     * 创建人id
     */
    public Integer getCreate_user() {
        return create_user;
    }

    /**
     * 创建人id
     */
    public void setCreate_user(Integer create_user) {
        this.create_user = create_user;
    }

    /**
     * 修改时间
     */
    public Integer getUpdate_time() {
        return update_time;
    }

    /**
     * 修改时间
     */
    public void setUpdate_time(Integer update_time) {
        this.update_time = update_time;
    }

    /**
     * 修改人id
     */
    public Integer getUpdate_user() {
        return update_user;
    }

    /**
     * 修改人id
     */
    public void setUpdate_user(Integer update_user) {
        this.update_user = update_user;
    }
}