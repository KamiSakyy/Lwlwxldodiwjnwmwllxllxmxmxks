package com.github.rudroid.shortcuts.activities;

import com.github.rudroid.views.listemptystate.a;
import com.github.rudroid.views.refreshableviews.SwipeRefreshUiStateRecyclerView;
import java.util.List;

@c71.e(c = "com.github.rudroid.shortcuts.activities.ShortcutsOverviewFragment$observeViewModel$1", f = "ShortcutsOverviewFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class y0 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ ShortcutsOverviewFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ShortcutsOverviewFragment shortcutsOverviewFragment, a71.c cVar) {
        super(2, cVar);
        this.w = shortcutsOverviewFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        y0 y0Var = new y0(this.w, cVar);
        y0Var.v = obj;
        return y0Var;
    }

    public final Object s(Object obj, Object obj2) {
        y0 r = r((a71.c) obj2, (fl.f) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        fl.f fVar = (fl.f) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        ShortcutsOverviewFragment shortcutsOverviewFragment = this.w;
        com.github.rudroid.shortcuts.d0 d0Var = shortcutsOverviewFragment.I0;
        if (d0Var == null) {
            k71.k.m("dataAdapter");
            throw null;
        }
        x61.r rVar = (List) fVar.b;
        if (rVar == null) {
            rVar = x61.r.r;
        }
        d0Var.k.y(rVar, com.github.rudroid.shortcuts.d0.m[0]);
        SwipeRefreshUiStateRecyclerView swipeRefreshUiStateRecyclerView = shortcutsOverviewFragment.B4().Q;
        k.i g4 = shortcutsOverviewFragment.g4();
        com.github.rudroid.views.listemptystate.a.Companion.getClass();
        swipeRefreshUiStateRecyclerView.r(fVar, g4, null, a.C0021a.b);
        return w61.a0.a;
    }
}
