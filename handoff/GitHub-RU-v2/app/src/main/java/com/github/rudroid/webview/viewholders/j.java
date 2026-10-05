package com.github.rudroid.webview.viewholders;

import android.webkit.WebView;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j extends WebView implements o61.b {
    public m61.f r;
    public boolean s;

    public final Object w() {
        if (this.r == null) {
            this.r = new m61.f(this);
        }
        return this.r.w();
    }
}
