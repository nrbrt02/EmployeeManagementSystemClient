/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author ZIPTECH LTD
 */
public class Attendance implements Serializable {

    private Integer attendanceId;
    private Date date;
    private Date inTime;
    private Date outTime;
    private long totalTime;
    private Employee theEmployee;

    public Attendance() {
    }

    public Attendance(Integer id, Date date, Date inTime, Date outTime, long totalTime, Employee theEmployee) {
        this.attendanceId = id;
        this.date = date;
        this.inTime = inTime;
        this.outTime = outTime;
        this.totalTime = totalTime;
        this.theEmployee = theEmployee;
    }

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public Employee getTheEmployee() {
        return theEmployee;
    }

    public void setTheEmployee(Employee theEmployee) {
        this.theEmployee = theEmployee;
    }
}
