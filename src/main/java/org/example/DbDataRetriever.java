package org.example;

/**
 * User: Z6PWA
 * Date: 21.10.2023
 */
public interface DbDataRetriever
{
  int getFirstValue() throws InterruptedException;
  int getSecondValue() throws InterruptedException;
  int getThirdValue() throws InterruptedException;
}
