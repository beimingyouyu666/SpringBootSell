package com.yangk.sell.model;

import lombok.Data;

import javax.persistence.*;

@Table(name = "`student`")
@Data
public class Student {
    @Id
    @Column(name = "`stu_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer stuId;

    @Column(name = "`stu_name`")
    private String stuName;

    /**
     * @return stu_id
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * @param stuId
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * @return stu_name
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * @param stuName
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}