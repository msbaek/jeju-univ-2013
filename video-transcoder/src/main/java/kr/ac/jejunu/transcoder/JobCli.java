package kr.ac.jejunu.transcoder;

public class JobCli {
    public void interact() {
        JobQueue jobQueue = null; // JobQueue가 필요하다
        String source = null;
        String target = null;
        jobQueue.add(new JobData(source, target));
    }
}
