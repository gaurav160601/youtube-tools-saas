package com.YouTubeTools.Controller;

import com.YouTubeTools.Model.SearchVideo;
import com.YouTubeTools.Service.YouTubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/youtube")
public class YouTubeTagsController {

    @Autowired
    private YouTubeService youTubeService;

    @Value("${youtube.api.key}")
    private String apiKey;

    private boolean isApiKeyConfiguried() {
        return apiKey != null && !apiKey.isEmpty();
    }

    @PostMapping("/search")
    public String videoTags(@RequestParam("videoTitle") String videoTitle, Model model) {

        if (!isApiKeyConfiguried()) {
            model.addAttribute("error", "API key is not configured");
            return "home";
        }

        if (videoTitle == null || videoTitle.isEmpty()) {
            model.addAttribute("error", "Video Title is required");
            return "home";
        }

        try {
            SearchVideo result = youTubeService.searchVideos(videoTitle);

            model.addAttribute("primaryVideo", result.getPrimaryVideo());
            model.addAttribute("relatedVideos", result.getRelatedVideos());

            // ✅ FIX: build allTagsAsString INSIDE the method
            String allTags = result.getRelatedVideos().stream()
                    .filter(v -> v.getTags() != null)
                    .flatMap(v -> v.getTags().stream())
                    .distinct()
                    .reduce((a, b) -> a + "," + b)
                    .orElse("");

            model.addAttribute("allTagsAsString", allTags);

            return "home";

        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "home";
        }
    }
}
