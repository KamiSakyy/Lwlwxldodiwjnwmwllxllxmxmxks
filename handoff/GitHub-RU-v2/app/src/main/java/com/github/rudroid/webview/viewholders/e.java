package com.github.rudroid.webview.viewholders;

import android.content.Context;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.github.rudroid.activities.a0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import t71.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends WebViewClient {
    public final /* synthetic */ GitHubWebView a;

    public e(GitHubWebView gitHubWebView) {
        this.a = gitHubWebView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        k71.k.g(webView, "view");
        super.onPageFinished(webView, str);
        GitHubWebView gitHubWebView = this.a;
        gitHubWebView.w = true;
        if (gitHubWebView.x) {
            gitHubWebView.x = false;
            gitHubWebView.c();
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        k71.k.g(webView, "view");
        k71.k.g(webResourceRequest, "request");
        ia.d dVar = this.a.u;
        Uri url = webResourceRequest.getUrl();
        ArrayList arrayList = dVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k8.b bVar = (k8.b) obj;
            bVar.getClass();
            String str = bVar.b;
            k8.a aVar = (!url.getScheme().equals("http") && (url.getScheme().equals("http") || url.getScheme().equals("https")) && url.getAuthority().equals(bVar.a) && url.getPath().startsWith(str)) ? bVar.c : null;
            if (aVar != null) {
                String replaceFirst = url.getPath().replaceFirst(str, "");
                try {
                    a7.d dVar2 = aVar.a;
                    String substring = (replaceFirst.length() <= 1 || replaceFirst.charAt(0) != '/') ? replaceFirst : replaceFirst.substring(1);
                    InputStream open = dVar2.a.getAssets().open(substring, 2);
                    if (substring.endsWith(".svgz")) {
                        open = new GZIPInputStream(open);
                    }
                    return new WebResourceResponse(a7.d.g(replaceFirst), null, open);
                } catch (IOException unused) {
                    return new WebResourceResponse(null, null, null);
                }
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        k71.k.g(webView, "view");
        k71.k.g(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        k71.k.f(uri, "toString(...)");
        boolean F = w.F(uri, "github://github.com/?anchor=", false);
        GitHubWebView gitHubWebView = this.a;
        if (F) {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.parseUrl(uri);
            gitHubWebView.loadUrl("javascript:github.getAnchorPosition(\"" + urlQuerySanitizer.getValue("anchor") + "\")");
            return true;
        }
        if (w.F(uri, "file://", false)) {
            return true;
        }
        if (!w.F(uri, "uri://", false)) {
            com.github.rudroid.w deepLinkRouter = gitHubWebView.getDeepLinkRouter();
            Context context = webView.getContext();
            Uri url = webResourceRequest.getUrl();
            k71.k.f(url, "getUrl(...)");
            com.github.rudroid.w.c(deepLinkRouter, context, url, false, gitHubWebView.getAccountHolder().d().c, false, (String) null, (a0) null, 172);
            return true;
        }
        com.github.rudroid.w deepLinkRouter2 = gitHubWebView.getDeepLinkRouter();
        Context context2 = webView.getContext();
        Uri url2 = webResourceRequest.getUrl();
        k71.k.f(url2, "getUrl(...)");
        String str = gitHubWebView.getAccountHolder().d().c;
        deepLinkRouter2.getClass();
        k71.k.g(str, "preferredLogin");
        oa.j g = deepLinkRouter2.a.g();
        String str2 = g != null ? g.b : null;
        if (str2 == null || str2.length() == 0) {
            str2 = "www.github.com";
        }
        Uri build = new Uri.Builder().scheme("https").authority(str2).appendPath(url2.getHost()).appendEncodedPath(url2.getEncodedPath()).build();
        k71.k.d(build);
        com.github.rudroid.w.c(deepLinkRouter2, context2, build, false, str, true, (String) null, (a0) null, 140);
        return true;
    }
}
