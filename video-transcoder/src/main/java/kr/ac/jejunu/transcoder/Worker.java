package kr.ac.jejunu.transcoder;

public class Worker {
    private boolean running = true;
    private JobQueue jobQueue;
    private Transcoder transcoder;

    public Worker(JobQueue jobQueue, Transcoder transcoder) {
        this.jobQueue = jobQueue;
        this.transcoder = transcoder;
    }

    public void run() {
        while(running) {
            JobData jobData = jobQueue.get();
            transcoder.transcode(jobData.source(), jobData.target());
        }
    }
}
