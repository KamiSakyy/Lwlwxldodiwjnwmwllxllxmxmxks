package com.github.rudroid.webview.viewholders;

import androidx.compose.foundation.lazy.layout.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g extends s0 {
    public final /* synthetic */ GitHubWebView t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GitHubWebView gitHubWebView) {
        super(7, (Object) null);
        this.t = gitHubWebView;
    }

    public final void i(r71.e eVar, Object obj, Object obj2) {
        k71.k.g(eVar, "property");
        String str = (String) obj2;
        GitHubWebView gitHubWebView = this.t;
        if (!gitHubWebView.y || str == null) {
            return;
        }
        gitHubWebView.a(str);
        gitHubWebView.setScrollToAnchor(null);
    }
}
