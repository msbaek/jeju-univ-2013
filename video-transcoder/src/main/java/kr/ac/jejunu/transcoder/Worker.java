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
        int counter = 1;
        while (running) {
            if (counter++ >= 10)
                running = false;
            JobData jobData = jobQueue.get();
            transcoder.transcode(jobData.source(), jobData.target());
        }
    }
}
