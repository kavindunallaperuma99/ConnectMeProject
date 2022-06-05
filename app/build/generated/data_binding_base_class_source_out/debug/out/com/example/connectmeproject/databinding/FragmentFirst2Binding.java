// Generated by view binder compiler. Do not edit!
package com.example.connectmeproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.connectmeproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirst2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonFirst;

  @NonNull
  public final TextView textviewFirst;

  private FragmentFirst2Binding(@NonNull ConstraintLayout rootView, @NonNull Button buttonFirst,
      @NonNull TextView textviewFirst) {
    this.rootView = rootView;
    this.buttonFirst = buttonFirst;
    this.textviewFirst = textviewFirst;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirst2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirst2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirst2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_first;
      Button buttonFirst = ViewBindings.findChildViewById(rootView, id);
      if (buttonFirst == null) {
        break missingId;
      }

      id = R.id.textview_first;
      TextView textviewFirst = ViewBindings.findChildViewById(rootView, id);
      if (textviewFirst == null) {
        break missingId;
      }

      return new FragmentFirst2Binding((ConstraintLayout) rootView, buttonFirst, textviewFirst);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
