package org.terminath.netkeibascraper.domain;

import lombok.Data;

// TODO JRA, NAR 共通部分を定義
@Data
public abstract class RaceResultInfo {

  private String id;

  private HorseInfo horseInfo;

  private JockeyInfo jockeyInfo;

  private StableInfo stableInfo;
}
