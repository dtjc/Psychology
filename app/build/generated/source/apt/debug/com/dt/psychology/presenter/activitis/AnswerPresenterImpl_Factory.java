// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.presenter.activitis;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class AnswerPresenterImpl_Factory implements Factory<AnswerPresenterImpl> {
  private final MembersInjector<AnswerPresenterImpl> answerPresenterImplMembersInjector;

  public AnswerPresenterImpl_Factory(
      MembersInjector<AnswerPresenterImpl> answerPresenterImplMembersInjector) {
    assert answerPresenterImplMembersInjector != null;
    this.answerPresenterImplMembersInjector = answerPresenterImplMembersInjector;
  }

  @Override
  public AnswerPresenterImpl get() {
    return MembersInjectors.injectMembers(
        answerPresenterImplMembersInjector, new AnswerPresenterImpl());
  }

  public static Factory<AnswerPresenterImpl> create(
      MembersInjector<AnswerPresenterImpl> answerPresenterImplMembersInjector) {
    return new AnswerPresenterImpl_Factory(answerPresenterImplMembersInjector);
  }
}