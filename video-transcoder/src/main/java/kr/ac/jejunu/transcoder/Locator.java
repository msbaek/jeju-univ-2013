package kr.ac.jejunu.transcoder;

public class Locator {
    private static Locator instance;
    private JobQueue jobQueue;
    private Transcoder transcoder;

    public static Locator getInstance() {
        return instance;
    }

    public Locator(JobQueue jobQueue, Transcoder transcoder) {
        this.jobQueue = jobQueue;
        this.transcoder = transcoder;
    }

    public JobQueue getJobQueue() {
        return jobQueue;
    }


    public Transcoder getTranscoder() {
        return transcoder;
    }

    public static void init(Locator locator) {
        instance = locator;
    }
}
