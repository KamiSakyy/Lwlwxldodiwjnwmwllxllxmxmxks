package com.github.rudroid.utilities.ui;

import android.content.Context;
import com.github.rudroid.webview.viewholders.GitHubWebView;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class w implements GitHubWebView.c {
    public final /* synthetic */ j71.c a;
    public final /* synthetic */ Context b;

    public /* synthetic */ w(Context context, j71.c cVar) {
        this.a = cVar;
        this.b = context;
    }

    @Override // com.github.rudroid.webview.viewholders.GitHubWebView.c
    public final void b(int i) {
        this.a.k(Float.valueOf(i * this.b.getResources().getDisplayMetrics().density));
    }
}
