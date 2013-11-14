package kr.ac.jejunu.transcoder;

public class Worker {

    private boolean running;

    public void run() {
        JobQueue jobQueue = null; // JobQueue가 필요하다
        Transcoder transcoder = null; // Transcoder가 필요하다

        while(running) {
            JobData jobData = jobQueue.get();
            transcoder.transcode(jobData.source(), jobData.target());
        }
    }
}
