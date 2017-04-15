// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.dagger2.modules;

import com.dt.psychology.presenter.activitis.WriteCommentPresenter;
import com.dt.psychology.presenter.activitis.WriteCommentPresenterImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ActivityModule_ProvideWriteCommentPresenterImplFactory
    implements Factory<WriteCommentPresenter> {
  private final ActivityModule module;

  private final Provider<WriteCommentPresenterImpl> writeCommentPresenterProvider;

  public ActivityModule_ProvideWriteCommentPresenterImplFactory(
      ActivityModule module, Provider<WriteCommentPresenterImpl> writeCommentPresenterProvider) {
    assert module != null;
    this.module = module;
    assert writeCommentPresenterProvider != null;
    this.writeCommentPresenterProvider = writeCommentPresenterProvider;
  }

  @Override
  public WriteCommentPresenter get() {
    return Preconditions.checkNotNull(
        module.provideWriteCommentPresenterImpl(writeCommentPresenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<WriteCommentPresenter> create(
      ActivityModule module, Provider<WriteCommentPresenterImpl> writeCommentPresenterProvider) {
    return new ActivityModule_ProvideWriteCommentPresenterImplFactory(
        module, writeCommentPresenterProvider);
  }
}
