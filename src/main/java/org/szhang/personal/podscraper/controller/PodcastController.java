package org.szhang.personal.podscraper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.szhang.personal.podscraper.repositories.PodcastRepository;

@RestController
@RequestMapping(value = "/api/classes")
public class PodcastController {

  private PodcastRepository podcastRepository;

  @Autowired
  public PodcastController(PodcastRepository podcastRepository) {
    this.podcastRepository = podcastRepository;
  }
}
