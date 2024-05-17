/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author ZIPTECH LTD
 */
public class Group implements Serializable {
    private Integer groupId;
    private String name;
    private String description;
    private Employee theManager;

    public Group() {
    }

    public Group(Integer groupId, String name, String description, Employee theManager) {
        this.groupId = groupId;
        this.name = name;
        this.description = description;
        this.theManager = theManager;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getTheManager() {
        return theManager;
    }

    public void setTheManager(Employee theManager) {
        this.theManager = theManager;
    }
    
}
