// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.presenter.activitis;

import android.content.Context;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ArticlePresenterImpl_MembersInjector
    implements MembersInjector<ArticlePresenterImpl> {
  private final Provider<Context> contextProvider;

  public ArticlePresenterImpl_MembersInjector(Provider<Context> contextProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<ArticlePresenterImpl> create(Provider<Context> contextProvider) {
    return new ArticlePresenterImpl_MembersInjector(contextProvider);
  }

  @Override
  public void injectMembers(ArticlePresenterImpl instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.context = contextProvider.get();
  }

  public static void injectContext(
      ArticlePresenterImpl instance, Provider<Context> contextProvider) {
    instance.context = contextProvider.get();
  }
}
