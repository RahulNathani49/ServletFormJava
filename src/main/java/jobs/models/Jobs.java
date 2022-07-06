/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobs.models;

import jobs.models.JobCategory.JobType;

/**
 *
 * @author isi
 */
public class Jobs {
    private String title;
    JobType jobType;
    public Jobs(String title,JobType jobtype){
        if (title==null || title=="")
            throw new IllegalArgumentException("Title cant be blank or null");
        this.title = title;
        this.jobType = jobtype;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title==null || title=="")
            throw new IllegalArgumentException("Title cant be blank or null");
        this.title = title;
    }
    public JobType getJobType() {
        return this.jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return "Type : "+title+" "+jobType;
    }
    
}
