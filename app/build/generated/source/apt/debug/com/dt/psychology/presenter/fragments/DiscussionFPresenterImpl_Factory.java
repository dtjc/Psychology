// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.presenter.fragments;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class DiscussionFPresenterImpl_Factory implements Factory<DiscussionFPresenterImpl> {
  private final MembersInjector<DiscussionFPresenterImpl> discussionFPresenterImplMembersInjector;

  public DiscussionFPresenterImpl_Factory(
      MembersInjector<DiscussionFPresenterImpl> discussionFPresenterImplMembersInjector) {
    assert discussionFPresenterImplMembersInjector != null;
    this.discussionFPresenterImplMembersInjector = discussionFPresenterImplMembersInjector;
  }

  @Override
  public DiscussionFPresenterImpl get() {
    return MembersInjectors.injectMembers(
        discussionFPresenterImplMembersInjector, new DiscussionFPresenterImpl());
  }

  public static Factory<DiscussionFPresenterImpl> create(
      MembersInjector<DiscussionFPresenterImpl> discussionFPresenterImplMembersInjector) {
    return new DiscussionFPresenterImpl_Factory(discussionFPresenterImplMembersInjector);
  }
}
