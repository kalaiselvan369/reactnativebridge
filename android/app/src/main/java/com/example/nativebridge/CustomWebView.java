package com.example.nativebridge;

import android.content.Context;
import android.widget.LinearLayout;

import com.facebook.react.uimanager.ThemedReactContext;

public class CustomWebView extends LinearLayout {

    public CustomWebView(ThemedReactContext context) {
        super(context);
        init(context);
    }

    private void init(ThemedReactContext context) {

        //Inflate xml resource, pass "this" as the parent, we use <merge> tag in xml to avoid
        //redundant parent, otherwise a LinearLayout will be added to this LinearLayout ending up
        //with two view groups
        inflate(context, R.layout.webview, this);
    }
}