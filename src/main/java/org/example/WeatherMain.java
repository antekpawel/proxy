package org.example;

import java.util.Random;

/**
 * User: Z6PWA
 * Date: 21.10.2023
 */
public class WeatherMain
{
  public static void main(String[] args) throws InterruptedException
  {
    long begin = System.currentTimeMillis();
    for (int n = 0; n < 10; n++) {
      WeatherForecastDB weatherForecast = new WeatherForecastProxy();
      int number = new Random().nextInt(100);

      System.out.println(weatherForecast.getWeather());
      if (number < 20)
        weatherForecast.refreshData();
    }

    long end = System.currentTimeMillis();
    System.out.println("The execution took: " + (end - begin) + " [ms]");
  }
}
