package org.example.StructuralDesignPatterns.Proxy;

import java.util.HashMap;

public interface ThirdPartyLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
