/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobs.services;
import java.util.ArrayList;
import jobs.models.Jobs;
import jobs.models.JobCategory.JobType;

/**
 *
 * @author isi
 */
public class JobService {
    private ArrayList<Jobs> jobs = new ArrayList<>();

    public ArrayList<Jobs> getJobs() {
        return jobs;
    }
    public ArrayList<Jobs> getJobs(JobType category) {
      ArrayList<Jobs> jobtype = new ArrayList<>();
        for (int i = 0; i < jobs.size(); i++) {
            if(jobs.get(i).getJobType() == category){
                jobtype.add(jobs.get(i));
            }
        }
        return jobtype;
    }
    public JobService(){
        jobs.add(new Jobs("Back-end Java developer", JobType.FullTime));
        jobs.add(new Jobs("Front-end Web developer", JobType.PartTime));
        jobs.add(new Jobs("Asp.net developer", JobType.Contractor));
        jobs.add(new Jobs("Unity developer", JobType.PartTime));
        jobs.add(new Jobs("User Experience designer", JobType.Contractor));
        jobs.add(new Jobs("Databas admin", JobType.FullTime));
        jobs.add(new Jobs("Project Manager", JobType.FullTime));
    }
   
}
