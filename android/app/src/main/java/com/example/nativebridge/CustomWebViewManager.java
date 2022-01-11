package com.example.nativebridge;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class CustomWebViewManager extends SimpleViewManager<CustomWebView> {
    @Override
    public String getName() {
        return "CustomWebView";
    }
    @Override
    protected CustomWebView createViewInstance(ThemedReactContext reactContext) {
        return new CustomWebView(reactContext);
    }
}