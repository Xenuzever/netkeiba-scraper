package org.terminath.netkeibascraper.application;

import org.terminath.netkeibascraper.domain.Host;
import org.terminath.netkeibascraper.domain.OptionalScrapedResult;

import java.net.URI;

public class NetkeibaScraper {

  public OptionalScrapedResult scrape(URI uri) {
    switch (Host.parse(uri.getHost())) {
      case JRA:;
      case NAR:;
      default:
        return OptionalScrapedResult.empty();
    }
  }
}
