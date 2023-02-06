package com.kaotic.theme;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.theme.Theme;

import java.util.List;

@Description(
    group = "com.kaotic",
    name = "KAOTIC Theme",
    version = "2023.3.2",
    summary = "An plugin that provides the KAOTIC CSS theme for Shuffleboard"
)
public final class themePlugin extends Plugin {

  private final Theme customTheme = new Theme(getClass(), "KAOTIC Theme", "custom-shuffleboard-theme.css");

  @Override
  public List<Theme> getThemes() {
    return List.of(customTheme);
  }
}
