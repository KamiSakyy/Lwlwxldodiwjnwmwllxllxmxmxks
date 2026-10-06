package com.github.rudroid.webview.viewholders;

import ad.a;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.rudroid.adapters.viewholders.o3;
import com.github.rudroid.interfaces.s0;
import com.github.rudroid.support.u;
import com.github.rudroid.utilities.b3;
import com.github.rudroid.webview.viewholders.GitHubWebView;
import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffLineType;
import ic.vg;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends com.github.rudroid.adapters.viewholders.e<k5.f> implements GitHubWebView.g, o3 {
    public static final /* synthetic */ int A = 0;
    public final int v;
    public final float w;
    public final s0 x;
    public a.d y;
    public final zh.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vg vgVar, int i, float f, s0 s0Var) {
        super(vgVar);
        k71.k.g(s0Var, "onSuggestionCommitListener");
        this.v = i;
        this.w = f;
        this.x = s0Var;
        this.z = new zh.h(x.t(new w61.k("commit_suggestion", new zh.d(new u(10, this)))));
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
        vg vgVar = ((com.github.rudroid.adapters.viewholders.e) this).u;
        k71.k.e(vgVar, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemWebViewDiffMarkdownBinding");
        GitHubWebView gitHubWebView = vgVar.Q;
        k71.k.f(gitHubWebView, "webView");
        return gitHubWebView;
    }

    public final void y(a.d dVar, com.github.rudroid.settings.codeoptions.f fVar, int i) {
        k71.k.g(dVar, "item");
        CommentLevelType commentLevelType = dVar.A;
        DiffLineType diffLineType = dVar.z;
        k71.k.g(fVar, "codeOptions");
        this.y = dVar;
        vg vgVar = ((com.github.rudroid.adapters.viewholders.e) this).u;
        k71.k.e(vgVar, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemWebViewDiffMarkdownBinding");
        vg vgVar2 = vgVar;
        View view = ((k5.f) vgVar2).A;
        View view2 = vgVar2.P;
        FrameLayout frameLayout = vgVar2.O;
        GitHubWebView gitHubWebView = vgVar2.Q;
        a.d dVar2 = this.y;
        if (dVar2 == null) {
            k71.k.m("diffLineWebViewItem");
            throw null;
        }
        gitHubWebView.setMessageHandler(dVar2.w ? this.z : null);
        gitHubWebView.d(dVar);
        frameLayout.setElevation(this.w);
        k71.k.f(frameLayout, "diffLineGroup");
        k71.k.f(frameLayout, "diffLineGroup");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        k71.k.f(frameLayout, "diffLineGroup");
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        int i4 = this.v;
        b3.d(frameLayout, i4, i2, i4, i3);
        Resources resources = view.getContext().getResources();
        int a = ad.b.a(diffLineType, fVar, commentLevelType);
        Resources.Theme theme = view.getContext().getTheme();
        ThreadLocal threadLocal = q4.l.a;
        vgVar2.N.setBackgroundColor(resources.getColor(a, theme));
        boolean z = fVar.c() && commentLevelType != CommentLevelType.FILE;
        k71.k.f(view2, "lineNumberBackground");
        view2.setVisibility(z ? 0 : 8);
        if (!z) {
            view2.setVisibility(8);
            return;
        }
        int b = ad.b.b(diffLineType, fVar);
        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
        layoutParams3.width = i;
        view2.setLayoutParams(layoutParams3);
        view2.setBackgroundResource(b);
    }



    public Object y;
    public Object W(Object p1) { return null; }
}
