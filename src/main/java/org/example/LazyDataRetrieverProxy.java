package org.example;

/**
 * User: Z6PWA
 * Date: 21.10.2023
 */
public class LazyDataRetrieverProxy implements DbDataRetriever {

  private DbDataRetriever retriever;

  @Override
  public int getFirstValue() throws InterruptedException
  {
    if (retriever == null)
      retriever = new PostgresDataRetriever();
    return retriever.getFirstValue();
  }

  @Override
  public int getSecondValue() throws InterruptedException {
    if (retriever == null)
      retriever = new PostgresDataRetriever();
    return retriever.getSecondValue();
  }

  @Override
  public int getThirdValue() throws InterruptedException {
    if (retriever == null)
      retriever = new PostgresDataRetriever();
    return retriever.getThirdValue();
  }

}
