package kr.ac.jejunu.transcoder;

import kr.ac.jejunu.ffmpegetranscoder.FfmpegTranscoder;
import kr.ac.jejunu.filejobqueu.FileJobQueue;
import org.junit.Before;
import org.junit.Test;

public class WorkerTest {
    private Worker worker;

    @Before
    public void setup() {
        JobQueue jobqueue = new FileJobQueue();
        Transcoder transcoder = new FfmpegTranscoder();
        worker = new Worker(jobqueue, transcoder);
    }

    @Test
    public void should_get_from_jobqueue_and_transcode() {
        worker.run();
    }
}
