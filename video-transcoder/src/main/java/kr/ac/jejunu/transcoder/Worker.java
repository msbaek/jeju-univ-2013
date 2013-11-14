package kr.ac.jejunu.transcoder;

public class Worker {

    private boolean running = true;

    public void run() {
        JobQueue jobQueue = Locator.getInstance().getJobQueue();
        Transcoder transcoder = Locator.getInstance().getTranscoder();

        while(running) {
            JobData jobData = jobQueue.get();
            transcoder.transcode(jobData.source(), jobData.target());
        }
    }
}
