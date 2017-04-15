// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.ui.activities;

import com.dt.psychology.presenter.activitis.AskQuestionPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class AskQuestionActivity_MembersInjector
    implements MembersInjector<AskQuestionActivity> {
  private final Provider<AskQuestionPresenter> askQuestionPresenterProvider;

  public AskQuestionActivity_MembersInjector(
      Provider<AskQuestionPresenter> askQuestionPresenterProvider) {
    assert askQuestionPresenterProvider != null;
    this.askQuestionPresenterProvider = askQuestionPresenterProvider;
  }

  public static MembersInjector<AskQuestionActivity> create(
      Provider<AskQuestionPresenter> askQuestionPresenterProvider) {
    return new AskQuestionActivity_MembersInjector(askQuestionPresenterProvider);
  }

  @Override
  public void injectMembers(AskQuestionActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.askQuestionPresenter = askQuestionPresenterProvider.get();
  }

  public static void injectAskQuestionPresenter(
      AskQuestionActivity instance, Provider<AskQuestionPresenter> askQuestionPresenterProvider) {
    instance.askQuestionPresenter = askQuestionPresenterProvider.get();
  }
}
