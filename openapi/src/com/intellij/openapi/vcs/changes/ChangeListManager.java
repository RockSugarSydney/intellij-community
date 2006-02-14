package com.intellij.openapi.vcs.changes;

import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author max
 */
public abstract class ChangeListManager {
  public static ChangeListManager getInstance(Project project) {
    return project.getComponent(ChangeListManager.class);
  }

  public abstract void scheduleUpdate();

  @NotNull
  public abstract List<ChangeList> getChangeLists();

  public abstract void addChangeList(@NotNull String name);
  public abstract void setDefaultChangeList(@NotNull ChangeList list);
}
