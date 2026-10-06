package com.github.rudroid.webview.viewholders;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.rudroid.adapters.viewholders.o3;
import com.github.rudroid.interfaces.u0;
import com.github.rudroid.utilities.b3;
import com.github.rudroid.webview.viewholders.GitHubWebView;
import ic.xg;
import k71.x;
import zh.c;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l extends com.github.rudroid.adapters.viewholders.e<k5.f> implements GitHubWebView.g, o3 {
    public static final /* synthetic */ r71.e[] y;
    public final u0 v;
    public final int w;
    public final m x;

    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xg xgVar, com.github.rudroid.webview.adapters.i iVar, u0 u0Var) {
        super(xgVar);
        k71.k.g(xgVar, "binding");
        this.v = u0Var;
        this.w = ((k5.f) xgVar).A.getResources().getDimensionPixelSize(2131165315);
        this.x = new m(xgVar);
        xgVar.N.setOnScrollListener(new k(iVar, this));
    }

    public final View c() {
        View view = ((com.github.rudroid.adapters.viewholders.e) this).u.A;
        k71.k.f(view, "getRoot(...)");
        return view;
    }

    public final void d(int i) {
        ((com.github.rudroid.adapters.viewholders.e) this).u.A.getLayoutParams().width = i;
    }

    @Override // com.github.rudroid.webview.viewholders.GitHubWebView.g
    public final GitHubWebView e() {
        xg xgVar = ((com.github.rudroid.adapters.viewholders.e) this).u;
        k71.k.e(xgVar, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemWebViewMarkdownBinding");
        GitHubWebView gitHubWebView = xgVar.N;
        k71.k.f(gitHubWebView, "webView");
        return gitHubWebView;
    }

    public final void y(zh.g gVar) {
        String str;
        u0 u0Var;
        k71.k.g(gVar, "item");
        xg xgVar = ((com.github.rudroid.adapters.viewholders.e) this).u;
        xg xgVar2 = xgVar instanceof xg ? xgVar : null;
        if (xgVar2 != null) {
            ConstraintLayout constraintLayout = xgVar2.O;
            GitHubWebView gitHubWebView = xgVar2.N;
            gitHubWebView.setWebViewLoadedListener((GitHubWebView.c) this.x.t(this, y[0]));
            gitHubWebView.d(gVar);
            int dimensionPixelSize = ((k5.f) xgVar).A.getResources().getDimensionPixelSize(gVar.r());
            int i = this.w;
            b3.d(gitHubWebView, i, dimensionPixelSize, i, 0);
            k71.k.f(constraintLayout, "webViewContainer");
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), i);
            b3.c(constraintLayout, gVar.c() ? 2131099708 : 2131099994);
            gitHubWebView.setScrollToAnchor(gVar.z());
            if (!(gVar instanceof c.C0033c) || (str = ((c.C0033c) gVar).z) == null || (u0Var = this.v) == null) {
                return;
            }
            gitHubWebView.setCheckboxCheckedListener(new com.github.rudroid.interfaces.d(str, u0Var));
        }
    }

}
