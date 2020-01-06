package com.issue_with_litho;

import androidx.annotation.NonNull;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class CustomViewManager extends SimpleViewManager<LithoView> {

  public static final String REACT_CLASS = "RNTCustomView";

  @NonNull
  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @NonNull
  @Override
  protected LithoView createViewInstance(@NonNull ThemedReactContext reactContext) {
    final ComponentContext context = new ComponentContext(reactContext);

    final Component component = Text.create(context)
        .text("Hello World")
        .textSizeDip(50)
        .build();

    return LithoView.create(context, component);
  }
}
