package com.YouTubeTools.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class VideoDetails {
    private String id;
    private String title;
    private String description;
    private String channelTitle;
    List<String> tags;
    String publishedAt;
    private String thumbnailUrl;
}
