/*Domain class of table m_prj_standup*/
package com.esofthead.mycollab.module.project.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@com.esofthead.mycollab.core.db.metadata.Table("m_prj_standup")
class StandupReport extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.id
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.sAccountId
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.projectId
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("projectId")
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.forday
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("forday")
    private Date forday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.logBy
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("logBy")
    private String logby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.createdTime
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_standup.lastUpdatedTime
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.id
     *
     * @return the value of m_prj_standup.id
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.id
     *
     * @param id the value for m_prj_standup.id
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.sAccountId
     *
     * @return the value of m_prj_standup.sAccountId
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.sAccountId
     *
     * @param saccountid the value for m_prj_standup.sAccountId
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.projectId
     *
     * @return the value of m_prj_standup.projectId
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.projectId
     *
     * @param projectid the value for m_prj_standup.projectId
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.forday
     *
     * @return the value of m_prj_standup.forday
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public Date getForday() {
        return forday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.forday
     *
     * @param forday the value for m_prj_standup.forday
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public void setForday(Date forday) {
        this.forday = forday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.logBy
     *
     * @return the value of m_prj_standup.logBy
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public String getLogby() {
        return logby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.logBy
     *
     * @param logby the value for m_prj_standup.logBy
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public void setLogby(String logby) {
        this.logby = logby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.createdTime
     *
     * @return the value of m_prj_standup.createdTime
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.createdTime
     *
     * @param createdtime the value for m_prj_standup.createdTime
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_standup.lastUpdatedTime
     *
     * @return the value of m_prj_standup.lastUpdatedTime
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_standup.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_standup.lastUpdatedTime
     *
     * @mbggenerated Thu Apr 03 11:05:06 ICT 2014
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }
}