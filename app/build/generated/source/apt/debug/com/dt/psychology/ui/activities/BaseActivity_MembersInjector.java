// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.ui.activities;

import dagger.MembersInjector;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final Provider<ExecutorService> esProvider;

  public BaseActivity_MembersInjector(Provider<ExecutorService> esProvider) {
    assert esProvider != null;
    this.esProvider = esProvider;
  }

  public static MembersInjector<BaseActivity> create(Provider<ExecutorService> esProvider) {
    return new BaseActivity_MembersInjector(esProvider);
  }

  @Override
  public void injectMembers(BaseActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.es = esProvider.get();
  }

  public static void injectEs(BaseActivity instance, Provider<ExecutorService> esProvider) {
    instance.es = esProvider.get();
  }
}