// Generated by data binding compiler. Do not edit!
package com.example.mobilemall.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.mobilemall.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnAddShoppingCart;

  @NonNull
  public final TextView btnMore;

  @NonNull
  public final TextView content;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView price;

  @NonNull
  public final TextView title;

  protected ItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView btnAddShoppingCart, TextView btnMore, TextView content, ImageView image,
      TextView price, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAddShoppingCart = btnAddShoppingCart;
    this.btnMore = btnMore;
    this.content = content;
    this.image = image;
    this.price = price;
    this.title = title;
  }

  @NonNull
  public static ItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemBinding>inflateInternal(inflater, R.layout.item, root, attachToRoot, component);
  }

  @NonNull
  public static ItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<ItemBinding>inflateInternal(inflater, R.layout.item, null, false, component);
  }

  public static ItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemBinding)bind(component, view, R.layout.item);
  }
}
