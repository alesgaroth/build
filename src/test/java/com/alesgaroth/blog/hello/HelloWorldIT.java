package com.alesgaroth.blog.hello;

import org.htmlunit.html.HtmlPage;
import org.htmlunit.WebClient;
import org.junit.jupiter.api.Test;

public class HelloWorldIT {
  @Test
  public void homePage() throws Exception {
    try (final WebClient webClient = new WebClient()) {
      final HtmlPage page = webClient.getPage("http://localhost:8080/");
    }
  }
}
