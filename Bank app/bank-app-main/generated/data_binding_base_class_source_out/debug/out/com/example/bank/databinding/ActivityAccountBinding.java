// Generated by view binder compiler. Do not edit!
package com.example.bank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bank.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAccountBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button ab1;

  @NonNull
  public final EditText d0;

  @NonNull
  public final TextView d1;

  @NonNull
  public final Button dp;

  @NonNull
  public final TextView t1;

  @NonNull
  public final TextView t2;

  @NonNull
  public final TextView t3;

  @NonNull
  public final EditText te1;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView tv1;

  private ActivityAccountBinding(@NonNull ConstraintLayout rootView, @NonNull Button ab1,
      @NonNull EditText d0, @NonNull TextView d1, @NonNull Button dp, @NonNull TextView t1,
      @NonNull TextView t2, @NonNull TextView t3, @NonNull EditText te1,
      @NonNull TextView textView2, @NonNull TextView textView4, @NonNull TextView tv1) {
    this.rootView = rootView;
    this.ab1 = ab1;
    this.d0 = d0;
    this.d1 = d1;
    this.dp = dp;
    this.t1 = t1;
    this.t2 = t2;
    this.t3 = t3;
    this.te1 = te1;
    this.textView2 = textView2;
    this.textView4 = textView4;
    this.tv1 = tv1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ab1;
      Button ab1 = ViewBindings.findChildViewById(rootView, id);
      if (ab1 == null) {
        break missingId;
      }

      id = R.id.d0;
      EditText d0 = ViewBindings.findChildViewById(rootView, id);
      if (d0 == null) {
        break missingId;
      }

      id = R.id.d1;
      TextView d1 = ViewBindings.findChildViewById(rootView, id);
      if (d1 == null) {
        break missingId;
      }

      id = R.id.dp;
      Button dp = ViewBindings.findChildViewById(rootView, id);
      if (dp == null) {
        break missingId;
      }

      id = R.id.t1;
      TextView t1 = ViewBindings.findChildViewById(rootView, id);
      if (t1 == null) {
        break missingId;
      }

      id = R.id.t2;
      TextView t2 = ViewBindings.findChildViewById(rootView, id);
      if (t2 == null) {
        break missingId;
      }

      id = R.id.t3;
      TextView t3 = ViewBindings.findChildViewById(rootView, id);
      if (t3 == null) {
        break missingId;
      }

      id = R.id.te1;
      EditText te1 = ViewBindings.findChildViewById(rootView, id);
      if (te1 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.tv1;
      TextView tv1 = ViewBindings.findChildViewById(rootView, id);
      if (tv1 == null) {
        break missingId;
      }

      return new ActivityAccountBinding((ConstraintLayout) rootView, ab1, d0, d1, dp, t1, t2, t3,
          te1, textView2, textView4, tv1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
