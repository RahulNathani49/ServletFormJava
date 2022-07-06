/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobs.models;

import java.security.AllPermission;

/**
 *
 * @author isi
 */
public class JobCategory {
    public enum JobType{
        All,
        FullTime,
        PartTime,
        Contractor
    }
    public JobType[] getAllTypes(){
        return JobType.values();
    }
}
