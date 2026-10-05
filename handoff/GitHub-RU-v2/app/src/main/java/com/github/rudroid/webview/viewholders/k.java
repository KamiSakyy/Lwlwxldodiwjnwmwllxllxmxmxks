package com.github.rudroid.webview.viewholders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.rudroid.webview.viewholders.GitHubWebView;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements GitHubWebView.d {
    public final /* synthetic */ com.github.rudroid.webview.adapters.i a;
    public final /* synthetic */ l b;

    public k(com.github.rudroid.webview.adapters.i iVar, l lVar) {
        this.a = iVar;
        this.b = lVar;
    }

    @Override // com.github.rudroid.webview.viewholders.GitHubWebView.d
    public final void a(int i) {
        View view;
        int h = this.b.h();
        com.github.rudroid.webview.adapters.i iVar = this.a;
        RecyclerView recyclerView = iVar.f;
        if (recyclerView == null) {
            k71.k.m("attachedRecyclerView");
            throw null;
        }
        n1 K = recyclerView.K(h);
        recyclerView.n0(0, ((K == null || (view = K.a) == null) ? 0 : Float.valueOf(view.getY())).intValue() + i, false);
        com.github.rudroid.webview.adapters.j jVar = iVar.d;
        if (jVar != null) {
            jVar.j3();
        }
    }
}
