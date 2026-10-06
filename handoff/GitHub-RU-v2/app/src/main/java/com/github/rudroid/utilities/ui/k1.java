package com.github.rudroid.utilities.ui;

import android.widget.TextView;
import com.github.rudroid.html.b;
import com.github.rudroid.webview.viewholders.GitHubWebView;
import zh.c;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k1 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, int i) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                p0 p0Var = (p0) this.s;
                j71.f fVar = (j71.f) this.t;
                j71.e eVar = (j71.e) this.u;
                m0.f fVar2 = (m0.f) obj;
                k71.k.g(fVar2, "$this$LazyColumn");
                if (p0Var instanceof c0) {
                    m0.f.q(fVar2, (String) null, new r1.d(new com.github.rudroid.actions.checkdetail.ui.dShadow(1, eVar), true, -233990683), 3);
                }
                Object data = ((q0) p0Var).getData();
                a0 a0Var = p0Var instanceof a0 ? (a0) p0Var : null;
                fVar.f(fVar2, data, a0Var != null ? a0Var.b : null);
                if (p0Var instanceof b0) {
                    m0.f.q(fVar2, (String) null, new r1.d(new com.github.rudroid.actions.checkdetail.ui.dShadow(2, eVar), true, 809407068), 3);
                } else {
                    m0.f.q(fVar2, (String) null, t.f, 3);
                }
                return w61.a0.a;
            case 1:
                String str = (String) this.s;
                String str2 = (String) this.t;
                androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) this.u;
                GitHubWebView gitHubWebView = (GitHubWebView) obj;
                k71.k.g(gitHubWebView, "it");
                f1Var.setValue(Boolean.TRUE);
                gitHubWebView.d(new c.C0033c(str, str2, null, false, 0, null, null, 124));
                break;
            default:
                com.github.rudroid.html.b bVar = (com.github.rudroid.html.b) this.s;
                String str3 = (String) this.t;
                b.a aVar = (b.a) this.u;
                TextView textView = (TextView) obj;
                k71.k.g(textView, "textView");
                com.github.rudroid.html.b.a(bVar, textView, str3, aVar, false, 40);
                break;
        }
        return w61.a0.a;
    }
}
