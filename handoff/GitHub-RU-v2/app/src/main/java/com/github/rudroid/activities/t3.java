package com.github.rudroid.activities;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: /home/user/work/p/classes.dex */
public final class t3 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f5909a;

    public t3(WebViewActivity webViewActivity) {
        this.f5909a = webViewActivity;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (!com.github.rudroid.utilities.i1.c(url)) {
            com.github.rudroid.utilities.i1.f(this.f5909a, url);
            return true;
        }
        if (webView == null) {
            return false;
        }
        webView.loadUrl(url.toString());
        return false;
    }
}
