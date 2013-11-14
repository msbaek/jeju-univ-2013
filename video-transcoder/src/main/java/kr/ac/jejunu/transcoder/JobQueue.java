package kr.ac.jejunu.transcoder;

public class JobQueue {
    public void add(JobData jobData) {
        throw new IllegalStateException("kr.ac.jejunu.transcoder.JobQueue#add not implemented yet");
    }

    public JobData get() {
        System.out.println("JobQueue#get() called");
        return new JobData("", "");
    }
}
