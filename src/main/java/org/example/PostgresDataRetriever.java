package org.example;

/**
 * User: Z6PWA
 * Date: 21.10.2023
 */
public class PostgresDataRetriever implements DbDataRetriever {

  public PostgresDataRetriever() throws InterruptedException {
    Thread.sleep(5000);
  }

  @Override
  public int getFirstValue() {
    return 100;
  }

  @Override
  public int getSecondValue() {
    return 200;
  }

  @Override
  public int getThirdValue() {
    return 300;
  }
}
