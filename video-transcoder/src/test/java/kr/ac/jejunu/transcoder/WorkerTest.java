package kr.ac.jejunu.transcoder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(MockitoJUnitRunner.class)
public class WorkerTest {
    @Mock JobQueue jobQueue;
    @Mock Transcoder transcoder;
    @Spy private JobData jobData = new JobData("", "");

    private Worker worker;

    @Before
    public void setup() {
        worker = new Worker(jobQueue, transcoder);
    }

    @Test
    public void should_get_from_jobqueue_and_transcode() {
        doReturn(jobData).when(jobQueue).get();

        worker.run();

        verify(jobQueue, times(10)).get();
        verify(transcoder, times(10)).transcode(anyString(), anyString());
    }
}
