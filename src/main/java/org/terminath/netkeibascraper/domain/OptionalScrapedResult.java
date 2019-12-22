package org.terminath.netkeibascraper.domain;

import org.terminath.netkeibascraper.domain.jra.JRAScrapedResult;
import org.terminath.netkeibascraper.domain.nar.NARScrapedResult;

import java.util.Objects;

public class OptionalScrapedResult {

  private ScrapedResult t;

  public ScrapedResult get() {
    if (Objects.isNull(t)) {
      throw new NullPointerException();
    }
    return t;
  }

  public JRAScrapedResult getAsJRA() {
    return (JRAScrapedResult) get();
  }

  public NARScrapedResult getAsNAR() {
    return (NARScrapedResult) get();
  }

  public boolean isPresent() {
    return Objects.nonNull(t);
  }

  public boolean isJRA() {
    return t instanceof JRAScrapedResult;
  }

  public boolean isNAR() {
    return t instanceof NARScrapedResult;
  }

  public boolean isPresentJRA() {
    return isPresent() && isJRA();
  }

  public boolean isPresentNAR() {
    return isPresent() && isNAR();
  }

  public static OptionalScrapedResult empty() {
    return of(null);
  }

  public static <T extends ScrapedResult> OptionalScrapedResult of(T t) {
    OptionalScrapedResult opt = new OptionalScrapedResult();
    opt.t = t;
    return opt;
  }
}
