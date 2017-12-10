package com.shubham.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YourTask extends DefaultTask {

  private static final Logger LOGGER = LoggerFactory.getLogger(YourTask.class);

  @TaskAction
  public void yourTask(){
    LOGGER.info("Main Logic");
  }
}
