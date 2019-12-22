package org.terminath.netkeibascraper.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

@AllArgsConstructor
public enum Host {
  JRA("race.netkeiba.com"),
  NAR("nar.netkeiba.com"),
  UNKNOWN("unknown");

  @Getter private String hostName;

  public static Host parse(final String hostName) {
    return Arrays.stream(values())
        .filter(v -> StringUtils.equals(v.hostName, hostName))
        .findFirst()
        .orElse(UNKNOWN);
  }
}
