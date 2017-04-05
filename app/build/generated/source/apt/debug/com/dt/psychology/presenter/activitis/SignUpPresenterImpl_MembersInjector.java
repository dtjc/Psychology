// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.dt.psychology.presenter.activitis;

import android.content.Context;
import com.dt.psychology.network.UserService;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SignUpPresenterImpl_MembersInjector
    implements MembersInjector<SignUpPresenterImpl> {
  private final Provider<UserService> userServiceProvider;

  private final Provider<Context> contextProvider;

  public SignUpPresenterImpl_MembersInjector(
      Provider<UserService> userServiceProvider, Provider<Context> contextProvider) {
    assert userServiceProvider != null;
    this.userServiceProvider = userServiceProvider;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<SignUpPresenterImpl> create(
      Provider<UserService> userServiceProvider, Provider<Context> contextProvider) {
    return new SignUpPresenterImpl_MembersInjector(userServiceProvider, contextProvider);
  }

  @Override
  public void injectMembers(SignUpPresenterImpl instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.userService = userServiceProvider.get();
    instance.context = contextProvider.get();
  }

  public static void injectUserService(
      SignUpPresenterImpl instance, Provider<UserService> userServiceProvider) {
    instance.userService = userServiceProvider.get();
  }

  public static void injectContext(
      SignUpPresenterImpl instance, Provider<Context> contextProvider) {
    instance.context = contextProvider.get();
  }
}
