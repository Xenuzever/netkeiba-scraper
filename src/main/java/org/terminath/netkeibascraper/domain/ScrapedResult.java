package org.terminath.netkeibascraper.domain;

import lombok.Data;

import java.util.List;

// TODO JRA, NAR 共通部分を定義
@Data
public class ScrapedResult<R extends RaceInfo, H extends RaceResultInfo> {

  private R raceInfo;

  private List<H> horseInfo;
}
