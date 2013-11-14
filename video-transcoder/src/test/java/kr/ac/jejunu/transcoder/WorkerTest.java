package kr.ac.jejunu.transcoder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:transcoder.xml")
public class WorkerTest {
    @Resource(name = "worker")
    private Worker worker;

    @Test
    public void should_get_from_jobqueue_and_transcode() {
        worker.run();
    }
}
