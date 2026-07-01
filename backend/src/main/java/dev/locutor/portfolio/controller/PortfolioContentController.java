package dev.locutor.portfolio.controller;

import java.util.List;

import dev.locutor.portfolio.dto.AudioResponse;
import dev.locutor.portfolio.dto.DemoResponse;
import dev.locutor.portfolio.dto.IconResponse;
import dev.locutor.portfolio.dto.ImageResponse;
import dev.locutor.portfolio.dto.Model3DResponse;
import dev.locutor.portfolio.dto.PortfolioContentResponse;
import dev.locutor.portfolio.dto.SocialMediaResponse;
import dev.locutor.portfolio.dto.SubtypeResponse;
import dev.locutor.portfolio.service.PortfolioContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PortfolioContentController {

    private final PortfolioContentService portfolioContentService;

    @GetMapping("/content")
    public PortfolioContentResponse getContent() {
        return portfolioContentService.getContent();
    }

    @GetMapping("/voice-styles")
    public List<AudioResponse> getVoiceStyles() {
        return portfolioContentService.getVoiceStyles();
    }

    @GetMapping("/demos")
    public List<DemoResponse> getDemos() {
        return portfolioContentService.getDemos();
    }

    @GetMapping("/projects")
    public List<ImageResponse> getProjects() {
        return portfolioContentService.getProjects();
    }

    @GetMapping("/icons")
    public List<IconResponse> getIcons() {
        return portfolioContentService.getIcons();
    }

    @GetMapping("/social-media")
    public List<SocialMediaResponse> getSocialMedia() {
        return portfolioContentService.getSocialMedia();
    }

    @GetMapping("/models-3d")
    public List<Model3DResponse> getModels3d() {
        return portfolioContentService.getModels3d();
    }

    @GetMapping("/subtypes")
    public List<SubtypeResponse> getSubtypes() {
        return portfolioContentService.getSubtypes();
    }
}
