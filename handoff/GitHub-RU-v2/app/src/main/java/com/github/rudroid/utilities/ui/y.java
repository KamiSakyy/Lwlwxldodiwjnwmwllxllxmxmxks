package com.github.rudroid.utilities.ui;

import com.github.rudroid.webview.viewholders.GitHubWebView;
import t00.f8;

@c71.e(c = "com.github.rudroid.utilities.ui.ComposeWebViewKt$ComposeWebView$6$1$1", f = "ComposeWebView.kt", l = {50}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class y extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ w1 w;
    public final /* synthetic */ GitHubWebView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w1 w1Var, GitHubWebView gitHubWebView, a71.c cVar) {
        super(2, cVar);
        this.w = w1Var;
        this.x = gitHubWebView;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new y(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            f8 J = androidx.compose.runtime.t.J(new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(23, this.w));
            x xVar = new x(this.x);
            this.v = 1;
            if (J.b(xVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
    public static Object a(Object p1, Object p2) { return null; }
}
