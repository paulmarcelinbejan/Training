package com.paulmarcelinbejan.training.designpattern.structural.proxy.example;

import java.util.HashMap;

public interface YouTubeService {

	HashMap<String, Video> popularVideos();

	Video getVideo(String videoId);

}
