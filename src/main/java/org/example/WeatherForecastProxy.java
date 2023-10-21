package org.example;

import java.util.Random;

/**
 * User: Z6PWA
 * Date: 21.10.2023
 */
public class WeatherForecastProxy implements WeatherForecastDB
{
  private String weatherData = new Random().nextBoolean() ? "Sunny" : "Rainy";

  public WeatherForecastProxy() {
  }

  @Override
  public String getWeather() {
    return weatherData;
  }

  @Override
  public void refreshData() {
    try
    {
      Thread.sleep(5000);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}
