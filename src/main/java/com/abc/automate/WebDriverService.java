package com.abc.automate;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverService {

  private static int timeout;
  private static boolean headless;

  static {
    headless = Boolean.parseBoolean(PropertyUtil.getApplicationProperty("chrome.driver.headless"));
    timeout = Integer.parseInt(PropertyUtil.getApplicationProperty("implicit.timeout.seconds"));
  }

  public WebDriver getDriver() {

    // setup the chromedriver using WebDriverManager
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();
    options.setHeadless(headless);
    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

    // Create driver object for Chrome
    WebDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    return driver;
  }

}
