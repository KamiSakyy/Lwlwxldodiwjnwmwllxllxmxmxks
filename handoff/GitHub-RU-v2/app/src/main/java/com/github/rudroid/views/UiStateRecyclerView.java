package com.github.rudroid.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class UiStateRecyclerView extends RecyclerView {
    public vf.a c1;
    public com.github.rudroid.views.listemptystate.e d1;
    public i e1;
    public p81.a f1;
    public p81.a g1;
    public l7.c h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStateRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k71.k.g(context, "context");
        this.d1 = new com.github.rudroid.views.listemptystate.e();
        this.f1 = new p81.a(2);
        this.g1 = new p81.a(1);
    }

    public static /* synthetic */ void w0(UiStateRecyclerView uiStateRecyclerView, List list, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        uiStateRecyclerView.v0(list, z, (i & 4) != 0);
    }

    public final l7.c getConcatAdapter() {
        l7.c cVar = this.h1;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("concatAdapter");
        throw null;
    }

    public final void onDetachedFromWindow() {
        n();
        this.c1 = null;
        super.onDetachedFromWindow();
    }

    public final void setConcatAdapter(l7.c cVar) {
        k71.k.g(cVar, "<set-?>");
        this.h1 = cVar;
    }

    public final void setFancyAppBarElevated(boolean z) {
        if (z) {
            vf.a aVar_r7 = this.c1;
            if (aVar_r7 != null) {
                aVar_r7.a.setElevation(aVar_r7.c);
                aVar_r7.b = -1.0f;
                return;
            }
            return;
        }
        vf.a aVar2_r7 = this.c1;
        if (aVar2_r7 != null) {
            aVar2_r7.a.setElevation(0.0f);
            aVar2_r7.b = -1.0f;
        }
    }

    public final void u0(AppBarLayout appBarLayout) {
        if (appBarLayout == null) {
            return;
        }
        vf.a aVar_r7 = new vf.a(appBarLayout);
        this.c1 = aVar_r7;
        j(aVar);
    }

    public final void v0(List list, boolean z, boolean z2) {
        l7.c cVar;
        com.github.rudroid.views.listemptystate.e eVar = this.d1;
        p81.a aVar_r7 = this.g1;
        if (z) {
            this.e1 = new i();
            if (z2) {
                aVar_r7 = this.f1;
            }
            cVar = new l7.c(aVar_r7, x61.m.l0(x61.m.l0(d0Shadow.n(eVar), list), d0Shadow.n(this.e1)));
        } else {
            this.e1 = null;
            cVar = new l7.c(aVar_r7, x61.m.l0(d0Shadow.n(eVar), list));
        }
        setConcatAdapter(cVar);
        setAdapter(getConcatAdapter());
    }

    public static Object n(Object... a) {
        return null;
    }

    public static Object j(Object... a) {
        return null;
    }

    public static Object setAdapter(Object... a) {
        return null;
    }

    public static Object setVisibility(Object... a) {
        return null;
    }
}
