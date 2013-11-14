package kr.ac.jejunu.transcoder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WorkerTest {
    @Test
    public void should_get_from_jobqueue_and_transcode() {
        int counter = 1;
        int count = 10;
        boolean running = true;
        while (running) {
            if (counter++ >= count)
                running = false;
            JobData jobData = dequeue();
            transcode(jobData.source(), jobData.target());
        }
    }
}
