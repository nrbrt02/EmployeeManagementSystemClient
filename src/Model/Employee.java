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
public class Employee implements Serializable{
    private Integer employeeId;
    private String names;
    private String Address;
    private String Email;
    private String phone;
    private Department theDepartment;
    private Position thePosition;

    public Employee() {
    }

    public Employee(Integer employeeId, String names, String Address, String Email, String phone, Department theDepartment, Position thePosition) {
        this.employeeId = employeeId;
        this.names = names;
        this.Address = Address;
        this.Email = Email;
        this.phone = phone;
        this.theDepartment = theDepartment;
        this.thePosition = thePosition;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Department getTheDepartment() {
        return theDepartment;
    }

    public void setTheDepartment(Department theDepartment) {
        this.theDepartment = theDepartment;
    }

    public Position getThePosition() {
        return thePosition;
    }

    public void setThePosition(Position thePosition) {
        this.thePosition = thePosition;
    }
    
    
}
