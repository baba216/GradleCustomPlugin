package com.shubham.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class YourPlugin implements Plugin<Project>{


  @Override
  public void apply(Project project) {
    //project.getExtensions().create("TASK_NAME", YourTask.class);
    project.task("hello").doLast(task -> System.out.println("Hello Gradle"));
  }
}
