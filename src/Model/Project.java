/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ZIPTECH LTD
 */
public class Project implements Serializable{
    private Integer projectId;
    private String name;
    private Date startDate;
    private Date endDate;
    private String description;
    private String status;
    private Set<Assignment> assignements;

    public Project() {
    }

    public Project(Integer projectId, String name, Date startDate, Date endDate, String description, String status, Set<Assignment> assignements) {
        this.projectId = projectId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.status = status;
        this.assignements = assignements;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Assignment> getAssignements() {
        return assignements;
    }

    public void setAssignements(Set<Assignment> assignements) {
        this.assignements = assignements;
    }
    
    
}
