package com.abc.automate;

import java.util.ResourceBundle;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyUtil {

  private static final Logger LOGGER = LoggerFactory.getLogger(PropertyUtil.class);

  private PropertyUtil() {}

  private static final String APPLICATION_PROPERTY_NAME = "application";

  private static ResourceBundle applicationProperty =
      ResourceBundle.getBundle(APPLICATION_PROPERTY_NAME);

  public static String getApplicationProperty(String key) {
    String value = System.getProperty(key);

    if (StringUtils.isEmpty(value)) {
      value = applicationProperty.getString(key);
      LOGGER.info("from=application.properties {}={}", key, value);
    } else {
      LOGGER.info("from=env variable {}={}", key, value);
    }
    return value;
  }
}
