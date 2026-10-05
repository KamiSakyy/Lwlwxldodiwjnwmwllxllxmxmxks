package com.github.rudroid.webview.viewholders;

import androidx.compose.foundation.lazy.layout.s0;
import com.github.rudroid.webview.viewholders.GitHubWebView;
import ic.xg;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m extends s0 {
    public final /* synthetic */ xg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xg xgVar) {
        super(7, (Object) null);
        this.t = xgVar;
    }

    public final void i(r71.e eVar, Object obj, Object obj2) {
        k71.k.g(eVar, "property");
        this.t.N.setWebViewLoadedListener((GitHubWebView.c) obj2);
    }

}
