// Generated by view binder compiler. Do not edit!
package com.example.connectmeproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.connectmeproject.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SigninBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnSign;

  @NonNull
  public final TextInputEditText emailID;

  @NonNull
  public final TextInputLayout emailLayout;

  @NonNull
  public final TextInputEditText passID;

  @NonNull
  public final TextInputLayout passwordLayout;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView txtConnectME;

  private SigninBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton btnSign,
      @NonNull TextInputEditText emailID, @NonNull TextInputLayout emailLayout,
      @NonNull TextInputEditText passID, @NonNull TextInputLayout passwordLayout,
      @NonNull TextView textView, @NonNull TextView txtConnectME) {
    this.rootView = rootView;
    this.btnSign = btnSign;
    this.emailID = emailID;
    this.emailLayout = emailLayout;
    this.passID = passID;
    this.passwordLayout = passwordLayout;
    this.textView = textView;
    this.txtConnectME = txtConnectME;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SigninBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SigninBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.signin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SigninBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSign;
      AppCompatButton btnSign = ViewBindings.findChildViewById(rootView, id);
      if (btnSign == null) {
        break missingId;
      }

      id = R.id.emailID;
      TextInputEditText emailID = ViewBindings.findChildViewById(rootView, id);
      if (emailID == null) {
        break missingId;
      }

      id = R.id.emailLayout;
      TextInputLayout emailLayout = ViewBindings.findChildViewById(rootView, id);
      if (emailLayout == null) {
        break missingId;
      }

      id = R.id.passID;
      TextInputEditText passID = ViewBindings.findChildViewById(rootView, id);
      if (passID == null) {
        break missingId;
      }

      id = R.id.passwordLayout;
      TextInputLayout passwordLayout = ViewBindings.findChildViewById(rootView, id);
      if (passwordLayout == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.txtConnectME;
      TextView txtConnectME = ViewBindings.findChildViewById(rootView, id);
      if (txtConnectME == null) {
        break missingId;
      }

      return new SigninBinding((ConstraintLayout) rootView, btnSign, emailID, emailLayout, passID,
          passwordLayout, textView, txtConnectME);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}