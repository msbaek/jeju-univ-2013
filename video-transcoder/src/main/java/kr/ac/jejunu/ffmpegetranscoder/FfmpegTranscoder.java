package kr.ac.jejunu.ffmpegetranscoder;

import kr.ac.jejunu.transcoder.Transcoder;

public class FfmpegTranscoder implements Transcoder {
    @Override
    public void transcode(String source, String target) {
        System.out.println("FfmpegTranscoder#transcode called");
    }
}
